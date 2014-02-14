package testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	
	private FileReader file; 
	private String data; 
	private BufferedReader br;
	
	public MyFileReader() {
		setFile();
	}
	
	public void setFile(){
		try {
			file = new FileReader("C:/dan/Pielog/Pielog/src/testing/messages.properties");
			br = new BufferedReader(file);
		} catch (FileNotFoundException e) {  e.printStackTrace(); 	}
	}
	
	public void closeFile(){
		try {
			br.close();
			file.close();
		} catch (IOException e) { e.printStackTrace(); 	}
	}

	public String readToken() {
		String line = "";
		try {
				data = "";
				if ( (line = br.readLine()) != null )  {
					if( line.contains("Title=") ) {
						return line.replace("Title=", "");
					}else if (line.isEmpty()) {
						return "";
					}else if ( br.ready() ) {
						String nextLine = ""; 
						do { 
							nextLine = br.readLine();
							if (nextLine.isEmpty())
								data += line + nextLine  ;
							else 
								data += line + "\n" + nextLine ;
							line = "";
						}while ( !nextLine.isEmpty() );
						return data.replace("Body=", "");
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

