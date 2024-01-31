import java.util.Scanner;

public class bai1silde92 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
    System.out.print("nhap so thu nhat: ");
    m=sc.nextInt();
    System.out.print("nhap so thu hai: ");
    n=sc.nextInt();
    System.out.println("hieu so thu nhat tru so thu hai la: "+(m-n));
    System.out.println("hieu so thu hai tru so thu nhat la: "+(n-m));
    System.out.println("tong hia so la: "+(m+n));
    System.out.println("tich hai so la: "+(m*n));
    System.out.println("thuong so thu nhat chia so thu hai la: " + m/n);
    }
}
