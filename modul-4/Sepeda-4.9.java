
class Sepeda {

    int kecepatan = 0;

    void tambahKecepatan(int tambah) {
        kecepatan = kecepatan + tambah;
    }

    void kurangKecepatan(int kurang) {
        kecepatan = kecepatan - kurang;
    }

    void printTambah() {
        System.out.println("Naik Ke Kecepatan\t:" + kecepatan);
    }

    void printKurang() {
        System.out.println("Turun Ke Kecepatan\t:" + kecepatan);
    }

    public static void main(String[] args) {
        Sepeda sepedaGunung = new Sepeda();
        System.out.println("Sepeda Gunung");
        System.out.println("-------------");
        sepedaGunung.tambahKecepatan(50);
        sepedaGunung.printTambah();
        sepedaGunung.kurangKecepatan(10);
        sepedaGunung.printKurang();
    }
}
