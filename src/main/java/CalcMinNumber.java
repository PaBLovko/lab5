import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CalcMinNumber {

    public static int minNumberNotResursive(List<Integer> list) throws MyException{
        if(list.isEmpty()){
            throw new MyException(ErrorCode.NotFindElem);
        }
        return list.stream().mapToInt(v->v).min().orElseThrow(NoSuchElementException::new);
    }

    public static int minNumberResursive(List<Integer> list, int index, int result) throws MyException{
        if(list.isEmpty()){
            throw new MyException(ErrorCode.NotFindElem);
        }
        if(index == 0){
            result = list.get(index);
        }
        if(result > list.get(index)) {
            result = list.get(index);
        }
        if (index < list.size() - 1){
            return minNumberResursive(list, ++index, result);
        }
        return result;
    }
}
