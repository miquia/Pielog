package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

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
