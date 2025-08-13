package other.service;

import java.util.ArrayList;
import other.model.Mahasiswa;

public class MahasiswaService {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public void tampilkanMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa){
            System.out.println(m);
        }
    }
}
