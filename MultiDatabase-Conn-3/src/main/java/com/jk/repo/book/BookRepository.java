package com.jk.repo.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jk.model.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
