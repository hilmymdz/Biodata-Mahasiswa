package biodata_mahasiswa;

/**
 *
 * @author HYMDZ
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String fakultas;
    private int tahunMasuk;
    
    public Mahasiswa(String nama, String nim, String prodi, String fakultas, int tahunMasuk){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.tahunMasuk = tahunMasuk;
    }

    public String tampilkanBiodata() {
        return "Nama       : " + nama + "\n"
             + "NIM        : " + nim + "\n"
             + "Program Studi: " + prodi + "\n"
             + "Fakultas   : " + fakultas + "\n"
             + "Tahun Masuk: " + tahunMasuk;
    }
}
