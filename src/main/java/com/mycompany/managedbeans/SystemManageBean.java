/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managedbeans;


import com.mycompany.electroeci.Equipo;
import com.mycompany.electroeci.Estudiante;
import com.mycompany.electroeci.Usuario;
import com.mycompany.services.ExcepcionServiciosSistema;
import com.mycompany.services.ServiciosElectroEci;
import com.mycompany.services.ServiciosElectroEciPersistencia;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
/**
 *
 * @author 2093130
 */


@ManagedBean (name="AdministraConsultaBean")
@SessionScoped
public class SystemManageBean implements Serializable{
    private String nombre;
    private int identificacion;
    private Date fecha;
    private int codigoEquip;
    private static ServiciosElectroEci sp;
     
    public SystemManageBean() throws ExcepcionServiciosSistema,IOException{
        //sp=new ServiciosElectroEci.getInstance();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigoEquip() {
        return codigoEquip;
    }

    public void setCodigoEquip(int codigoEquip) {
        this.codigoEquip = codigoEquip;
    }

}
