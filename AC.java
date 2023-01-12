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
public class AC implements interfaceAC{
    int statusAC;
    
    public void hidupkan(){
	if (statusAC == Mati){
            statusAC = Hidup;
            System.out.println("Hidupkan Dong ACnya, iya Udah");
	}else{
            System.out.println("Hidupkan ACnya Buruan, Sudah Hidup ACnya Sayang");}
	}

    public void matikan(){
	if (statusAC == Hidup){
            statusAC = Mati;
            System.out.println("Matikan Dong Ac nya, Udah Mati");
	}else{
            System.out.println("Matikan ACnya Buruan, Sudah Mati ACnya Sayang");
	}
    }

}