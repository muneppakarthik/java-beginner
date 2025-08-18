import java.util.List;
import java.util.Arrays;

class ForEachAPI{
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(3,8,1,9,7,6);

        nums.forEach(n->System.out.println(n));
    };
};