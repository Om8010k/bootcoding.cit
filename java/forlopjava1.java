import java.util.Scanner;

public class forlopjava1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int n = sc.nextInt();
        System.out.println("even numbers");

        for(int i= 1;i<=n;i++){
            if(i %2==0){
                System.out.print(i +"");
            }
        }
        System.out.println("\nodd numbers");
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                System.out.println();
            }

        }}}


