import java.util.Comparator;
import java.util.List;

public class Sort implements Comparator<Sort> {
    private int num;
    public int[]sort(){
        return null;
    }
   

    public Sort() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "num=" + num +
                '}';
    }

    public Sort(int num) {
        this.num = num;
    }


    @Override
    public int compare(Sort o1, Sort o2) {
        return o1.getNum()-o2.getNum();
    }
}
