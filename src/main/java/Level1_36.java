import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Level1_36 {
    public static void main(String[]args){
        int[] numbers = {2,1,3,4,1};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i!=j){
                   list.add(numbers[i]+numbers[j]);
                }
            }
        }

        list.sort(Comparator.comparing(Integer::intValue));

        int[] answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));
    }
}
