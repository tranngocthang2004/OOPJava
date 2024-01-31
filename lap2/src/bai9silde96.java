import java.util.Scanner;

public class bai9silde96 {
    public static void main(String[] args) {
        String chuoi= new String();
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap chuoi ky tu: ");
        chuoi=sc.nextLine();
        int demthuong=0,demhoa=0,demso=0;
        for(int i=0;i< chuoi.length();i++){ 
            if((chuoi.charAt(i)>='a')&&(chuoi.charAt(i)<+'z'))
            demthuong++;
            if((chuoi.charAt(i)>='A')&&(chuoi.charAt(i)<+'Z'))
            demhoa++;
            if((chuoi.charAt(i)>='0')&&(chuoi.charAt(i)<+'9'))
            demso++;
        }
        System.out.println("so ky tu thuong trong chuoi la: "+demthuong );
        System.out.println("so ky tu hoa trong chuoi la: "+demhoa );
        System.out.println("so ky tu so trong chuoi la: "+demso );
    }
}
