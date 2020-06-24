package teona.nikabadze.teonanikabadze1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teona.nikabadze.teonanikabadze1.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
