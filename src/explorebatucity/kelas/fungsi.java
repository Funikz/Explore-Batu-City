/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorebatucity.kelas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import explorebatucity.DB.koneksi;

/**
 *
 * @author Zidan
 */
public class fungsi {
    protected Connection fungsikoneksi;
    protected PreparedStatement fungispsmt;
    protected Statement fungsistat;
    protected ResultSet fungsihasil;
    protected String fungsiquery;
    
    private koneksi connection = new koneksi();
    
    protected fungsi() {
        try {
            fungsikoneksi = connection.koneksiDB();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    
    public Connection getFungsikoneksi() {
        return fungsikoneksi;
    }

    public void setFungsikoneksi(Connection fungsikoneksi) {
        this.fungsikoneksi = fungsikoneksi;
    }

    public PreparedStatement getFungispsmt() {
        return fungispsmt;
    }

    public void setFungispsmt(PreparedStatement fungispsmt) {
        this.fungispsmt = fungispsmt;
    }

    public Statement getFungsistat() {
        return fungsistat;
    }

    public void setFungsistat(Statement fungsistat) {
        this.fungsistat = fungsistat;
    }

    public ResultSet getFungsihasil() {
        return fungsihasil;
    }

    public void setFungsihasil(ResultSet fungsihasil) {
        this.fungsihasil = fungsihasil;
    }

    public String getFungsiquery() {
        return fungsiquery;
    }

    public void setFungsiquery(String fungsiquery) {
        this.fungsiquery = fungsiquery;
    }
    
    public ResultSet tampildata() {
        return fungsihasil;
    }
    
    public void simpandata (String a, String b, String c) {
        
    }
    public void simpandata (String a, String b, String c, String d) {
        
    }
    public void simpandata (String a, String b, String c, String d, int e) {
        
    }
    public void simpandata (String a, String b, String c, String d, int e, String f) {
        
    }
    public void ubahdata (String a, String b, String c, String d, int e, String f) {
        
    }
    public void hapusdata (String a) {
        
    }
    
}
