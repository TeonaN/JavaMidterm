package teona.nikabadze.teonanikabadze1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teona.nikabadze.teonanikabadze1.model.Author;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
