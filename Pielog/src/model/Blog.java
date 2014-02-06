package model;

import java.util.ArrayList;
import java.util.Iterator;

import persistence.DatabaseStorageHandler;
import testing.FakeStorage;


public class Blog  {
	
	private ArrayList<Article> articles;
	
	public Blog(StorageHandler storage){
		articles = storage.loadArticles();
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public Iterator<Article> getArticleIterator(){
		return articles.iterator();
	}
	
	public void reload(StorageHandler storage){
		articles = storage.loadArticles();
	}

}