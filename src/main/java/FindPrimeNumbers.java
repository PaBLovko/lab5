import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.IntPredicate;
import java.util.List;

public class FindPrimeNumbers {

    public static List<Integer> primeNumbersRecursive(List<Integer> list, int index, List<Integer> result) throws MyException{
        if(list.isEmpty()) {
            throw new MyException(ErrorCode.NotFindElem);
        }
        if(isPrime(list.get(index))){
            result.add(list.get(index));
        }
        if(index < list.size()-1){
            return primeNumbersRecursive(list,++index,result);
        }
        return result;
    }

    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }

    public static List<Integer> primeNumberNotRecursive(List<Integer> list) throws MyException{
        if(list.isEmpty()){
            throw new MyException(ErrorCode.NotFindElem);
        }
        return list.stream().filter(FindPrimeNumbers::isPrime).collect(Collectors.toList());
    }
}
