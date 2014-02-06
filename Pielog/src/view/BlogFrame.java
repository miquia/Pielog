package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.BlogController;
import model.BlogListener;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;

public class BlogFrame extends JFrame implements BlogListener {
	
	Container contentPane;
	JPanel panel;
	
	public BlogFrame() {
		contentPane = getContentPane();
		buildView();
		setProperties();
	}

	/**
	 * Default serialID
	 */
	private static final long serialVersionUID = 1L;

	
	public static void main(String[] args){
		BlogController blogCont;
		
	}
	
	private void buildView(){
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{129, 75, 106, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{38, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JTextPane jtextPane = new JTextPane();
		GridBagConstraints gbc_jtextPane = new GridBagConstraints();
		gbc_jtextPane.anchor = GridBagConstraints.WEST;
		gbc_jtextPane.insets = new Insets(0, 0, 5, 5);
		gbc_jtextPane.gridx = 1;
		gbc_jtextPane.gridy = 0;
		panel.add(jtextPane, gbc_jtextPane);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 6;
		panel.add(textArea, gbc_textArea);
		
		JEditorPane jeditorPane = new JEditorPane();
		GridBagConstraints gbc_jeditorPane = new GridBagConstraints();
		gbc_jeditorPane.gridwidth = 5;
		gbc_jeditorPane.anchor = GridBagConstraints.SOUTH;
		gbc_jeditorPane.gridx = 2;
		gbc_jeditorPane.gridy = 7;
		panel.add(jeditorPane, gbc_jeditorPane);
		
	}
	
	private void setProperties(){
		contentPane.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		

		setResizable(false);
	}

	@Override
	public void update(String component, String body) {
		// TODO Auto-generated method stub
		
		
	}
}
