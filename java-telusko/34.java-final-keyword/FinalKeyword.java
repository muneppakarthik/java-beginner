class FinalKeyword{
    public static void main(String args[]){
        final int num = 10;
        // num = 20; can't re-assign values with final keyword
        System.out.println(num);

        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(10,7);
    };
};

class Calc{
    final public void show(){
        System.out.println("Author is Thanush");
    };
    public void add(int a, int b){
        System.out.println(a+b);
    };
}

class AdvCalc extends Calc{
    // public void show(){
    //     System.out.println("Author is Kushi");
    // };
    // show method we can't override because final keyword is added
}