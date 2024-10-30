import java.util.Scanner;
public class ArrayNilai10 {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        int[] nilaiakhir = new int[10];

        for (int i=0;i<nilaiakhir.length;i++){
            System.out.print("Masukan nilai ke "+(i+1)+" :");
            nilaiakhir[i]= mlebu.nextInt();
        }
        for (int i=0;i<nilaiakhir.length;i++){
            if (nilaiakhir[i]>70){
                System.out.println("Mahasiswa ke-"+(i+1)+" lulus!");
            }
            else{
                System.out.println("Mahasiswa ke-"+(i+1)+" tidak lulus!");
            }
        }
        mlebu.close();
    }
}
