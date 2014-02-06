package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class Messages {
	
	private FileReader file; 
	private String data; 
	BufferedReader br;
	
	public Messages() {
		setFile();
	}
	
	public void setFile(){
		try {
			file = new FileReader("C:/dev/Pielog/Pielog/src/testing/messages.properties");
			br = new BufferedReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getString(String key) {
		String line = "";
		try {
				data = "";
				if ( (line = br.readLine()) != null ) {
					String temp = line; //+ "\n";
					if( line.contains("Title") ) {
						data = line;
						return data;
					}
					else if ( !line.isEmpty() && br.ready() ) {
						do { 
							line = br.readLine();
							if (line.isEmpty())
								data += temp + line  ;
							else 
								data += temp + "\n" + line ;
							temp="";
						}while ( !line.isEmpty() );
						return data;
					} else if (!br.ready() && !line.isEmpty()) {
						return line;
					}
				} 
				return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "bad"; 
		}
	}
		
		
		
	}

