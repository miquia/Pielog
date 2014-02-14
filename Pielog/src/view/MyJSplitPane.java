package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import model.BlogController;
import model.BlogListener;

public class MyJSplitPane extends JSplitPane implements BlogListener {
	
	private static final long serialVersionUID = 2553383505166473146L;
	public TitleJTextField txtArticleTitle;
	public JTextPane mainText;
	private BlogController blogControl;
	private JPanel snippetPanel;
	private String[] article = new String[2];
	private JScrollPane scrollPane;
	private JPanel leftPanel;
	private boolean removePanels = false;
	public Runnable blogFetcherRunnable;
	
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
		
		scrollPane = new JScrollPane();
		setLeftComponent(scrollPane);
		
		leftPanel = new JPanel();
		leftPanel.setBackground(UIManager.getColor("Panel.background"));
		scrollPane.setViewportView(leftPanel);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		setDividerLocation(160);
		
		blogControl.process(3);

//		Thread blogThread = new Thread(blogControl);
//		blogThread.start();
		blogFetcherRunnable = new Runnable() {
			@Override
			public void run() {
				while (true){
					try {
						Thread.currentThread();
						Thread.sleep(4000);
						blogControl.process(5);
					} catch (Exception e){ e.printStackTrace(); }
				}
			}
		};
		
		Thread fetcher = new Thread(blogFetcherRunnable);

		SwingUtilities.invokeLater(fetcher);
	}

	@Override
	public void update(String component, String text) {
		if (removePanels) {
			leftPanel.removeAll();
			removePanels = false;
		}
		switch (component){
			case "Title":
				article[0] = text;
				break;
			case "Body":
				article[1] = text;
				snippetPanel = new SnippetJPanel(article[0], article[1], "time", this);
				leftPanel.add(snippetPanel);
				break;
			case "Done":
				removePanels = true;
				break;
			default: 
				;
		}
	}


}
