/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan60.akatsuki;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menampilkan program akatsuki
 *
 */
public class PBO10K10119901Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sharingan s = new Sharingan("Itachi Uchiha", "Konohagakure");
        s.tampilkanData();
        
        System.out.println();
        
        Rinnegan r = new Rinnegan("Pain", "Amegakure");
        r.tampilkanData();
        
        System.out.println();
        
        Normal n = new Normal("Sasori", "Sunagakure");
        n.tampilkanData();
    }
}
