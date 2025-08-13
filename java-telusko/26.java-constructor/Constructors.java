class Constructors{
    public static void main(String args[]){
        Human obj = new Human();
        // obj.setName("Karthik");
        // obj.setAge(26);
        System.out.println(obj.getName() + " : " + obj.getAge());
    };
};

class Human{
    private String name;
    private int age;

    public Human(){
        age = 12;
        name = "John";
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