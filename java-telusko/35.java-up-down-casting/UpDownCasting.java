public class UpDownCasting{
    public static void main(String args[]){
        // double d = 4.9;
        // int i = (int) d;
        // System.out.println(i); these are type casting

        // B obj = new B();
        // obj.show1();
        // obj.show2();

        // upcasting
        A obj = new B();
        obj.show1();
        // obj.show2(); we can't use show2(), because we are refering A it doesn't know about B;

        // downcasting
        B obj1 = (B) obj; // here without creating new object refering with existed object...
        obj1.show1();
        obj1.show2();
    };
};

class A{
    public void show1(){
        System.out.println("In A");
    };
};

class B extends A{
    public void show2(){
        System.out.println("In B");
    };
};