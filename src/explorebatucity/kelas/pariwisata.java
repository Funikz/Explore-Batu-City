/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorebatucity.kelas;

import java.sql.ResultSet;

/**
 *
 * @author Zidan
 */
public class pariwisata extends KotaBatu {

    protected String keunikan;
    
    public String getKeunikan() {
        return keunikan;
    }

    public void setKeunikan(String keunikan) {
        this.keunikan = keunikan;
    }    
    
    @Override
    public void setNamatempat(String namatempat) {
        super.setNamatempat(namatempat);
    }
    
    @Override
    public void setInfo(String info) {
        super.setInfo(info);
    }
    
    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }
    
    @Override
    public void setJambuka(String jambuka) {
        super.setJambuka(jambuka);
    }
    
    @Override
    public void setNotelp(int notelp) {
        super.setNotelp(notelp);
    }
    
    @Override
    public ResultSet tampildata() {
        fungsiquery = "select*from pariwisata where namatempat=?";
        try {
            fungsistat = fungsikoneksi.createStatement();
            fungsihasil = fungsistat.executeQuery(fungsiquery);
        } catch (Exception e){
            
        } return fungsihasil;
    }
    
    @Override
    public void simpandata (String namatempat, String info, String alamat,
            String jambuka, int notelp, String keunikan) {
        fungsiquery = "insert into pariwisata (namatempat,info,alamat,jambuka,notelp,keunikan) values (?,?,?,?,?,?)";
        try {
            fungispsmt = fungsikoneksi.prepareStatement(fungsiquery);
            fungispsmt.setString(1, namatempat);
            fungispsmt.setString(2, info);
            fungispsmt.setString(3, alamat);
            fungispsmt.setString(4, jambuka);
            fungispsmt.setInt(5, notelp);
            fungispsmt.setString(6, keunikan);
            fungispsmt.executeUpdate();
            fungispsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void ubahdata (String namatempat, String info, String alamat,
            String jambuka, int notelp, String keunikan) {
        fungsiquery = "update pariwisata set info=?,alamat=?,jambuka=?,notelp=?,keunikan=? where namatempat=?";
        try {
            fungispsmt = fungsikoneksi.prepareStatement(fungsiquery);
            fungispsmt.setString(6, namatempat);
            fungispsmt.setString(1, info);
            fungispsmt.setString(2, alamat);
            fungispsmt.setString(3, jambuka);
            fungispsmt.setInt(4, notelp);
            fungispsmt.setString(5, keunikan);
            fungispsmt.executeUpdate();
            fungispsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void hapusdata (String namatempat) {
        fungsiquery = "delete from pariwisata where namatempat=?";
        try {
            fungispsmt = fungsikoneksi.prepareStatement(fungsiquery);
            fungispsmt.setString(1, namatempat);
            fungispsmt.executeUpdate();
            fungispsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
