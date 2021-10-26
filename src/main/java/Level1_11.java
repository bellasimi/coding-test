import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Level1_11 {
    public static void main(String []args){
        int [] arr ={4,3,2,1};
        int [] arr3 ={-1};
        ArrayList<Integer> arr2 = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        int index = arr2.indexOf(Collections.min(arr2));
        arr2.remove(index);
        int [] arr4 =arr2.stream().mapToInt(i->i).toArray(); //https://jeanette.tistory.com/155

        if(arr.length>2){

            System.out.println(Arrays.toString(arr4));
        }
        else{
            System.out.println(arr3);
        }

    }
}
