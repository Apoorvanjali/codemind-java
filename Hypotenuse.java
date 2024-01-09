import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double c = sc.nextDouble();

        double b = Math.sqrt((a * a) + (c * c));

        System.out.printf("%.2f", b);
    }
}
