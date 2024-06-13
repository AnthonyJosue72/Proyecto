/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author anthony
 */
public class Curso {
    private int ID;
    private String nombre; 
    private String seccion;
    private Date fechainicio; 
    private Date fechafin;
    private String horainicio;
    private String horafinal;
    private String profesor;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    
    @Override
    public String toString() {
        return getNombre() + " " + getSeccion()+" "+ getProfesor();

    }
    
    private static int cID = 1;
    public Curso(){
        this.ID = cID++;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

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
     * @return the seccion
     */
    public String getSeccion() {
        return seccion;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    /**
     * @return the fechainicio
     */
    public Date getFechainicio() {
        return fechainicio;
    }

    /**
     * @param fechainicio the fechainicio to set
     */
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    /**
     * @return the fechafin
     */
    public Date getFechafin() {
        return fechafin;
    }

    /**
     * @param fechafin the fechafin to set
     */
    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    /**
     * @return the horainicio
     */
    public String getHorainicio() {
        return horainicio;
    }

    /**
     * @param horainicio the horainicio to set
     */
    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    /**
     * @return the horafinal
     */
    public String getHorafinal() {
        return horafinal;
    }

    /**
     * @param horafinal the horafinal to set
     */
    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    /**
     * @return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the profesores
     */
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    /**
     * @return the alumnos
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * @return the cID
     */
    public static int getcID() {
        return cID;
    }

    /**
     * @param acID the cID to set
     */
    public static void setcID(int acID) {
        cID = acID;
    }
}