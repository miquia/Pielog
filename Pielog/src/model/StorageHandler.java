package model;

import java.util.ArrayList;

/** 
 * Interface that defines the "Storage" operation signatures without any concern for the underlying implementation.
 * 
 * @author Daniel Alamo
 */
public interface StorageHandler {
	
	/**
	 * Method for loading articles from underlying storage
	 * 
	 * @return articles (ArrayList)
	 */
	public ArrayList<Article> loadArticles(); 
}
   