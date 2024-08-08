package cl.praxis.EscuelaRuralJPA.model.repository;

import cl.praxis.EscuelaRuralJPA.model.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, String> {
}
