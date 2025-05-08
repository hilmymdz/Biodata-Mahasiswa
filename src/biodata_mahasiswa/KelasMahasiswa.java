package biodata_mahasiswa;

import java.util.ArrayList;

/**
 *
 * @author HYMDZ
 */
public class KelasMahasiswa {
   private String namaKelas;
    private ArrayList<Mahasiswa> listMahasiswa;

    public KelasMahasiswa(String namaKelas) {
        this.namaKelas = namaKelas;
        this.listMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        listMahasiswa.add(mahasiswa);
    }

    public void tampilkanSemuaBiodata() {
        for (Mahasiswa m : listMahasiswa) {
            System.out.println(m.tampilkanBiodata());
            System.out.println("-------------------");
        }
    }
}