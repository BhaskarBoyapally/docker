package in.bhaskar;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bhaskar.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}
