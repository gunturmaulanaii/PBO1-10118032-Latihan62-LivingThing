/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan62.livingthing;

/**
 *
 * @author Guntur Maulana I
 * NAMA  : Guntur Maulana Ibrahim
 * KELAS : IF 1
 * NIM   : 10118032
 * Deskripsi Program : Membuat tampilan override abstract.
 */
public class PBO110118032Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Human human = new Human();
        human.setNama("Guntur Maulana Ibrahim");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
    }
    
}
