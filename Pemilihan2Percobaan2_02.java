import java.util.Scanner;
public class Pemilihan2Percobaan2_02 {
    public static void main(String[] args){
        Scanner input02 = new Scanner(System.in);

        double diskon, harga, total_bayar;
        int pilihan_menu;
        String member, SystemPembayaran;

    
        System.out.println("-------------------------");
        System.out.println("===== Menu Kafe JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------");
        System.out.println("Masukkan angka dari menu yang dipilih = ");

        pilihan_menu = input02.nextInt();
        input02.nextLine();

        System.out.println("Apakah anda mempunyai member (y/n) ? = " );
        member = input02.nextLine();
        System.out.println("Apakah pembayarannya menggunakan QRIS/Tunai = ");
        SystemPembayaran = input02.nextLine();

        System.out.println("----------------------------------");
        
        if (member.equals("Y")) { 
            diskon = 0.10;
        System.out.println("Diskon 10%");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Rice Bowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = " + harga);
             {
                     
            }
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return; 
        }
    
        total_bayar = harga - (harga*diskon) ;
        System.out.println("Total bayar setelah diskon" + total_bayar);

        if (SystemPembayaran.equalsIgnoreCase("QRIS")) {

            total_bayar -= 1000;
            System.out.println("Jadi pembayaran akhirnya adalah = " + total_bayar);
        }
        
    } else if (member.equalsIgnoreCase("n")) { 
    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);

    } else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);

    } else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);

    } else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return; 
    }
    
    
    System.out.println("Total bayar = " + harga); 

    if (SystemPembayaran.equalsIgnoreCase("QRIS")) {

        harga -= 1000;
        System.out.println("Jadi pembayaran akhirnya adalah = " + harga);
    }

} else {
    System.out.println("Member tidak valid");
}

System.out.println("------------------------------");
   
    }
    }
    
