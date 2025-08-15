class AbstractClass{
    public static void main(String args[]){
        Car obj = new Tata();

        obj.drive();
        obj.palayMusic();

        Tata obj1 = (Tata) obj;
        obj1.stopMusic();
    };
};

abstract class Car{
    public abstract void drive();

    public void palayMusic(){
        System.out.println("Music playing...");
    };
};

class Tata extends Car{
    public void drive(){
        System.out.println("Driving...");
    };

    public void stopMusic(){
        System.out.println("Music Stoped...");
    };  
};