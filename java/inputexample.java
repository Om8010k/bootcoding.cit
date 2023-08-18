import java.util.Scanner;
public class inputexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n = sc.nextInt();
        System.out.println("enter second number");
        int m = sc.nextInt();


        int add= n+m;
        System.out.println("addition=" + add);
        int sub = n-m;
        System.out.println("substraction=" +sub);
         int div =n/m;
        System.out.println("division =" +div);
        int mul =n*m;
        System.out.println("multiplicstion=" +mul);
        int mod =n%m;
        System.out.println("modules=" +mod +"."  );


    }



    }
