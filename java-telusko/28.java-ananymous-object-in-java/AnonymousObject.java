class AnonymousObject{
    public static void main(String args[]){
        Human obj = new Human(); // reference object
        obj.show();

        new Mobile().show(); // anonymous object
        new Mobile().show(); // anonymous object if we create new oject again same out put will be executed!

    };
};

class Human{
    public Human(){
        System.out.println("Constructor i am!");
    };
    public void show(){
        System.out.println("I am from show method!");
    };
};

class Mobile{
    public Mobile(){
        System.out.println("Anouymous Constructor i am!");
    };
    public void show(){
        System.out.println("Anouymous I am from show method!");
    };
};