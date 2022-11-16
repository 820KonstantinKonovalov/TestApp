package K820Test.restapp.service;

import K820Test.restapp.model.LetterBase;
import K820Test.restapp.model.PhraseMetric;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PhraseMetricServImp implements  PhraseMetricService{

    // DB storage emulator:
    private static final Map<Integer, PhraseMetric> PHRASE_REPOSITORY_MAP = new HashMap<>();

    // The PhraseMetric id generation variable
    private static  final AtomicInteger PHRASE_ID_HOLDER = new AtomicInteger();

    @Override
    public PhraseMetric read(String phrase) {

        char[] letters = phrase.toCharArray();
        int letterCount = 0;
        int maxSubstring = 0;
        int currentMax = 0;

        PhraseMetric phm = new PhraseMetric();
        final int phaseId = PHRASE_ID_HOLDER.incrementAndGet();
        phm.setPhrase(phrase);

        ArrayList<LetterBase> letterBases = new ArrayList<>();

        for (int i = 0; i < letters.length; i++) {
            char letter;
            letter = letters[i];
            maxSubstring = 1;
            currentMax = 1;
            letterCount = 1;

             if(!letterBases.contains(new LetterBase(letter, 0, 0))) {
                for (int j = i+1; j < letters.length; j++) {
                     if (letter == letters[j]) {
                        letterCount++;
                        currentMax++;
                     } else {
                        if (currentMax > maxSubstring) maxSubstring = currentMax;
                        currentMax = 1;
                    }
                }
                if (currentMax > maxSubstring && currentMax != 1) maxSubstring = currentMax-1;
                letterBases.add(new LetterBase(letter, letterCount, maxSubstring));
            }
        }
        phm.setLetters(letterBases);
        phm.setId(phaseId);
        PHRASE_REPOSITORY_MAP.put(phaseId, phm);
        return phm;
    }

}
