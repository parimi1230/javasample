import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(final String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        int elemToBeRemoved = 20;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == elemToBeRemoved){
                arr.remove(i);
            }
        }
        System.out.println(arr);


        //add element in position
        arr.add(2, 100);
        System.out.println("result arr"+ arr);
    }
}
