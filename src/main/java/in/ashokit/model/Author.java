package in.ashokit.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Author {

    @Id
    private  Long id;
    private  String authorName;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "authorList")

    private  List<Book> bookList = new ArrayList<>();
}
