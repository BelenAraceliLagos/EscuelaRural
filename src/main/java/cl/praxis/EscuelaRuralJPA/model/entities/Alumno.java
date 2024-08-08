package cl.praxis.EscuelaRuralJPA.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    private String rut;
    private String nombre;
    private int edad;

    @ManyToOne
    @JoinColumn(name="curso", insertable = false, updatable = false)
    private Curso curso;

    public Alumno() {
    }

    public Alumno(String rut, String nombre, int edad, Curso curso) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso=" + curso +
                '}';
    }
}
