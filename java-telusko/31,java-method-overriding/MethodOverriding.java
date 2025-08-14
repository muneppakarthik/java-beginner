class MethodOverriding{
    public static void main(String args[]){
        B obj = new B();

        obj.show();
        obj.config();
    };
};

class A{
    public void show(){
        System.out.println("A in show");
    }

    public void config(){
        System.out.println("A in config");
    }
}

class B extends A{
    public void show(){
        System.out.println("B in show");
    }
}