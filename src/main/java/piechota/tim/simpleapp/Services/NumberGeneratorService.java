package piechota.tim.simpleapp.Services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NumberGeneratorService {
    public List<Double> generateNumbers(int number);
}
