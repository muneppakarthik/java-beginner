class EnumClass{
    public static void main(String args[]){
        // Laptop s = Laptop.Mackbook;
        // System.out.println(s);
        // System.out.println(s.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    };


};

enum Laptop{
    Mackbook(2000), XSP(1000), Surface, Thinkpad(4000);

    private int price;

    private Laptop(){
    };
    private Laptop(int price){
        this.price = price;
    };

    public int getPrice(){
        return price;
    }
}