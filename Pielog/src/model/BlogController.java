package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import testing.FakeStorage;

public class BlogController implements BlogPlublisher, Runnable, KeyListener {
	private Blog blog;
	private ArrayList<BlogListener> clients = new ArrayList<BlogListener>();
	private Article tempArticle;
	
	
	public BlogController(){
		// Supply a storage implementation of StorageHandler
		blog = new Blog(  new FakeStorage()  );
		process(5);
	} 
	
	private void process(int i){
		Iterator<Article> iterator = blog.getArticleIterator();
		if(!blog.getArticles().isEmpty()) {
			while(iterator.hasNext() && i>0) {
				tempArticle = iterator.next();
				System.out.println( tempArticle.getTitle()  );
				System.out.println( "" + tempArticle.getBody() + "\n" );
				i--;
			}
			notifyClients("","");
			System.out.println("\n\n");
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
		if (!clients.isEmpty()){
			for (BlogListener cl : clients){
				cl.update(component, body);
			}
		}
	}

	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			try {
				Thread.currentThread().sleep(4000);
				blog.reload(new FakeStorage());
				this.process(5);
				
				
			} catch (Exception e) { e.getMessage(); }
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		System.exit(0);
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
