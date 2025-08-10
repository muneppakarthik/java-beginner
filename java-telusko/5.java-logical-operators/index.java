class LogicalOperators{
    public static void main(String args[]){
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // boolean result = x>y && a>b; // false
        // boolean result = x>y && a<b; // true

        boolean result = x>y || a>b; // true

        // System.out.println(result);
        System.out.println(!result);
    }
}