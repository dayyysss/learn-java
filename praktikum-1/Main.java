
public class Main {

    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.merk = "Toyota";
        m.tahun = 2020;
        m.info();
    }
}

class Mobil {

    String merk;
    int tahun;

    void info() {
        System.out.println("Mobil " + merk + " keluaran " + tahun);
    }
}

// int umur = 21;
// double tinggi = 170.5;
// char inisial = 'F';
// boolean mahasiswa = true;
// String nama = "Ferdi";

// Operator
// Matematika: +, -, *, /, %
// Perbandingan: ==, !=, <, >, <=, >=
// Logika: &&, ||, !
