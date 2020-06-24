package teona.nikabadze.teonanikabadze1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Book> books=new ArrayList<>();
}
