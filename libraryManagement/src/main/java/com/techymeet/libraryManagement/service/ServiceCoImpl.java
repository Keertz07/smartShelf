package com.techymeet.libraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techymeet.libraryManagement.bo.BookBo;
import com.techymeet.libraryManagement.bo.Userbo;
import com.techymeet.libraryManagement.dao.Dao;

@Service
@Transactional
public class ServiceCoImpl implements ServiceCo {
	@Autowired
	Dao dao;
	
	
	@Override
	public Userbo loginUser(Userbo userbo) {
		return dao.loginUser(userbo);
	}


	@Override
	public long addBook(BookBo bookBo) {
		return dao.addBook(bookBo);
	}


	@Override
	public List<BookBo> viewBook() {
		return dao.viewBook();
	}


	@Override
	public List<BookBo> searchTitle(String title) {
		return dao.searchTitle(title);
	}


	@Override
	public List<BookBo> searchAuthor(String author) {
		return dao.searchAuthor(author);
	}


	@Override
	public List<BookBo> searchSubject(String subject) {
		// TODO Auto-generated method stub
		return dao.searchSubject(subject);
	}
	

}
