/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;


import com.mycompany.electroeci.Equipo;
import com.mycompany.electroeci.Estudiante;
import com.mycompany.electroeci.Usuario;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 *
 * @author 2093130
 */
public abstract class ServiciosElectroEci {
    private static ServiciosElectroEci instance;

    /**
     * objetivo:Constructor de ServicioEci.
     * @return instancia de ServiciosElectroEciPersistencia.
     * @throws RuntimeException
     * @throws IOException 
     */
    public static ServiciosElectroEci getInstance() throws RuntimeException, IOException{
        instance = new ServiciosElectroEciPersistencia();
        return instance;
    }
    
    protected ServiciosElectroEci(){
    }
    
    
}
