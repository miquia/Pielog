package persistence;

import java.util.ArrayList;

public interface ArticlePuller {
	
	/**
	 * Get a list of all the titles/headings of all articles in the blog.
	 * 
	 * @return list of titles
	 */
	public ArrayList<String> getAllTitles();
	
	
	/**
	 * Get a list of latest titles starting from a certain date.
	 * 
	 * @param date (the start date)   
	 * @return list of titles
	 */
	public ArrayList<String> getTitlesFrom(String date);
	
	
	/**
	 * Get a list of old titles up to a certain date.
	 * 
	 * @param date (the end date)   
	 * @return list of titles
	 */
	public ArrayList<String> getTitlesTo(String date);
	
	
	/**
	 * Get a list of titles within a specific range of dates.
	 * 
	 * @param start (start date)
	 * @param end (end date)
	 * @return list of titles
	 */
	public ArrayList<String> getTitlesRange(String start, String end);
	
	
	/**
	 * Get the article with the specified title/ID.
	 * 
	 * @param title (the title of the article)
	 * @param id (the unique identifier of the article)
	 * @return the article
	 */
	public String getArticle(String title, int id); 
	
	
}
