import java.util.LinkedHashSet;

class SetLinkedHashSet{
    public static void main(String args[]){
        LinkedHashSet<String> cars = new LinkedHashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Hyundai");
        
        System.out.println(cars);
    }
}