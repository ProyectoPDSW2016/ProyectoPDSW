/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.electroeci;

/**
 *
 * @author 2108221
 */
public class TipoEquipo {
  private String modelo;
  private String nombre_equipo;
  private String url_img;
  private String marca;
  private int vida_util;
  private int precio;

    public TipoEquipo(String modelo, String nombre_equipo, String url_img, String marca, int vida_util, int precio) {
        this.modelo = modelo;
        this.nombre_equipo = nombre_equipo;
        this.url_img = url_img;
        this.marca = marca;
        this.vida_util = vida_util;
        this.precio = precio;
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

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
  
}
