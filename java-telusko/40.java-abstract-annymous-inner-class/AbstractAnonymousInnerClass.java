class AbstractAnonymousInnerClass{
    public static void main(String args[]){
        // A obj = new B();
        A obj = new A(){ // abstract with anonymous inner class
            public void show(){
                System.out.println("New show");
            };
        };
        obj.show();
    };
};

abstract class A{
    public abstract void show();
};

// class B extends A{
//     public void show(){
//         System.out.println("In B show");
//     };
// };