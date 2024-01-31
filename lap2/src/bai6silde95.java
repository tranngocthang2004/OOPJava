import java.util.Scanner;

public class bai6silde95 {
    public static void main(String[] args) {
        int a;
        long giaithua=1;
        Scanner sc = new Scanner(System.in);
        do{ System.out.print("nhap so nguyen duong : ");
        a= sc.nextInt();}while (a<=0) ;
        for(int i= 1;i<= a ;i++){
            giaithua =giaithua * i;
        }
        System.out.print("giai thu cua so vua nhap la: "+ giaithua);
    }
}
