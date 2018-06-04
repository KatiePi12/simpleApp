package piechota.tim.simpleapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import piechota.tim.simpleapp.Services.NumberGeneratorService;

import java.util.List;

@RestController
@CrossOrigin
public class NumberGeneratorController {

    NumberGeneratorService numberGeneratorService;

    @Autowired
    public NumberGeneratorController(NumberGeneratorService numberGeneratorService) {
        this.numberGeneratorService = numberGeneratorService;
    }

    @GetMapping(value = "/generateNumbers/{amount}")
    public ResponseEntity<List<Double>> generateNumbers(@PathVariable int amount) {
        List<Double> numberList = numberGeneratorService.generateNumbers(amount);
        return new ResponseEntity<>(numberList, HttpStatus.OK);
    }
}
