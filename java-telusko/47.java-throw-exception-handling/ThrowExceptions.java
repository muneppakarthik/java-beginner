class ThrowExceptions{
    public static void main(String args[]){
        int i = 20;
        int j = 0;
        try{
            j = 18/i;
            if(j==0) throw new ArithmeticException("Just customr error mesage passing.");

        }catch(ArithmeticException e){
            System.out.println("Thats the default output." + e);
        }catch(Exception e){
            System.out.println("Something went wrong." + e);
        };

        System.out.println(j);
        System.out.println("Bye...");
    }
};