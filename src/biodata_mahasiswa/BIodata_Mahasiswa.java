/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biodata_mahasiswa;


/**
 *
 * @author HYMDZ
 */
public class BIodata_Mahasiswa {

    public static void main(String[] args) {
         KelasMahasiswa kelasTI = new KelasMahasiswa("Teknik Informatika 2023");
        
        // Tambahkan contoh mahasiswa
        kelasTI.tambahMahasiswa(new Mahasiswa(
            "Budi Santoso", 
            "TI001", 
            "Teknik Informatika", 
            "FTI", 
            2023
        ));
        
        // Tampilkan data di console
        System.out.println("Daftar Mahasiswa:");
        kelasTI.tampilkanSemuaBiodata();

        // Jalankan GUI
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame(kelasTI).setVisible(true);
        });
    }
    
}
    