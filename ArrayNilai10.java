import java.util.Scanner;
public class ArrayNilai10 {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        int[] nilaiakhir = new int[10];

        for (int i=0;i<10;i++){
            System.out.print("Masukan nilai ke "+(i+1)+" :");
            nilaiakhir[i]= mlebu.nextInt();
        }
        for (int i=0;i<10;i++){
            System.out.println("Nilai akhir mahasiswa ke "+(i+1)+" adalah "+nilaiakhir[i]);
            mlebu.close();
        }
    }
}
