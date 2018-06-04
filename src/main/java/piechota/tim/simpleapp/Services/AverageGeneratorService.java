package piechota.tim.simpleapp.Services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AverageGeneratorService {
    public Double generateAverage(List<Double> numberList);
}
