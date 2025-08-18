import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

class ArrayListCollection{
    public static void main(String args[]){
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        // System.out.println(nums);

        for(Object n : nums){
            System.out.println(n);
        }


        System.out.println();
        // List

        List<Integer> numss = new ArrayList<Integer>();

        numss.add(1);
        numss.add(4);
        numss.add(8);

        System.out.println(numss.get(1));
        System.out.println(numss.indexOf(4));

        // for(Object n : nums){
        //     System.out.println(n);
        // }

    };
};