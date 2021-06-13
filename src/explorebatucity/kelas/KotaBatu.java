/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorebatucity.kelas;

/**
 *
 * @author Zidan
 */
public class KotaBatu extends fungsi {
    
    private String namatempat;
    private String info;
    private String alamat;
    private String jambuka;
    private int notelp;

    //Getter
    public String getNamatempat() {
        return namatempat;
    }

    public String getInfo() {
        return info;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJambuka() {
        return jambuka;
    }

    public int getNotelp() {
        return notelp;
    }

    // Setter
    public void setNamatempat(String namatempat) {
        this.namatempat = namatempat;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJambuka(String jambuka) {
        this.jambuka = jambuka;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }  
}
