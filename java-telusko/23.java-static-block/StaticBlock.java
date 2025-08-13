class StaticBlock{
    public static void main(String args[]){
        Mobile obj1 = new Mobile();


        Mobile obj2 = new Mobile();

    };
};

class Mobile{
    String brand;
    int price;
    static String name;
    // static block
    static {
        name = "Phone";
        System.out.println(name);
    };

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
    };
}