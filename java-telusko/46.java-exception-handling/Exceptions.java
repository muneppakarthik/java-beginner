class Exceptions{
    public static void main(String args[]){
        // int i = 0;
        // int j = 18/i;

        // System.out.println(j);

        // System.out.println("Bye");


        int i = 9;
        int j = 0;
        int num[] = new int[5];
        String str = null;
        try{
            j = 18/i;
            System.out.println(num[1]);
            System.out.println(num[4]);
            System.out.println(str.length());
        }catch(ArithmeticException e){
            System.out.println("Can not divide by zero.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit to access array.");
        }catch(Exception e){
            System.out.println("Something went wrong." + e);
        };

        System.out.println(j);
        System.out.println("Bye...");
    }
};

//  Exception hirarchy

// Object -> Throwable -> 1. Error
                    //    2. Exception  -> a) RuntimeException
                                //         b) SQLExceptin and etc..
// RuntimeException: 1) Arithmatic
                    //  2) ArrayIndex and more...