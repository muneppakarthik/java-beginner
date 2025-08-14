public class Inheritances{
    public static void main(String args[]){
        // Calc obj = new Calc();
        VeryAdvanceCalc obj = new VeryAdvanceCalc();

        int r1 = obj.add(4, 6);
        int r2 = obj.sub(5, 2);
        int r3 = obj.multi(5, 2);
        int r4 = obj.div(5, 2);
        double r5 = obj.power(5, 2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    };
};