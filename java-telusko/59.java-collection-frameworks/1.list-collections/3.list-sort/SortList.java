import java.util.LinkedList;
import java.util.Collections;

class SortList{
    public static void main(String args[]){
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

    //    Collections.sort(cars);
       Collections.sort(cars, Collections.reverseOrder());

       System.out.println(cars);
        
    }
}