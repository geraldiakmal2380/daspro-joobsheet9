import java.util.Scanner;
public class TugasKafe10 {
    public static void main(String[] args) {
        String makanan[] = {"nasigoreng","miegoreng","tahugodogsaostomat","rotibakar","Andre"};
        double harga[] = {9000,6000,5000,12000,9000};
        int pilihanmenu,jumlahmenu;

        Scanner mlebu = new Scanner(System.in);

        do{

        System.out.println("Selamat datang di restoran");
        System.out.println("Silahkana masukan pesanan anda");
        System.out.println("1.Nasigoreng\n2.miegoreng\n3.tahu godog saos tomat \n4.rotibakar\n5.Andre\n6.keluar");
        System.out.print("Masukan pilihan (1/2/3/4/5/6) :");
        pilihanmenu = mlebu.nextInt();
        pilihanmenu--;

        //apa yang terjadi jika memilih 6
        if (pilihanmenu == 6){
            System.out.println("Anda memesan :");
            System.out.println("Anda memesan :");
            break;
        }

        System.out.print("berapa banyak?");
        jumlahmenu = mlebu.nextInt();
        System.out.println("Anda memesan "+makanan[pilihanmenu]+" dengan jumlah "+jumlahmenu);
        System.out.println("========================");



     }while (true) ;
            
    System.out.println("Transaksi selesai");
    }
}
