class InterFaces{
    public static void main(String args[]){
        A obj = new B();

        obj.show();
        obj.config();

        // obj.age = 27; // we can not re-assign value because it's final value
        System.out.println(obj.age);
        System.out.println(A.name); // we can use name variable with type reference, because it's static by default
    };
};

interface A{ // interface is not a class
    int age = 10; // by default variables are final and static
    String name = "Karthik";
    // public abstract void show(); // by default interface methods are public and abstract
    // public abstract void config(); // by default interface methods are public and abstract
    void show();
    void config();
};

class B implements A{
    public void show(){
        System.out.println("In show");
    };

    public void config(){
        System.out.println("In config");
    };
};