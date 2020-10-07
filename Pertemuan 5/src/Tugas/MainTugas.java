/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Nada Alya
 */
public class MainTugas {

    public static void main(String[] args) {

        Dosen d1 = new Dosen();
        d1.setNama("Nada Alya");
        d1.setSKS(14);

        Pegawai p1 = new Pegawai();
        p1.setNama("Zhabiyan Wahyu");

        DaftarGaji daftarGaji = new DaftarGaji(3);
        daftarGaji.addPegawai(d1);
        daftarGaji.addPegawai(p1);
        daftarGaji.printSemuaGaji();
    }
}
