package com.techymeet.libraryManagement.dao;

import java.util.List;

import com.techymeet.libraryManagement.bo.BookBo;
import com.techymeet.libraryManagement.bo.Userbo;

public interface Dao {

	Userbo loginUser(Userbo userbo);

	long addBook(BookBo bookBo);

	List<BookBo> viewBook();

	List<BookBo> searchTitle(String title);

	List<BookBo> searchSubject(String subject);

	List<BookBo> searchAuthor(String author);

}
