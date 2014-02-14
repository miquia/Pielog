package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.border.LineBorder;

public class SnippetJPanel extends JPanel {

	private static final long serialVersionUID = 2369647289651271374L;
	private JPanel overlay;
	
	public SnippetJPanel(final String title, final String body, String time, final MyJSplitPane myJSplitPane){
		setLayout(new OverlayLayout(this)); 
		setMaximumSize(new Dimension(3000, 74));
		setPreferredSize(new Dimension(100, 74));
		setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		
		overlay = new JPanel();
		overlay.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) { 
				myJSplitPane.mainText.setText(body);
				if (!title.isEmpty()) {
					myJSplitPane.txtArticleTitle.setForeground(Color.BLACK);
					myJSplitPane.txtArticleTitle.setText(title);
				}
			}
		});
		overlay.setOpaque(false);
		add(overlay);  
		
		JPanel snippetBuild = new SnippetBuildJPanel(title, body, time);
		snippetBuild.setBackground(Color.WHITE);
		add(snippetBuild);
		
	}

}

