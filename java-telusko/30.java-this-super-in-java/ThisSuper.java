class ThiSuper{
    public static void main(String args[]){
        // B obj = new B(5); //patameter constructor
        B obj1 = new B(3); // default constructor
    };
};

class A{
    public A(){
        System.out.println("IN A");
    };

    public A(int a){
        System.out.println("IN parameter A");
    };
};

class B extends A{
    public B(){
        // super(100);
        System.out.println("IN B");
    };

    public B(int a){
        // super(a);
        this();
        System.out.println("IN parameter B");
    };
};