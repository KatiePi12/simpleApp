package piechota.tim.simpleapp.Services;

import org.springframework.stereotype.Service;
import piechota.tim.simpleapp.Services.AverageGeneratorService;

import java.util.List;

@Service
public class AverageGeneratorServiceImpl implements AverageGeneratorService {
    @Override
    public Double generateAverage(List<Double> numberList) {
        Double average = numberList.stream().mapToDouble(val -> val).average().orElse(0.0);
        return average;
    }
}
