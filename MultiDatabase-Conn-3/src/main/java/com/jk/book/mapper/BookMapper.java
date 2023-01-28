package com.jk.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jk.model.book.Book;

@Mapper
public interface BookMapper {
     @Select("Select * from book_tb")
	List<Book> findAll();
}
