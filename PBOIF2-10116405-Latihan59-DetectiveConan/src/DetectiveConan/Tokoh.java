/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DetectiveConan;

/**
 *
 * @author Fahrih Fatahilah  
 */
class Tokoh {
     protected String nama;
    protected String peran;

    public Tokoh(String nama, String peran) {
        this.nama = nama;
        this.peran = peran;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }
    
}
