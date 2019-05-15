import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.IntPredicate;
import java.util.List;

public class FindPrimeNumbers {
    private List<Integer> list;
    private List<Integer> result = new ArrayList<Integer>();
    private int index;

    FindPrimeNumbers(List<Integer> list)throws MyException{
        try {
            if(list.isEmpty()){
                throw new NoSuchElementException();
            }
            this.list = list;
            this.index = 0;
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}

    }

    public List<Integer> primeNumbersRecursive() throws MyException{
        try{
            if(isPrime(this.list.get(index))){
                this.result.add(list.get(index));
            }
            if(this.index < this.list.size()-1){
                this.index++;
                return this.primeNumbersRecursive();
            }
            return this.result;
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}

    }

    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }

    public List<Integer> primeNumberNotRecursive() throws MyException{
        try{
            return this.result = list.stream().filter(FindPrimeNumbers::isPrime).collect(Collectors.toList());
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}
    }
}
