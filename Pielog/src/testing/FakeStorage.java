package testing;

import java.util.ArrayList;

import model.Article;
import model.StorageHandler;

public class FakeStorage implements StorageHandler {

	private ArrayList<Article> articles = new ArrayList<Article>(2);
	
	@Override
	public ArrayList<Article> loadArticles() {		
		for (int i=0; i<5; i++){
			articles.add(new Article());
		}
		int t = 0;
		for (Article a : articles){			
			a.setTitle(Messages.getString("Title." + t)); //$NON-NLS-1$
			a.setBody(Messages.getString("Body." + t)); //$NON-NLS-1$
			t++;
		} 
		return articles;
	}

}
