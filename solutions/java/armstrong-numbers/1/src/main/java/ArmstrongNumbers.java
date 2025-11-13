import java.util.List;
import java.util.ArrayList;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        List<Integer> numbers = new ArrayList<>();

        for(char c : String.valueOf(numberToCheck).toCharArray()) {
            numbers.add(Character.getNumericValue(c));
        }

        int sum = 0;

        for(int i = 0 ; i < numbers.size() ; i ++){
            sum += Math.pow(numbers.get(i),numbers.size());
        }

        return(sum == numberToCheck) ? true : false;

    }

}
