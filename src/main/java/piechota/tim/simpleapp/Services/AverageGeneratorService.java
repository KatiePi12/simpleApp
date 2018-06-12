package piechota.tim.simpleapp.Services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AverageGeneratorService {
   Double generateAverage(List<Double> numberList);
}
