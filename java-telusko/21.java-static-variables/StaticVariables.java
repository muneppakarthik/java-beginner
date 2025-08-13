class StaticVariables{
    public static void main(String args[]){
        Model obj1 = new Model();

        obj1.brand = "Apple";
        obj1.price = 1000;
        Model.name = "SmartPhone1";

        Model obj2 = new Model();

        obj2.brand = "Samsung";
        obj2.price = 1500;
        Model.name = "SmartPhone2";

        Model.name = "Phone";

        System.out.println(obj1.name);
        System.out.println(obj2.name);
        obj1.show();
        obj2.show();
    };
};

class Model{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + ": " + price + ": " + name);
    }
}