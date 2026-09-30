package in.ashokit.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Book {

    @Id
    private  Long id;

    private String bookName;



    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )

    private List<Author> authorList = new ArrayList<>();
}
