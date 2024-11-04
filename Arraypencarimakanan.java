import java.util.Scanner;
public class Arraypencarimakanan {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        String[] menu = {"NasiGoreng", "MieGoreng", "RotiBakar","KentangGoreng", "TehTarik", "Cappucino", "ChocolateIce"};
        String makananyangdiinput;
        System.out.println("Masukan makanan yang ingin anda cari :");
        makananyangdiinput = mlebu.next();

    for (int i=0;i<menu.length;i++){
        boolean hahaha = makananyangdiinput.equalsIgnoreCase(menu[i]);
        if(hahaha){
            System.out.println("ketemu di index ke-"+i);
            mlebu.close();
            break;
        }
    }System.out.println("Makanan Tidak ada di menu");
    }
}
