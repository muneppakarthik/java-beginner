import java.util.Scanner;

class UserInput{
    public static void main(String args[]){
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
    }
}