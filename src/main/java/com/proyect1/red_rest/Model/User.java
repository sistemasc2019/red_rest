package com.proyect1.red_rest.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class User {

    @Id
    private String id = new ObjectId().toString();
    private String correo;
    private String nombre;
    private String apellido;
    private String diaNac;
    private String mesNac;
    private String anio_nac;
    private String sexo;
    private String pass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(String diaNac) {
        this.diaNac = diaNac;
    }

    public String getMesNac() {
        return mesNac;
    }

    public void setMesNac(String mesNac) {
        this.mesNac = mesNac;
    }

    public String getAnio_nac() {
        return anio_nac;
    }

    public void setAnio_nac(String anio_nac) {
        this.anio_nac = anio_nac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
