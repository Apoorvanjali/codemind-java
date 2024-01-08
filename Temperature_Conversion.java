import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f;
        f=((9.0/5.0)*c)+32;
        System.out.printf("%.2f",f);
    }
}