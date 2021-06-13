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
public class sekolah extends KotaBatu {
    
    protected String programunggulan;
    
    public String getProgramunggulan() {
        return programunggulan;
    }

    public void setProgramunggulan(String programunggulan) {
        this.programunggulan = programunggulan;
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
        fungsiquery = "select*from sekolah where namatempat=?";
        try {
            fungsistat = fungsikoneksi.createStatement();
            fungsihasil = fungsistat.executeQuery(fungsiquery);
        } catch (Exception e){
            
        } return fungsihasil;
    }
    
    @Override
    public void simpandata (String namatempat, String info, String alamat,
            String jambuka, int notelp, String programunggulan) {
        fungsiquery = "insert into sekolah (namatempat,info,alamat,jambuka,notelp,programunggulan) values (?,?,?,?,?,?)";
        try {
            fungispsmt = fungsikoneksi.prepareStatement(fungsiquery);
            fungispsmt.setString(1, namatempat);
            fungispsmt.setString(2, info);
            fungispsmt.setString(3, alamat);
            fungispsmt.setString(4, jambuka);
            fungispsmt.setInt(5, notelp);
            fungispsmt.setString(6, programunggulan);
            fungispsmt.executeUpdate();
            fungispsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void ubahdata (String namatempat, String info, String alamat,
            String jambuka, int notelp, String programunggulan) {
        fungsiquery = "update sekolah set info=?,alamat=?,jambuka=?,notelp=?,programunggulan=? where namatempat=?";
        try {
            fungispsmt = fungsikoneksi.prepareStatement(fungsiquery);
            fungispsmt.setString(6, namatempat);
            fungispsmt.setString(1, info);
            fungispsmt.setString(2, alamat);
            fungispsmt.setString(3, jambuka);
            fungispsmt.setInt(4, notelp);
            fungispsmt.setString(5, programunggulan);
            fungispsmt.executeUpdate();
            fungispsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void hapusdata (String namatempat) {
        fungsiquery = "delete from sekolah where namatempat=?";
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
