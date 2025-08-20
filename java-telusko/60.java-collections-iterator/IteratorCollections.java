// Iterator is used to loop java collections
import java.util.Iterator;
import java.util.ArrayList;

class IteratorCollections{
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Tata");
        cars.add("Mahindra");

        // get the iterator
        Iterator<String> it = cars.iterator();

        // System.out.println(it.next());
        // System.out.println(it.next());

        while(it.hasNext()){
            String i = it.next();
            if(i.equals("BMW")){
                it.remove();
            }
            // System.out.println(i);
        };

        System.out.println(cars);
    }
}