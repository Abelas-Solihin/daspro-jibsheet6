import java.util.Scanner ;
public class TugasJobshet6_02 {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in) ;

        String jenis ;
        int jumlah ;
        double hargaBuku = 200000;
        double diskon = 0;
        double total_harga;
        double total_diskon;

        System.out.print("Masukkan jenis buku : ");
        jenis = input.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlah = input.nextInt();

        if (jenis.equalsIgnoreCase("Kamus")){
            diskon = 0.10 ;
            if (jumlah > 2){
                diskon += 0.2 ;
            } else {

            }
        }else if (jenis.equalsIgnoreCase("Novel")){
            diskon = 0.07 ;
            if (jumlah > 3){
                diskon += 0.02 ;
            } else if ( jumlah <= 3) {
                
                diskon += 0.01 ;
            }
            
        }else if (jenis.equalsIgnoreCase("buku lain")) {
            diskon = 0.5 ;
        } {
            if (jumlah > 3){
                diskon = 0.05 ;
            } else {
                diskon += 0 ;
            }
        }
        
        total_diskon = (jumlah * hargaBuku) * diskon;
       total_harga = (jumlah * hargaBuku) - diskon ;
      

        System.out.println("Anda mendapatkan diskon sebesar : Rp " + total_diskon);
        System.out.println("Total yang harus anda bayar sebesar : Rp " + total_harga);
    }
}