package K820Test.restapp.controller;

import K820Test.restapp.model.GeneralStatistics;
import K820Test.restapp.service.GeneralStatisticsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeneralStatisticsController {

    private final GeneralStatisticsService generalStatisticsService;


    public GeneralStatisticsController(GeneralStatisticsService generalStatisticsService) {
        this.generalStatisticsService = generalStatisticsService;
    }

    @GetMapping(value = "/statistics")
    public ResponseEntity<GeneralStatistics> read() {


        return null;
    }

}
