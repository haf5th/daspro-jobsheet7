import java.util.Scanner;

public class Tugas11no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, totalTiket = 0;
        double hargaTiket = 50000;
        double totalHarga = 0, totalHargaPenjualan = 0;
        
        do {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0){
                System.out.println("Transaksi dihentikan");
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, Silakan masukkan jumlah tiket dengan benar.");
                continue;
            }
            
            if (jumlahTiket > 10) {
                totalHarga = jumlahTiket * hargaTiket * 0.85;
            } else if (jumlahTiket > 4) {
                totalHarga = jumlahTiket * hargaTiket * 0.90;
            } else {
                totalHarga = jumlahTiket * hargaTiket;
            }
            
            totalTiket += jumlahTiket;
            totalHargaPenjualan += totalHarga;
        
            System.out.println("Total harga untuk " + jumlahTiket + "tiket: Rp " + totalHarga);

        

        } while (true);
    
        System.out.println("Jumlah tiket terjual: " + totalTiket);
        System.out.println("Total harga penjualan tiket: Rp " + totalHargaPenjualan);
    }
}
