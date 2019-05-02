import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CalcMinNumber {
    private List<Integer> list;
    private int result;
    private int index;

    CalcMinNumber(List<Integer> list){
        this.list = list;
        this.index = 0;
    }

    public int minNumberNotResursive() throws MyException{
        try{
            return this.result = list.stream().mapToInt(v->v).min().orElseThrow(NoSuchElementException::new);
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}
    }

    public int minNumberResursive() throws MyException{
        try{
            if(this.index == 0){
                this.result = list.get(this.index);
            }
            if(this.result > list.get(this.index)) {
                this.result = list.get(this.index);
            }
            if (this.index < this.list.size() - 1){
                this.index++;
                return this.minNumberResursive();
            }
            return this.result;
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}
    }
}
