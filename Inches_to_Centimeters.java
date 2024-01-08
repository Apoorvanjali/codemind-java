import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double cm;
        cm = i * (2.54);
         System.out.printf("%.2f",cm);
        
    }
}