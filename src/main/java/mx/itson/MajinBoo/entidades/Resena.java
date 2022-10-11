/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.MajinBoo.entidades;

import java.util.List;
import mx.itson.MajinBoo.enumeradores.Calificacion;

/**
 *
 * @author axelt
 */
public class Resena {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the numeroCap
     */
    public int getNumeroCap() {
        return numeroCap;
    }

    /**
     * @param numeroCap the numeroCap to set
     */
    public void setNumeroCap(int numeroCap) {
        this.numeroCap = numeroCap;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the comentarios
     */
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    /**
     * @param comentarios the comentarios to set
     */
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * @return the calificacion
     */
    public Calificacion getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the usuario
     */
    public List<Usuario> getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
    private String nombre;
    private String descripcion;
    private int numeroCap;
    private int duracion;
    private List<Comentario> comentarios;
    private Calificacion calificacion;
    private List<Usuario> usuario;
    
}
