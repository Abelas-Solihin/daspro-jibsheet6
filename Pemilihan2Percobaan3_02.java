
import java.util.Scanner ;
public class Pemilihan2Percobaan3_02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in) ;

        String kategori;
        int penghasilan, gajibersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input02.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : Rp ");
        penghasilan = input02.nextInt();

        if (kategori.equals("pekerja")){
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : Rp " + gajibersih);            
        } else if (kategori.equals("pebisnis")){
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : Rp " + gajibersih);
        } else
            System.out.println("Masukan Kategori Salah ");
    }
}