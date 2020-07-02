/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author IT
 */
public class foto {
    private Integer Id_foto;
    private notapembelian Notapembelian;
    private Double harga;
    
    public Integer getId_foto() {
        return Id_foto;
    }

    public void setId_foto(Integer Id_foto) {
        this.Id_foto = Id_foto;
    }

    public notapembelian getNotapembelian() {
        return Notapembelian;
    }

    public void setNotapembelian(notapembelian Notapembelian) {
        this.Notapembelian = Notapembelian;
    }
}
