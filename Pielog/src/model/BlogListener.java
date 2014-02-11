package model;

/**
 * Interface for 
 * 
 * @author Daniel Alamo
 */
public interface BlogListener {
	
	/**
	 * This method gets called when *ANY* of the data in the Blog has changed
	 * 
	 * @param component (part of the blog that has a change)
	 * @param text (shows the changes) 
	 */
	public void update(String component, String text);
}
