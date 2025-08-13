class StaticMethod{
    public static void main(String args[]){
        Mobile obj = new Mobile();

        obj.brand = "Apple";
        obj.price = 1000;
        Mobile.name = "SmartPhone1";

        Mobile obj1 = new Mobile();

        obj1.brand = "Samsung";
        obj1.price = 1500;
        Mobile.name = "SmartPhone2";

        // System.out.println(obj.name);
        // System.out.println(obj1.name);
        Mobile.show1(obj);
        Mobile.show1(obj1);
    };
};

class Mobile{
    String brand;
    int price;
    static String name;

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
};