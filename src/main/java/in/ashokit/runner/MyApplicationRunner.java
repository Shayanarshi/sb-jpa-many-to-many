package in.ashokit.runner;

import in.ashokit.model.Author;
import in.ashokit.model.Book;

import in.ashokit.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    BookRepository bookRepository;



    @Override
    public void run(ApplicationArguments args) throws Exception {

//        saveBookWithAuthors();
        fetchById();

    }
    private void fetchById() {
        Book book = bookRepository.findById(2L).orElseThrow();

        System.out.println("book id : "+book.getId());
        System.out.println("Book name : "+ book.getBookName());
    }
    private void saveBookWithAuthors(){

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();


        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();
        Author author4 = new Author();


        book1.setId(1L); book1.setBookName("Master Java");
        book2.setId(2L); book2.setBookName("Master Python");
        book3.setId(3L); book3.setBookName("Master Spring");

        author1.setId(101L); author1.setAuthorName("A");
        author2.setId(102L); author2.setAuthorName("B");
        author3.setId(103L); author3.setAuthorName("C");
        author4.setId(104L); author4.setAuthorName("D");

        book1.setAuthorList(List.of(author1,author2,author3,author4));
        book2.setAuthorList(List.of(author2,author3));
        book3.setAuthorList(List.of(author1,author2,author3,author4));



        author1.setBookList(List.of(book1,book3));
        author2.setBookList(List.of(book2,book3));
        author3.setBookList(List.of(book1,book2,book3));
        author4.setBookList(List.of(book1,book3));

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);


    }
}
