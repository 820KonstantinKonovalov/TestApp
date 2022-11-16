package K820Test.restapp.controller;

import K820Test.restapp.model.PhraseMetric;
import K820Test.restapp.service.PhraseMetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseMetricController {

    private final PhraseMetricService phraseMetricService;

    @Autowired
    public PhraseMetricController(PhraseMetricService phraseMetricService) {
        this.phraseMetricService = phraseMetricService;
    }

    @GetMapping(value = "/{phrase}")
    public ResponseEntity<PhraseMetric> read(@PathVariable(name ="phrase") String phrase) {
        final PhraseMetric tempo = phraseMetricService.read(phrase);

        return tempo != null
                ? new ResponseEntity<>(tempo, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
