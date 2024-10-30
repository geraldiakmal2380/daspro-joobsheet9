import java.util.Scanner;
public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        int nilaiMhs[] = new int[10];
        double total=0,rata2=0,totalnilailulus=0,totalnilaitidaklulus=0;
        int jumlahlulus =0,jumlahtidaklulus=0;
        //input nilai mahasigma
        for (int i=0;i<nilaiMhs.length;i++){
            System.out.print("Masukan nilai Mahasiswa ke-"+(i+1)+" :");
            nilaiMhs[i] = mlebu.nextInt();
        }
        //pengecekan jumlah lulus
        for (int i=0;i<nilaiMhs.length;i++){
            
        }
        //menjumlahkan semua nilai
        for (int i=0;i<nilaiMhs.length;i++){
            total += nilaiMhs[i];
            //mengkatogerikan nilai lulus dan tidak lulus
            if(nilaiMhs[i]>70){
                jumlahlulus++;
                totalnilailulus += nilaiMhs[i];
            }
            else{
                jumlahtidaklulus++;
                totalnilaitidaklulus += nilaiMhs[i]; 
            }
        }
        //operasi matematika menghitung rata-rata
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai ="+rata2);
        System.out.println("Jumlah Mahasiswa lulus adalah "+jumlahlulus);
        System.out.println("Jumlah Mahasiswa tidak lulus adalah "+jumlahtidaklulus);
        System.out.println("Rata-rata nilai lulus adalah "+totalnilailulus/jumlahlulus);
        System.out.println("Rata-rata nilai lulus adalah "+totalnilaitidaklulus/jumlahtidaklulus);
        mlebu.close();
    }
}
