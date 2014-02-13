package testing;

import java.util.ArrayList;

import model.Article;
import model.StorageHandler;

public class FakeStorage implements StorageHandler {

	private ArrayList<Article> articles = new ArrayList<Article>(2);
	private MyFileReader reader; 
	
	public ArrayList<Article> loadArticles() {	
		reader = new MyFileReader();
		for (int i=0; i<5; i++){
			articles.add(new Article());
		}
		String token;
		for (Article a : articles){			
			token = reader.readToken();
			while ( token.equals("") )
				token = reader.readToken();
			a.setTitle(token); 
			
			token = reader.readToken();
			while ( token.equals("") )
				token = reader.readToken();
			a.setBody(token); 
		} 
		reader.closeFile();
		return articles;
	}

}
