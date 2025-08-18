import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;;

class StreamAPI{
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(3,8,1,9,7,6);

        Stream<Integer> s1 = nums.stream();

        s1.forEach(n->System.out.println(n));
        // s1.forEach(n->System.out.println(n)); stream value, we can not re-use it's will get over with onetime execution
        
        System.out.println();

        Stream<Integer> s2 = nums.stream();
        Stream<Integer> s3 = s2.filter(n-> n%2==0);
        Stream<Integer> s4 = s3.map(n-> n*2);
        int result = s4.reduce(0,(c,e)-> c+e);

        // System.out.println(s3); // stream value can read via stream api's
        // s4.forEach(n->System.out.println(n));

        System.out.println(result);
    };
};