/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;

/**
 *
 * @author IT
 */
public class admin {
    private Integer Id_admin;
    private String nama_06772;
    private Number no_pelanggan;
    private String alamat;
    private String ukuran_foto;
    
    public Integer getId_admin(){
        return Id_admin;
    }
    
    public void setId_admin(Integer Id_admin) {
    this.Id_admin = Id_admin;
}
    public String getnama_06772(){
        return nama_06772;
}
    public void setnama_06772(String nama_06772) {
    this.nama_06772 = nama_06772;
}
    public Number getno_pelanggan(){
        return no_pelanggan;
}
    public void setno_pelanggan(Number no_pelanggan) {
    this.no_pelanggan = no_pelanggan;
}
    public String getalamat (){
        return alamat;
}
    public void setalamat(String alamat) {
    this.alamat = alamat;
}
    public String getukuran_foto(){
        return ukuran_foto;
}
    public void setukuran_foto(String ukuran_foto) {
    this.ukuran_foto = ukuran_foto;
    }
}