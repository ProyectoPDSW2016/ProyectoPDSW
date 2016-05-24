/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.g4.bean.control.web;


import com.lowagie.text.BadElementException;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import edu.eci.pdsw.g4.bean.control.seguridad.ShiroLoginBean;
import edu.eci.pdsw.g4.logica.estructura.Equipo;
import edu.eci.pdsw.g4.logica.estructura.Estudiante;
import edu.eci.pdsw.g4.logica.estructura.TipoEquipo;
import edu.eci.pdsw.g4.logica.estructura.Usuario;
import edu.eci.pdsw.g4.logica.dao.PersistenciaException;
import edu.eci.pdsw.g4.logica.estructura.DetallePrestamo;
import edu.eci.pdsw.g4.logica.estructura.EstadisticasEquipo;
import edu.eci.pdsw.g4.logica.estructura.Prestamo;
import edu.eci.pdsw.g4.logica.servicio.ExcepcionServiciosSistema;
import edu.eci.pdsw.g4.logica.servicio.ServicioPersisElectroECI;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.File;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Array;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.swing.KeyStroke;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.slf4j.LoggerFactory;
/**
 *
 * @author 2093130
 */


@ManagedBean (name="SystemManagedBeanEquipo")
@SessionScoped
public class SystemManageBean implements Serializable{
    ServicioPersisElectroECI  sec;
    
    private int placa;
    private int serial;
    private int tipomodel;
    private String observaciones;
    private char estado;
    private String modelo;
    private String nombre_equipo;
    private String url_img;
    private String marca;
    private int precio;
    private int vida_util;
    private Date date2;
    private int placaficha = 0;
    Equipo loadbyplaca;
      TipoEquipo loadTipoEquipo;
        private static List<TipoEquipo> allsequipos=new ArrayList<TipoEquipo>();
private static final org.slf4j.Logger log = LoggerFactory.getLogger(SystemManageBean.class);
          
      private int id_usuario;
      private int id_prestamo;
      private  Set<DetallePrestamo> dtll_prestamo;
      
      String referenciainterna; 

    public String getReferenciainterna() {
        return referenciainterna;
    }

    public void setReferenciainterna(String referenciainterna) {
        this.referenciainterna = referenciainterna;
    }

    public TipoEquipo getLoadTipoEquipo() {
        return loadTipoEquipo;
    }

    public void setLoadTipoEquipo(TipoEquipo loadTipoEquipo) {
        this.loadTipoEquipo = loadTipoEquipo;
    }

    public Equipo getLoadbyplaca() {
        return loadbyplaca;
    }

    public void setLoadbyplaca(Equipo loadbyplaca) {
        this.loadbyplaca = loadbyplaca;
    }
    

    public int getPlacaficha() {
        return placaficha;
    }

    public void setPlacaficha(int placaficha) {
        this.placaficha = placaficha;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }
    
    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }
     
    public void click() {
        RequestContext requestContext = RequestContext.getCurrentInstance();
         
        requestContext.update("form:display");
        requestContext.execute("PF('dlg').show()");
    }


    private String routeequip="http://jhelectronics.co/images/com_hikashop/upload/cable_punta_caiman.jpg";

    public String getRouteequip() {
        return routeequip;
    }

    public void setRouteequip(String routeequip) {
        this.routeequip = routeequip;
    }
      
    public void getImageIcon() {
        FacesContext context = FacesContext.getCurrentInstance();
        String customID = context.getExternalContext().getRequestParameterMap().get(routeequip);
        System.out.println("image_id: " + customID);
}
    
    public SystemManageBean() {
   
       sec = ServicioPersisElectroECI.getInstance("appConfreal.properties");
    }
  
   
    public ServicioPersisElectroECI getSec() {
        return sec;
    }

    public void setSec(ServicioPersisElectroECI sec) {
        this.sec = sec;
    }


    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public Set<DetallePrestamo> getDtll_prestamo() {
        return dtll_prestamo;
    }

    public void setDtll_prestamo(Set<DetallePrestamo> dtll_prestamo) {
        this.dtll_prestamo = dtll_prestamo;
    }
    
  
    public static List<TipoEquipo> getAllsequipos() {
        return allsequipos;
    }

    public static void setAllsequipos(List<TipoEquipo> allsequipos) {
        SystemManageBean.allsequipos = allsequipos;
    }
    
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getTipomodel() {
        return tipomodel;
    }

    public void setTipomodel(int tipomodel) {
        this.tipomodel = tipomodel;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }
    public void insertarTipoequipo() throws PersistenciaException{
      TipoEquipo  tp = new TipoEquipo(modelo, nombre_equipo, url_img, marca, vida_util, precio);
      sec.insertTipoEquipo(tp);
        
        setModelo("");
        setNombre_equipo("");
        setUrl_img("");
        setMarca("");
        setVida_util(0);
        setPrecio(0);
        
        
    }
    
    public void insertarEquipo() throws PersistenciaException{
      Equipo  tp1 = new Equipo(placa, serial, tip1.getModelo(), observaciones, estado);
      sec.insertEquipo(tp1);
      setEstado(' ');
      setObservaciones("");
      setPlaca(0);
      setSerial(0);
      setTip1(null);
    }
    public void insertarPrestamo() throws PersistenciaException{
            //El constructor de la clase prestamo esta invertido con respecto a la bd
        
        Prestamo p1 = new Prestamo(id_prestamo);
        sec.insertPrestamo(p1);
       // System.out.println("------------------------>Prestamo agregado correctamente");
    }
    
    private TipoEquipo tip1;

    public TipoEquipo getTip1() {
        return tip1;
    }

    public void setTip1(TipoEquipo tip1) {
        this.tip1 = tip1;
    }
    public List<EstadisticasEquipo> getReporte(){
        try {
            
            return sec.reporte();
        } catch (PersistenciaException ex) {
            LoggerFactory.getLogger(SystemManageBean.class);
        }
        return null;
    }
    public List<TipoEquipo> getTipoEquipo(){
        try {
            return sec.selectAll();
        } catch (PersistenciaException ex) {
            Logger.getLogger(SystemManageBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
       
    public List<TipoEquipo> complete(String query) throws PersistenciaException{
       allsequipos=sec.selectAlltipoeq();
       List<TipoEquipo> filtradodetipo=new ArrayList<TipoEquipo>();
        
        for (int i = 0; i < allsequipos.size(); i++) {
            TipoEquipo eq=allsequipos.get(i);
            if(eq.getModelo().toLowerCase().startsWith(query)){
                filtradodetipo.add(eq);
            }  
        }
       return filtradodetipo;
    }
     public TipoEquipo loadTipoequipo(int placa) throws PersistenciaException{
        TipoEquipo loadTeq = sec.loadTipoEquipo(placa);
         return loadTeq;
    }
    
    public Equipo loadequipoByplaca() throws PersistenciaException{
        if(getPlacaficha() == 0){
            System.out.println("Imposible Cargar registro");
           return null; 
        }
        else{
        loadbyplaca = sec.loadequipoByplaca(getPlacaficha());
         loadTipoEquipo = loadTipoequipo(getPlacaficha());
         
         referenciainterna= AsignRefInterna( loadbyplaca.getTipo_model(),loadTipoEquipo.getNombre_equipo());
        
        return loadbyplaca;
        }
    }
   public String AsignRefInterna(String param1 , String param2){
       String resp = param1 +"-"+ param2;
       return resp;
   }
   
   public void preProcessPDF(Object document) throws IOException, BadElementException, DocumentException {
        Document pdf = (Document) document;
        pdf.open();
        pdf.setPageSize(PageSize.A4);
       
        pdf.addTitle("Ficha del Equipo : "+loadTipoEquipo.getNombre_equipo());
        
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        String logo = externalContext.getRealPath("") +File.separator + "resource" + File.separator + "ecijulio.png";
       
        pdf.add(Image.getInstance(logo));
         pdf.bottom(30); 
        
         pdf.add(new Chunk("Datos del Equipo : " + loadTipoEquipo.getNombre_equipo() +" con Placa No : " + getPlacaficha()));
    }
    



    

}
