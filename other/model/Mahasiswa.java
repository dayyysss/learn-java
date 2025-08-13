package other.model;

public class Mahasiswa {
    private String nama;    
    private String nim;    
    private double ipk;    

    public Mahasiswa( String nama, String nim, double ipk ) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public double ipk() { return ipk; }

    public void setNama( String nama ) { this.nama = nama; }    
    public void setNim( String nim ) { this.nim = nim; }    
    public void setIpk( double ipk ) { this.ipk = ipk; }
    
    @Override
    public String toString() {
        return nim + " - " + nama + " (IPK: " + ipk + ")";
    }
}