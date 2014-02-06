package model;

import java.util.ArrayList;
import java.util.Iterator;

import testing.FakeStorage;

public class BlogController implements BlogPlublisher {
	private Blog blog;
	private ArrayList<BlogListener> clients;
	private Article tempArticle;
	
	
	public BlogController(){
		// Supply a storage implementation of StorageHandler
		blog = new Blog(  new FakeStorage()  );
		process(2);
	} 
	
	private void process(int i){
		Iterator<Article> iterator = blog.getArticleIterator();
		if(!blog.getArticles().isEmpty()) {
			while(iterator.hasNext() && i>0) {
				tempArticle = iterator.next();
				System.out.println( tempArticle.getTitle()  );
				System.out.println( "   " + tempArticle.getBody() + "\n\n"  );
				i--;
			}
		}
	}

	@Override
	public void register(BlogListener client) {
		// TODO Auto-generated method stub
		clients.add(client);
	}
	@Override
	public void unregister(BlogListener client) {
		// TODO Auto-generated method stub
		clients.remove(client);
	} 
	@Override
	public void notifyClients(String component, String body) {
		// TODO Auto-generated method stub
		for (BlogListener cl : clients){
			cl.update(component, body);
		}
	}
}
