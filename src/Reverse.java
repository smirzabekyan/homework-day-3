import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 0; i < a; i++) {
            b=b * 10 + a % 10;
            a= a /10;
            if (a==0){
                break;
            }
        }
        System.out.println(b);
    }
}