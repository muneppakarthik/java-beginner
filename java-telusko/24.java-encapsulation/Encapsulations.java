class   Encapsulations{
    public static void main(String args[]){
        Mobile obj = new Mobile();
        obj.setAge(26);
        obj.setName("Karthik");
        
        System.out.println(obj.getName() + " : " + obj.getAge());
    };
};

class Mobile{
    private String name;
    private int age;

    public void setAge(int a){
       age = a; 
    };
    public int getAge(){
        return age;
    };

    public void setName(String n){
        name = n;
    };
    public String getName(){
        return name;
    };
}