/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegiatanseharihari;

/**
 *
 * @author UmumPRT
 */
public class KegiatanSehariHari implements interfaceKegiatan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myText = "Mari bangun pagi untuk memersiapkan kuliah\n"
                + "Kemudian Sarapan Dengan Secukupnya\n"
                + "Lanjut Mandi dan Berangkat kemudian lanjut sesuai yang kamu lalukan\n";
        interfaceKegiatan.Cetak(myText);
    }
    
}
