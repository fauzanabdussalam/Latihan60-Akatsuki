/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan60.akatsuki;

/**
 *
 * @author User
 */
public class Sharingan extends Mata
{
    public Sharingan(String nama, String desa)
    {
        super(nama, desa);
    }
    
    public void tampilkanData()
    {
        System.out.println("Nama \t\t : " + getNama());
        System.out.println("Desa \t\t : " + getDesa());
        System.out.println("Kekuatan Mata \t : Sharingan");
    }
}
