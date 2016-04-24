/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.electroeci.Prestamo;
import com.mycompany.persistencia.DaoFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Manuel Felipe Sanchez R.
 */
public class ServicioPersisElectroECI {
    private static ServicioPersisElectroECI inst = null;
    private final Properties prop = new Properties();
    private final DaoFactory df = null;
    private List<Prestamo> prestamos;
    private ServicioPersisElectroECI(String properties) throws IOException{
        InputStream input = null;
        input = this.getClass().getClassLoader().getResourceAsStream(properties);
        prop.load(input);
    }
    public static ServicioPersisElectroECI getInstance(String propfile){
         if (inst==null){
            try {
                inst=new ServicioPersisElectroECI(propfile);
            } catch (IOException ex) {
                throw new RuntimeException("Error on application configuration:",ex);
            }
        }        
        return inst;
    }
    
    public List<Prestamo> getPrestamos(){
        return prestamos;
    }
    public void registrarPrestamo(){
        
    }
}
