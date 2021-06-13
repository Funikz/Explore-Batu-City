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
public class loginout extends KotaBatu{
    //Keperluan Login & Logout
    private String email;
    private String userid;
    private String pass;
    private String Keluar;

    public String getEmail() {    
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getKeluar() {
        return Keluar;
    }

    public void setKeluar(String Keluar) {
        this.Keluar = Keluar;
    }
    
    @Override
    public void simpandata (String email, String userid, String pass) {
        fungsiquery = "insert into userole (email,username,password) values (?,?,?)";
        try {
            fungispsmt = fungsikoneksi.prepareStatement(fungsiquery);
            fungispsmt.setString(1, email);
            fungispsmt.setString(2, userid);
            fungispsmt.setString(3, pass);
            fungispsmt.executeUpdate();
            fungispsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
