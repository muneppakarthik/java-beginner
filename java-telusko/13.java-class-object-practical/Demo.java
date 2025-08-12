class Demo{
    public static void main(String args[]){
        
        int num1 = 4;
        int num2 = 6;
        Calculate calc = new Calculate();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
};

class Calculate{
    int a;
    public int add(int n, int z){
       int r = n + z;
       return r; 
    }
}