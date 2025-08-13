package other;

import java.util.Scanner;
import other.model.Mahasiswa;
import other.service.MahasiswaService;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MahasiswaService service = new MahasiswaService();
        int pilihan;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("IPK: ");
                    double ipk = scanner.nextDouble();
                    service.tambahMahasiswa(new Mahasiswa(nama, nim, ipk));
                    break;
                case 2:
                    service.tampilkanMahasiswa();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
