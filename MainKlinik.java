import java.util.Scanner;

public class MainKlinik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            switch (pilih) {
                case 1: {
                    System.out.print("Nama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("NIK: ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = sc.nextLine();
                    Pasien a = new Pasien(nama, nik, keluhan);
                    antrian.tambah(a);
                    System.out.println("Pasien masuk ke dalam antrian.");
                }
                    break;
                case 2: {
                    System.out.println("-=- Antrian Pasien -=-");
                    antrian.tampilkan();
                }
                    break;
                case 3: {
                    if (antrian.kosong()) {
                        System.out.println("Antrian kosong!");
                        break;
                    }
                    Pasien a = antrian.layani();
                    System.out.println("Pasien " + a.nama + " dipanggil");
                    System.out.print("Masukkan ID Dokter: ");
                    String id = sc.nextLine();
                    System.out.print("Masukkan Nama Dokter: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Durasi Layanan (jam): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Dokter d = new Dokter(id, nama);
                    TransaksiLayanan tr = new TransaksiLayanan(a, d, durasi);
                    riwayat.tambah(tr);
                    System.out.println("Pasien telah dilayani, transaksi berhasil dicatat.");
                }
                    break;
                case 4: {
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.sisa());
                }
                    break;
                case 5: {
                    System.out.println("-- Riwayat Transaksi --");
                    riwayat.tampilkan();
                }
                    break;

                case 0: {
                    System.out.println("Keluar dari sistem.");
                }
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}
