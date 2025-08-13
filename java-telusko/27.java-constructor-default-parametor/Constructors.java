class Constructors{
    public static void main(String args[]){
        Human obj = new Human();
        Human obj1 = new Human(30, "Muneppa");
        // obj.setName("Karthik");
        // obj.setAge(26);
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    };
};

class Human{
    private String name;
    private int age;

    public Human(){ // default constructor
        age = 12;
        name = "John";
    };

    public Human(int age, String name){ //parameterized constructor
        this.age = age;
        this.name = name;
    };

    public void setName(String name){
        this.name = name;
    };
    public String getName(){
        return name;
    };

    public void setAge(int age){
        this.age = age;
    };
    public int getAge(){
        return age;
    };
};