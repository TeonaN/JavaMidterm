package teona.nikabadze.teonanikabadze1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;


    @ToString.Exclude
    @OneToMany( mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY) //
    private List<Tag> tags = new ArrayList<>();

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private Attachment attachment;
}
