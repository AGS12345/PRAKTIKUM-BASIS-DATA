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
public class cetak {
    private Date tanggal_cetak;
    private Date tanggal_selesai;
    
   public Date getTanggal_cetak() {
        return tanggal_cetak;
    }

    public void setTanggal_cetak(Date tanggal_cetak) {
        this.tanggal_cetak = tanggal_cetak;
    }

    public Date getTanggal_selesai() {
        return tanggal_selesai;
    }

    public void setTanggal_selesai(Date tanggal_selesai) {
        this.tanggal_selesai = tanggal_selesai;
    }
}