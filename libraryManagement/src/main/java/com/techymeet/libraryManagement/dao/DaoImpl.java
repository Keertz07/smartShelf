package com.techymeet.libraryManagement.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techymeet.libraryManagement.bo.BookBo;
import com.techymeet.libraryManagement.bo.Userbo;
import com.techymeet.libraryManagement.db.DataBaseConnection;


@Repository
public class DaoImpl implements Dao{
	@Autowired
	DataBaseConnection db;
	@Override
	public Userbo loginUser(Userbo userbo) {
		Userbo response=null;
		try {
			Connection con=db.dbConnection();
			Statement st=con.createStatement();
			String sql="select * from login where username='"+userbo.getUsername()+"'";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				response=new Userbo();
				
				response.setUsername(rs.getString(2));
				response.setPassword(rs.getString(3));
				
			}
			st.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	@Override
	public long addBook(BookBo bookBo) {
		long status=0;
		try {
			Connection con=db.dbConnection();
			Statement st=con.createStatement();
			String str="insert into book(id,title,author,subject,date,quantity) values("+bookBo.getId()+",'"+bookBo.getTitle()+"','"+bookBo.getAuthor()+"','"+bookBo.getSubject()+"','"+bookBo.getDate()+"',"+bookBo.getQuantity()+")";
			st.execute(str);
			status=st.getUpdateCount();
			return status;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public List<BookBo> viewBook() {
		List<BookBo> list=new ArrayList<BookBo>();
		long sno=0;
		try {
			Connection con=db.dbConnection();
			Statement st=con.createStatement();
			String str="select * from book";
			ResultSet rs=st.executeQuery(str);
			while(rs.next()) {
				BookBo book=new BookBo();
				book.setSno(++sno);
				book.setId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setSubject(rs.getString(4));
				book.setDate(rs.getString(5));
				book.setQuantity(rs.getInt(6));
				list.add(book);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<BookBo> searchTitle(String title) {
		List<BookBo> list = new ArrayList<BookBo>();
		BookBo response = null;
		long sno=0;
		try {
			Connection con = db.dbConnection();
			Statement st = con.createStatement();
			String sql = "select * from book where title='" + title + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				response = new BookBo();
				response.setSno(++sno);
				response.setId(rs.getInt(1));
				response.setTitle(rs.getString(2));
				response.setAuthor(rs.getString(3));
				response.setSubject(rs.getString(4));
				response.setDate(rs.getString(5));
				response.setQuantity(rs.getInt(6));
				list.add(response);

			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}
	@Override
	public List<BookBo> searchSubject(String subject) {
		List<BookBo> list = new ArrayList<BookBo>();
		BookBo response = null;
		long sno=0;
		try {
			Connection con = db.dbConnection();
			Statement st = con.createStatement();
			String sql = "select * from book where subject='" + subject + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				response = new BookBo();
				response.setSno(++sno);
				response.setId(rs.getInt(1));
				response.setTitle(rs.getString(2));
				response.setAuthor(rs.getString(3));
				response.setSubject(rs.getString(4));
				response.setDate(rs.getString(5));
				response.setQuantity(rs.getInt(6));
				list.add(response);

			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	@Override
	public List<BookBo> searchAuthor(String author) {
		// TODO Auto-generated method stub
	List<BookBo> list = new ArrayList<BookBo>();
		BookBo response = null;
		long sno=0;
		try {
			Connection con = db.dbConnection();
			Statement st = con.createStatement();
			String sql = "select * from book where author='" + author + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				response = new BookBo();
				response.setSno(++sno);
				response.setId(rs.getInt(1));
				response.setTitle(rs.getString(2));
				response.setAuthor(rs.getString(3));
				response.setSubject(rs.getString(4));
				response.setDate(rs.getString(5));
				response.setQuantity(rs.getInt(6));
				list.add(response);

			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
