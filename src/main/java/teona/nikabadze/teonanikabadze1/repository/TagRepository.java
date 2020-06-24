package teona.nikabadze.teonanikabadze1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teona.nikabadze.teonanikabadze1.model.Tag;

public interface TagRepository  extends JpaRepository<Tag, Long> {
}
