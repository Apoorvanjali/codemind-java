import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int cp = sc.nextInt();
         int sp = sc.nextInt();
         float p;
         p = sp-cp;
         float per;
         per = (p/cp)*100;
         System.out.printf("%.2f",per);
         
    }
}