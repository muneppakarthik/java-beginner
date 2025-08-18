import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetCollection{
    public static void main(String args[]){
        // Set<Integer> nums = new HashSet<Integer>(); // HashSet method will check for duplicates
        Set<Integer> nums = new TreeSet<Integer>(); // TreeSet method will do sorting array list

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10);

        System.out.println(nums);


        for(int n : nums){
            System.out.println(n);
        }
    };
};