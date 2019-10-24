/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan62.livingthing;

/**
 *
 * @author 
 * Nama     : Steven Danesswaralay
 * Kelas    : PBO2
 * Nim      : 10118078
 * Deskripsi Tugas : Living Thing
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Steven Danesswaralay");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
