class AnonymousInnerClass{
    public static void main(String args[]){
        // A obj = new B();
        A obj = new A(){ // anonymous inner class, if we create like it will not go to A class. mean original class
            public void show(){
                System.out.println("New sow");
            };
        };
        obj.show();
    };
};

class A{
    public void show(){
        System.out.println("In A show");
    };
};

// class B extends A{
//     public void show(){
//         System.out.println("In B show");
//     };
// };