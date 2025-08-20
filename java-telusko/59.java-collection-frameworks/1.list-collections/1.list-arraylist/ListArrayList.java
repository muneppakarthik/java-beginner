import java.util.ArrayList;
import java.util.Collections;

class ListArrayList{
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println();

        cars.add(0, "TATA");
        // cars.add(6, "Mahindra"); // will get error if we add morethan exited num
        System.out.println(cars);
        System.out.println();
        System.out.println(cars.get(4));
        System.out.println();
        System.out.println(cars.set(0, "Tata"));
        System.out.println();
        System.out.println(cars);
        System.out.println(cars.remove(3));
        System.out.println();
        System.out.println(cars);
        System.out.println();
        System.out.println(cars.size() + " : Size");
        System.out.println();
        // cars.clear();
        // System.out.println();
        // System.out.println(cars);

        for(int i = 0; i<cars.size(); i++){
           System.out.println(cars.get(i)); 
        };

        System.out.println();
        Collections.sort(cars);
        for(String elem : cars){
           System.out.println(elem); 
        };
        
    }
}