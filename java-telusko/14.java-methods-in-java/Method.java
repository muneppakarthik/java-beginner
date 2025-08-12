class Methods {
    public static void main(String args[]){
        Computer obj = new Computer();
        obj.playMusic();
        String pen = obj.getPen(11);
        System.out.println(pen);
    };
};

class Computer {
    public void playMusic(){
        System.out.println("Playing music...!");
    };

    public String getPen(int price){
        if(price >= 10)
            return "Pen";
        return "Nothing...";
    };
};