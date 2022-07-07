package br.com.luiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luiz.model.Book;

public interface bookRepository extends JpaRepository<Book, Long>{

}
