package cl.praxis.EscuelaRuralJPA.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {

    @Column(name="curso")
    private String curso;

    public Curso(){
    }

    public Curso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "curso='" + curso + '\'' +
                '}';
    }
}
