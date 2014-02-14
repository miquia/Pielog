package model;

import java.util.ArrayList;

import testing.FakeStorage;

public class BlogController implements BlogPlublisher /** , Runnable  */ {
	private Blog blog;
	private ArrayList<Article> articles;
	private ArrayList<BlogListener> clients = new ArrayList<BlogListener>();
	private ArticleController mArticleController = new ArticleController();
	
	public BlogController(){
		// Supply a storage implementation of StorageHandler
		blog = new Blog(  new FakeStorage()  );
	} 
	
	public void process(int i){
		mArticleController.getBlogSnippets(this, i, this.blog);
	}
	
	public Article getArticle(String title){
		return mArticleController.getArticle(title, blog);
	}

	@Override
	public void register(BlogListener client) {
		clients.add(client);
	}
	@Override
	public void unregister(BlogListener client) {
		clients.remove(client);
	} 
	@Override
	public void notifyClients(String component, String body) {
		if (!clients.isEmpty()){
			for (BlogListener cl : clients){
				cl.update(component, body);
			}
		}
	}
	
//	@Override
//	public void run() {
//		while (true){
//			try {
//				Thread.currentThread();
//				Thread.sleep(3000);
//				this.process(5);
//			} catch (Exception e) { e.getMessage(); }
//		}
//	}

}
