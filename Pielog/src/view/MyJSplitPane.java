package view;

import javax.swing.JSplitPane;

import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JPanel;

import model.BlogController;
import model.BlogListener;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.FocusListener;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;

public class MyJSplitPane extends JSplitPane implements BlogListener {
	
	private static final long serialVersionUID = 2553383505166473146L;
	public JTextField txtArticleTitle;
	private BlogController blogControl;
	private JTextPane mainText;
	private JPanel snippetPanel;
	private String[] article = new String[2];
	private JPanel leftPanel;
	
	public MyJSplitPane() {
		blogControl = new BlogController();
		blogControl.register(this);
		
		setSize(new Dimension(700, 400));
		setPreferredSize(new Dimension(700, 400));
		setDividerSize(4);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(4);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		setRightComponent(splitPane);
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		splitPane.setLeftComponent(panel);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.LEFT, 2, 2);
		panel.setLayout(fl_panel);
		
		txtArticleTitle = new TitleJTextField();
		txtArticleTitle.addFocusListener((FocusListener) txtArticleTitle);
		panel.add(txtArticleTitle);
		
		mainText = new MainJTextPane();
		splitPane.setRightComponent(mainText);
		splitPane.setDividerLocation(34);
		
		leftPanel = new JPanel();
		leftPanel.setBackground(UIManager.getColor("Panel.background"));
		setLeftComponent(leftPanel);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		setDividerLocation(160);
		
		blogControl.process(8);
	}

	@Override
	public void update(String component, String text) {
		switch (component){
			case "Title":
				article[0] = text;
				break;
			case "Body":
				article[1] = text;
				snippetPanel = new SnippetJPanel(article[0], article[1], "time");
				leftPanel.add(snippetPanel);
				break;
			default :
				;
		}
		
		
	}

}
