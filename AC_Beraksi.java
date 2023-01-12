/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac_beraksi;

/**
 *
 * @author Anang Misbakhul Khoir
 */
public class AC_Beraksi {

    public static void main(String[] args) {
    AC AcRumah = new AC();

    System.out.println("Status AC saat ini : Belum Dinyalakan");
    AcRumah.hidupkan(); //Hidupkan Lampu
    AcRumah.matikan(); //Matikan Lampu
    AcRumah.matikan(); //Matikan Lampu
    AcRumah.hidupkan(); //Hidupkan Lampu
    AcRumah.hidupkan(); //Hidupkan Lampu    
    }
    
}
