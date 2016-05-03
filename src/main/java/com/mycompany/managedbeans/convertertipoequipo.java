/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managedbeans;

import com.mycompany.electroeci.TipoEquipo;
import static com.mycompany.managedbeans.SystemManageBean.getAllsequipos;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author oscar
 */
@FacesConverter("equipoconverter")
public class convertertipoequipo implements Converter{
    private Object res;
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
       if(value != null && value.trim().length() > 0) {
            try {
                System.out.println("EL VALOR ES: "+value);
               
                for (int i = 0; i < getAllsequipos().size(); i++) {
                    if(getAllsequipos().get(i).getModelo().equals(value)){
                        System.out.println("concordo con: "+getAllsequipos().get(i).toString());
                         res =getAllsequipos().get(i);
                        
                    }
                }
                System.out.println("Coincidio con uno de la lista"+res.toString());
                
                
                
                return res;
                
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
        }
        else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if(o != null) {
            return String.valueOf(((TipoEquipo) o).getModelo());
        }
        else {
            return null;
        }
    }

}
