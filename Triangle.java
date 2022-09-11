import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner uzunluk = new Scanner(System.in);
        System.out.println("Lütfen Üçgenin ilk kenar uzunluğunu giriniz :");
        a = uzunluk.nextDouble();
        System.out.println("Lütfen Üçgenin ikinci kenar uzunluğunu giriniz :");
        b = uzunluk.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Hipotenüs :"+c);
        System.out.println("Alan :"+alan);



    }
}
