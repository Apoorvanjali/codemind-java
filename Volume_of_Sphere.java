import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float a=sc.nextFloat();
        float b=(1.333333f)*(a*a*a*3.14f);
        System.out.printf("%.2f",b);
    }
}