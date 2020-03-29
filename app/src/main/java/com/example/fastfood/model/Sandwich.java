package com.example.fastfood.model;

import android.widget.ImageView;

import java.io.Serializable;

public class Sandwich implements Serializable {
    private String nombre;
    private int imagen;
    private int descripcion;
    private int precio;

    public Sandwich(String nombre, int imagen, int descripcion, int precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
