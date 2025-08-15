class LambdaExpression{
    public static void main(String args[]){
        // A obj = (int a)-> System.out.println("in show " + a);
        // A obj = (a)-> System.out.println("in show " + a);
        A obj = a-> System.out.println("in show " + a);

        obj.show(5);

        // lambda expression with return

        B obj1 = (a, b)-> a + b;

        int result = obj1.add(5,45);

        System.out.println("result : " + result);
    };
};

interface A{
    void show(int a);
};

interface B{
    int add(int a, int b);
}