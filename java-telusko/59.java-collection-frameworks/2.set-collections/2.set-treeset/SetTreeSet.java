import java.util.TreeSet;

class SetTreeSet{
    public static void main(String args[]){
        TreeSet<String> cars = new TreeSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Hyundai");
        cars.add("BMW");
        
        System.out.println(cars);
    }
}