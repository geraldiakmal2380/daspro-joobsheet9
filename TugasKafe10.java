import java.util.Scanner;
public class TugasKafe10 {
    public static void main(String[] args) {
        String makanan[] = {"nasigoreng","miegoreng","tahugodogsaostomat","rotibakar","Andre"};
        double harga[] = {9000,6000,5000,12000,9000};
        int pilihanmenu,taotalharga=0,y,z;
        Scanner mlebu = new Scanner(System.in);
        //array yg disimpan
        int yangdisimpan[] = new int[99];

        //bagian bawah coy
        for (int i=0;i<yangdisimpan.length;i++){//loop seluruh kode
            System.out.print("ini perulangan ke-"+i);
        while (true){//pengulangan sebgian baris sampai pilihan benar
        System.out.println("Selamat datang di restoran");
        System.out.println("Silahkana masukan pesanan anda");
        System.out.println("1.Nasigoreng\n2.miegoreng\n3.tahu godog saos tomat \n4.rotibakar\n5.Andre\n6.Keluar");
        System.out.print("Masukan pilihan (1/2/3/4/5/6) :");
        pilihanmenu = mlebu.nextInt();
        pilihanmenu--;
        System.out.print(pilihanmenu);
        yangdisimpan[i] = pilihanmenu;
        //apabila angka yang anda pilih adalah 6 maka akan keluar dan print list yang dipesan
        if (pilihanmenu==0||pilihanmenu==1||pilihanmenu==2||pilihanmenu==3||pilihanmenu==4){
            System.out.println("Anda memesan "+makanan[pilihanmenu]);
            System.out.println("========================");
            break;
        }
        else if (pilihanmenu==5){
            System.out.println("Terimakasih telah memesan makanan di restoran");
            System.out.println("Berikut adalah list pesanan anda :");
            System.out.println("anda memesan makanan sebanyak "+i+" kali berupa :");
            //print pesanan yang telah di simpan
            for(int metuaeribet=0;metuaeribet<i;metuaeribet++){
                y=yangdisimpan[metuaeribet];
                z=yangdisimpan[metuaeribet];
                System.out.println(makanan[z]+"dengan harga "+harga[y]);
                taotalharga += harga[yangdisimpan[metuaeribet]];
            }
            System.out.println("dengan total harga :"+taotalharga);
            mlebu.close();
            break;
        }
        else{
            System.out.println("masukan angka yang benar!");
        }

    }
        //cek jika true maka keluar
        if (pilihanmenu==5){
            System.exit(0);
        }

        }
    }
}
