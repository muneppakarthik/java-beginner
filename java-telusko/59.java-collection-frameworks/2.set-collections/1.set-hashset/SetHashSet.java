import java.util.HashSet;

class SetHashSet{
    public static void main(String args[]){
        HashSet<String> cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Hyundai");
        cars.add("BMW");

        cars.remove("Volvo");
        
        System.out.println(cars);

        System.out.println(cars.contains("Ford"));
    }
}