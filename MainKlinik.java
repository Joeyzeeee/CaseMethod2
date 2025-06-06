import java.util.Scanner;

public class MainKlinik {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        AntrianPasien antrian = new AntrianPasien();
        RiwayatTransaksi riwayat = new RiwayatTransaksi(100);

        int pilih;
        do {
            System.out.println("=-=-=-=- Sistem Antrian Klinik -=-=-=-=");
            System.out.println("1. Tambahkan Pasien ke dalam Antrian");
            System.out.println("2. Lihat List Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar Program");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
                
            }
        }

}
