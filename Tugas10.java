import java.util.Scanner;
public class Tugas10 {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        int jumlahinput=0,nilaitertinggi=0,nilaiterendah=100;
        double rata2=0,totalnilai=0;
        
        //prorses input banyaknya nilai mahasigma
        System.out.print("Berapa banyak nilai mahasiswa yang ingin di input? :");
        jumlahinput = mlebu.nextInt();
        int[] nilaimahasigma = new int[jumlahinput];
        System.out.println("Anda ingin menginput nilai sebanyak "+jumlahinput);
        
        //proses input setiap nilai mahasiswa satu satu
        for (int i=0;i<nilaimahasigma.length;i++){
            System.out.print("Masukan Nilai mahasigma ke-"+(i+1)+" :");
            nilaimahasigma[i] = mlebu.nextInt();
        }
        //pemberian border
        System.out.println("=============================");

        //menampilkan nilai mahasiswa satu satu
        for (int i=0;i<nilaimahasigma.length;i++){
            System.out.println("Nilai mahasigma ke-"+(i+1)+" adalah"+" "+nilaimahasigma[i]);
        }

        //pengecekan nilai tertinggi dan terendah dan penjumlahan seluruh nilai
        for (int i=0;i<nilaimahasigma.length;i++){
            if (nilaimahasigma[i]>nilaitertinggi){
                nilaitertinggi = nilaimahasigma[i];
            }
            if (nilaimahasigma[i]<nilaiterendah){
                nilaiterendah = nilaimahasigma[i];
            }
            totalnilai += nilaimahasigma[i];
        }
        
        //mengihtung rata2
        rata2 = totalnilai/jumlahinput;

        //print nilai tertinggi dan terendah serta rata2
        System.out.println("=============================");
        System.out.println("Nilai tertinggi "+nilaitertinggi+"\nNilai terendah "+nilaiterendah);
        System.out.println("rata2 dari nilai di atas adalah "+rata2);

        
    }
}
