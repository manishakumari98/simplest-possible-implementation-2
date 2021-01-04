package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int number) {
        List<Integer> primeFactors=new ArrayList<>();
        if(isEqualToOne(number)){
            return primeFactors;
        }

        primeFactors.add(2);
        return primeFactors;
    }

    private boolean isEqualToOne(int number) {
        return number == 1;
    }
}
