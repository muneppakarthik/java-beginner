class DynamicMethodDispatch{
    public static void main(String args[]){
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}

class A{
    public void show(){
        System.out.println("in a");
    }
}

class B extends A{
    public void show(){
        System.out.println("in b");
    }
}

class C extends A{
    public void show(){
        System.out.println("in c");
    }
}