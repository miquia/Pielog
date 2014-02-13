package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class SnippetJPanel extends JPanel {

	private static final long serialVersionUID = 2369647289651271374L;
	private JPanel overlay;
	
	public SnippetJPanel(final String title, final String body, String time, final MyJSplitPane myJSplitPane){
		setLayout(new OverlayLayout(this)); 
		setMaximumSize(new Dimension(3000, 80));
		setMinimumSize(new Dimension(0, 0));
		setPreferredSize(new Dimension(100, 80));
		setAutoscrolls(true);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBorder(new LineBorder(UIManager.getColor("Panel.background"), 2, true));
		setBackground(SystemColor.inactiveCaption);
		
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
		overlay.setBackground(SystemColor.inactiveCaption);
		add(overlay);  
		
		JPanel snippetBuild = new SnippetBuildJPanel(title, body, time);
		add(snippetBuild);
		
	}

}

