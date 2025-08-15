class InnerClass{
    public static void main(String args[]){
            A obj = new A();

            obj.show();

            A.B obj1 = obj.new B();
            obj1.config();

            A.C obj2 = new A.C(); //this will help only when inner class is static
            obj2.header();
    };

};

class A{
    int age = 27;
    public void show(){
        System.out.println("In show!");
    };

    class B{
        public void config(){
            System.out.println("In config!");
        };
    };

    static class C{
        public void header(){
            System.out.println("In header!");
        };
    };
};