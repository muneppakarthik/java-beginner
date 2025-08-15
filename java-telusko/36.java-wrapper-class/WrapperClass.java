class WrapperClass{
    public static void main(String args[]){
        int num = 8;
        String s = "Karthik";
        // Integer i = new Integer(8); this deprecated;
        // Integer is a wrapper class
        Integer i = 10;
        Integer iv = num;
        String str = "12";
        int num2 = Integer.parseInt(str);

        System.out.println(num2 * 2);

        System.out.println(num);
        System.out.println(s);
        System.out.println(i);
        System.out.println(iv);
    }
}