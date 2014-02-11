package view;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class MyJMenuBar extends JMenuBar {
	
	private JMenuItem mntmTest;
	
	public MyJMenuBar() {
		setForeground(SystemColor.menuText);
		setBackground(SystemColor.menu);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setDelay(2000);
		mnFile.setBackground(SystemColor.menu);
		add(mnFile);
		
		mntmTest = new JMenuItem("Test_1");
		mntmTest.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		
		mntmTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.err.println("The Mouse was clicked at: [" + e.getX()+ ", " + e.getY()+"]");
			}
		});
		mnFile.add(mntmTest);
		
		JMenu mnEdit = new JMenu("Edit");
		add(mnEdit);
	}

	private static final long serialVersionUID = -8607944807658970692L;

}
