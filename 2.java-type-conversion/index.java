class Hello{
    public static void main(String args[]){
        byte by = 127;
        int sal = 135;
        // by = sal; // will get compiler error
        by = (byte) sal;
        System.out.println(by);

        float x = 5.1f;
        int marks = (int) x;

        System.out.println(marks);
    };
};
