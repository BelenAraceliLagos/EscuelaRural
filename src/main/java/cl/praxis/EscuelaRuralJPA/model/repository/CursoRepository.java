package cl.praxis.EscuelaRuralJPA.model.repository;

import cl.praxis.EscuelaRuralJPA.model.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,String> {
}
