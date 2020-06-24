package teona.nikabadze.teonanikabadze1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import teona.nikabadze.teonanikabadze1.model.Attachment;
import teona.nikabadze.teonanikabadze1.model.Author;
import teona.nikabadze.teonanikabadze1.model.Book;
import teona.nikabadze.teonanikabadze1.model.Tag;
import teona.nikabadze.teonanikabadze1.repository.AuthorRepository;
import teona.nikabadze.teonanikabadze1.repository.BookRepository;
import teona.nikabadze.teonanikabadze1.repository.TagRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    TagRepository tagRepository;

    @GetMapping("addAuthor")
    public void addAuthor() {
        Author author = new Author();
        author.setFirstName("Haruki");
        author.setLastName("Murakami");
        authorRepository.save(author);
    }

    @GetMapping("addBook")
    public void addBook() {
        Author author = authorRepository.getOne(2L);
        List<Author> authors = new ArrayList<>();
        authors.add(author);

        Attachment attachment = new Attachment();
        attachment.setPdfUrl("image.jpg");

        Book book = new Book();
        book.setTitle("Norwegian Wood");
        book.setDescription("Lorem Ipsum");
        book.setAuthors(authors);

        book.setAttachment(attachment);

        bookRepository.save(book);
    }

    @GetMapping("getBooks")
    public void getBooks() {
        for (Book book : bookRepository.findAll()) {
            System.out.println(book);
        }
    }

    @GetMapping("getBook")
    public void getBook() {
        Book book = bookRepository.getOne(3L);
        System.out.println(book.getTitle());
        System.out.println(book.getTags().get(0).getName());
    }

    @GetMapping("addTags")
    public void addTags() {
        Book book = bookRepository.getOne(3L);
        Tag tag = new Tag();
        tag.setName("ssdsd");
        tag.setBook(book);
        tagRepository.save(tag);
    }

    @GetMapping("getTags")
    public void getTags() {
        for (Tag tag : tagRepository.findAll()) {
            System.out.println(tag);
        }
    }


}
