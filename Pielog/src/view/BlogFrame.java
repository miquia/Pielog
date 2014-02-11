package view;

import javax.swing.JFrame;

import model.BlogController;
import model.BlogListener;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import java.awt.Dimension;
import java.util.Locale;

public class BlogFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JSplitPane splitPane;
	
	public BlogFrame() {
		
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		borderLayout.setHgap(14);
		setLocationByPlatform(true);
		setLocale(Locale.US);
		setSize(new Dimension(900, 500));
		setIconImage(Toolkit.getDefaultToolkit().getImage(BlogFrame.class.getResource("/resources/PieLog_icon.png")));
		setTitle("PieLog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		splitPane = new MyJSplitPane();
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new MyJMenuBar();
		setJMenuBar(menuBar);
		
		
	}
}
