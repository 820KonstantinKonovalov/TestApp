package K820Test.restapp.model;

import java.util.List;

public class PhraseMetric {

    private Integer id;
    private  String phrase;
    private List<LetterBase> letters;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public List<LetterBase> getLetters() {
        return letters;
    }

    public void setLetters(List<LetterBase> letters) {
        this.letters = letters;
    }
}
