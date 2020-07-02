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
public class notapembelian {
    private Integer Id_notapembelian;
    private admin Admin;
    private Date tanggal;
    private Number no_nota; 
    
    public Integer getId_notapembelian() {
        return Id_notapembelian;
    }

    public void setId_notapembelian(Integer Id_notapembelian) {
        this.Id_notapembelian = Id_notapembelian;
    }

    public admin getAdmin() {
        return Admin;
    }

    public void setAdmin(admin Admin) {
        this.Admin = Admin;
    }
}
