import java.util.Scanner;
public class SearchNilai10 {
    public static void main(String[] args) {
        //mempersiapkan dan deklarasi
        int key =0,banyaknilaiuser=0;
        boolean ketemu=false;
        Scanner mlebu = new Scanner(System.in);
        
        //proses input dari user untuk mencari tau nilai yang ingin dimasukan dan banyaknya nilai yang akan dimasukan
        do{
        System.out.print("Ingin berapa kali memasukan nilai? :");
        banyaknilaiuser = mlebu.nextInt();
        //cek apakah yang dimasukan angka positif
        if(banyaknilaiuser>0){
            System.out.println("Anda ingin memasukan nilai sebanyak "+banyaknilaiuser+" kali");
            break;
        }else{
            System.out.println("Masukan angka yang benar");
        }
        }while(true);
        //memasukan panjang array berdasar dari imput user
        int[] allnilai = new int[banyaknilaiuser];

        //mulai memasukan setiap nilai dari mahasiswa
        for (int i=0;i<banyaknilaiuser;i++){
            System.out.print("Masukan nilai Mahasiswa ke-"+(i+1)+":");
            allnilai[i] = mlebu.nextInt();
        }
        System.out.print("Nilai berapa yang ingin dicari? :");
        key = mlebu.nextInt();

        for(int i=0;i<allnilai.length;i++){
            if(key == allnilai[i]){
                System.out.println("Ketemu di index ke-"+i);
                ketemu = true;
                break;
            }
            else{
                System.out.println("membaca index ke-"+i);
            }
        }
        if (ketemu==false){
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        mlebu.close();
    }
}
