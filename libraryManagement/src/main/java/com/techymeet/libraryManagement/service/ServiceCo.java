package com.techymeet.libraryManagement.service;

import java.util.List;

import com.techymeet.libraryManagement.bo.BookBo;
import com.techymeet.libraryManagement.bo.Userbo;

public interface ServiceCo {

	Userbo loginUser(Userbo userbo1);

	long addBook(BookBo bookBo);

	List<BookBo> viewBook();

	List<BookBo> searchTitle(String studentName);

	List<BookBo> searchAuthor(String author);

	List<BookBo> searchSubject(String subject);

}
