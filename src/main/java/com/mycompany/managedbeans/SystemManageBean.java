/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managedbeans;


import com.mycompany.electroeci.Equipo;
import com.mycompany.electroeci.Estudiante;
import com.mycompany.electroeci.Usuario;
import com.mycompany.services.ServiciosElectroEci;
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

     private static ServiciosElectroEci sp; 
     
     public SystemManageBean() throws IOException{
        //Hacer la instancia a sp=new ServiciosElectroEci.getInstance();        
    }
    
    
    
    
}
