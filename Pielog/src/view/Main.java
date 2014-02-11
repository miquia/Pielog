package view;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {

	public static void main(String[] args) {
		try {
	            // Set System L&F
	        UIManager.setLookAndFeel(
	        		"javax.swing.plaf.nimbus.NimbusLookAndFeel"
	        	//	UIManager.getSystemLookAndFeelClassName()	
	        		);
	    } 
	    catch (Exception e) {
	       // handle exception
	    }
		LookAndFeelInfo[] arr = UIManager.getInstalledLookAndFeels(); 
		for (LookAndFeelInfo item : arr){
			System.out.println("Item: " + item);
		}
		
		BlogFrame blogframe = new BlogFrame();
		blogframe.setVisible(true);
	}

}
