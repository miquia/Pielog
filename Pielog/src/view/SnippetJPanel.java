package view;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Color;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.OverlayLayout;
import javax.swing.UIManager;

public class SnippetJPanel extends JPanel {

	private static final long serialVersionUID = 2369647289651271374L;
	private MyJSplitPane myJSplitPane;
	private String title;
	private String body;
	private JPanel overlay;
	
	public SnippetJPanel(final String title, final String body, String time, final MyJSplitPane myJSplitPane){
		this.myJSplitPane = myJSplitPane;
		this.title = title;
		this.body = body;
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
			public void mouseEntered(MouseEvent e) {
				overlay.setBackground(new Color(255,255,255,60));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				overlay.setBackground(new Color(255,255,255,0));
			}
			@Override
			public void mousePressed(MouseEvent e) { 
				myJSplitPane.mainText.setText(body);
				if (!title.isEmpty()) {
					myJSplitPane.txtArticleTitle.setForeground(Color.BLACK);
					myJSplitPane.txtArticleTitle.setText(title);
				}
			}

		});
		
		overlay.setOpaque(true);
		overlay.setBackground(SystemColor.inactiveCaption);
		add(overlay);  
		
		JPanel snippetBuild = new SnippetBuildJPanel(title, body, time);
		
		/////////
		
		
		
		/////////
		add(snippetBuild);
		
	}

//	
//	@Override
//	public void mousePressed(MouseEvent e) { 
//		this.myJSplitPane.mainText.setText(this.body);
//		if (!this.title.isEmpty()) {
//			this.myJSplitPane.txtArticleTitle.setForeground(Color.BLACK);
//			this.myJSplitPane.txtArticleTitle.setText(this.title);
//		}
//	}
//	
//	@Override
//	public void mouseClicked(MouseEvent e) { }
//
//	@Override
//	public void mouseEntered(MouseEvent e) { }
//
//	@Override
//	public void mouseExited(MouseEvent e) { }
//	
//	@Override
//	public void mouseReleased(MouseEvent e) { }

}

