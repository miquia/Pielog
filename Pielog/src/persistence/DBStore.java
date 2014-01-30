package persistence;

/**
 * 
 * @author Daniel
 *
 */
public abstract class DBStore {

	private int type;
	
	/**
	 * Defines one of the supported database platforms. Use as following:<br><br>
	 * <code>defineDB(DBType.*)</code>
	 * 
	 * @param type <br><br>
	 * 
	 * @see DBType
	 */
	public void defineDB(int type){
		this.type = type;
	}
	
	
	/**
	 * Helper class to define currently supported databases. Use this 
	 * class to pick or call a particular database from the list. 
	 * <br><br>
	 * Example: <br> 
	 * <code>defineDB(DBType.MYSQL);</code> 
	 * @author Daniel
	 *
	 */
	public class DBType {		
		public static final int MYSQL = 0;
		public static final int MONGO_DB = 1;
	}

}




