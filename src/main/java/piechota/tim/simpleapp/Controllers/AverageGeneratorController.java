package piechota.tim.simpleapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import piechota.tim.simpleapp.Services.AverageGeneratorService;

import java.util.List;

@RestController
@CrossOrigin
public class AverageGeneratorController {

    AverageGeneratorService averageGeneratorService;

    @Autowired
    public AverageGeneratorController(AverageGeneratorService averageGeneratorService) {
        this.averageGeneratorService = averageGeneratorService;
    }

    @GetMapping(value = "/generateAverage/{numbers}")
    public ResponseEntity<Double> generateNumbers(@PathVariable List<Double> numbers) {
        Double average = averageGeneratorService.generateAverage(numbers);
        return new ResponseEntity<>(average, HttpStatus.OK);
    }

}
