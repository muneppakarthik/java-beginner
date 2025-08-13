class ThisKeyWord{
    public static void main(String args[]){
        Human obj = new Human();
        // obj.setName("Karthik");
        // System.out.println(obj.getAge() + " : " + obj.getName());
        obj.setName("Muneppa",obj);
        obj.setAge(27);
        System.out.println(obj.getAge() + " : " + obj.getName());

    };
};

class Human{
    private String name;
    private int age;

    // public void setName(String n){
    //     name = n;
    // };
    public void setName(String name, Human obj){
        // name = name; will get error so this ways
        Human obj1 = obj;
        obj1.name = name;
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