package model;

import java.util.Iterator;

public class ArticleController {

	private Article tempArticle;
	
	public void getBlogSnippets(BlogController blogController, int i, Blog blog) {
		Iterator<Article> iterator = blog.getArticleIterator();
		if(!blog.getArticles().isEmpty()) { 
			while(iterator.hasNext() && i>0) {
				tempArticle = iterator.next();
				System.out.println( tempArticle.getTitle()  );
				blogController.notifyClients("Title", tempArticle.getTitle() );
				System.out.println( "" + tempArticle.getBody() + "\n" );
				blogController.notifyClients("Body", tempArticle.getBody() );
				i--;
			}
			System.out.println("\n\n");
		}
	}
	
	public Article getArticle(String title, Blog blog){
		Iterator<Article> iterator = blog.getArticleIterator();
		while(iterator.hasNext()){
			tempArticle = iterator.next();
			if (tempArticle.getTitle() == title)  break;
		}
		return tempArticle;
	}
	

}
