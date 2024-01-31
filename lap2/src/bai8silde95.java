import java.util.Scanner;

public class bai8silde95 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    float tong=0;
    System.out.print("nhap so cac so nguyen: ");
    n=sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.print("so nguyen thu "+(i+1)+": ");
        int x;
        x=sc.nextInt();
        tong +=x;
    }
    System.out.print("trung binh cong cac so nguyen da nhap la: "+(tong/n ));
    }
}
