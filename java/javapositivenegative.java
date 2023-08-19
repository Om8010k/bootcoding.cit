import java.util.Scanner;

public class javapositivenegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name");
        int x = sc. nextInt();
        if(x>0){
            System.out.println("number is positive");
        }
        else {
            System.out.println("number is negative");
        }
    }
}
