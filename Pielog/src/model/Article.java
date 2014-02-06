package model;

import java.util.ArrayList;

public class Article {
	
	private int date; 
	private String title;
	private String body;
	private String editor;
	private ArrayList<String> comments;	

	public Article() {
		this.title = "";
		this.body = "";
		this.editor = "";
		this.date = 0;
	}

	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public ArrayList<String> getComments() {
		return comments;
	}
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}

	
}
