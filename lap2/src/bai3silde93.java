import java.util.Scanner;

public class bai3silde93 {
    public static void main(String[] args) {
        String ten;
        int tuoi ;
    Scanner sc= new Scanner(System.in);
    System.out.println(" nhap ten:");
    ten=sc.nextLine();
    System.out.println(" nhap tuoi: ");
    tuoi = sc.nextInt();
    if(tuoi<16){
        System.out.println("ban "+ ten+ " o do tuoi vi thanh nien ");
    }
    else if(tuoi>=16 && tuoi <18){
        System.out.println(" ban "+ ten+ "o do tuoi truong thanh");
    }
    else {
        System.out.println("ban "+ ten +"da gia");
    }
    }
}
