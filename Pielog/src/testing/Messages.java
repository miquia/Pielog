package testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Messages {
	
	private FileReader file; 
	private String data; 
	private BufferedReader br;
	
	public Messages() {
		setFile();
	}
	
	public void setFile(){
		try {
			file = new FileReader("C:/dev/Pielog/Pielog/src/testing/messages.properties");
			br = new BufferedReader(file);
		} catch (FileNotFoundException e) {  e.printStackTrace(); 	}
	}
	
	public void closeFile(){
		try {
			br.close();
			file.close();
		} catch (IOException e) { e.printStackTrace(); 	}
	}

	public String getString(String key) {
		String line = "";
		try {
				data = "";
				if ( (line = br.readLine()) != null ) {
					String temp = line; 
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
			return "NULL"; 
		}
	}
		
	}

