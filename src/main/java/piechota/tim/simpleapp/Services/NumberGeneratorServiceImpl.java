package piechota.tim.simpleapp.Services;

import org.springframework.stereotype.Service;
import piechota.tim.simpleapp.Services.NumberGeneratorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class NumberGeneratorServiceImpl implements NumberGeneratorService {

    @Override
    public List<Double> generateNumbers(int amount) {
        List<Double> numberList = new ArrayList<>();
        Random rand = new Random();
        double number;

        while (amount>0) {
            number = rand.nextDouble();
            numberList.add(number);
            amount--;
        }
        return numberList;
    }
}
