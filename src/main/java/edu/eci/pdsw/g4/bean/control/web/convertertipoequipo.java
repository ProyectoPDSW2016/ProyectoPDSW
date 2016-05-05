/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.bean.control.web;

import static edu.eci.pdsw.g4.bean.control.web.SystemManageBean.getAllsequipos;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
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
                               
                for (int i = 0; i < getAllsequipos().size(); i++) {
                    if(getAllsequipos().get(i).getModelo().equals(value)){
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
