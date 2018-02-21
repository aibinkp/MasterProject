package com.a8ak27.tools;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextAES extends JFrame {
	private JTextField textField;
	private JLabel lblmsgText;
	private JTextArea textAreaEText;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextAES frame = new TextAES();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TextAES() {
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setTitle("Text Encrypt/Decrypt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 267);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTextTo = new JLabel("Enter Text To Encrypt");
		lblEnterTextTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterTextTo.setBounds(10, 17, 123, 14);
		contentPane.add(lblEnterTextTo);
		
		textField = new JTextField(30);
		textField.setBounds(139, 14, 316, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setDocument(new com.a8ak27.tools.LimitJTextField(25));
		
		textField.addKeyListener(new KeyListener() {
			 
		    @Override
		    public void keyTyped(KeyEvent event) {
		    	lblmsgText.setText("");
		    	textAreaEText.setText("");
	    		contentPane.repaint();
		    }
		 
		    @Override
		    public void keyReleased(KeyEvent event) {
		        //System.out.println("key released");
		    }
		 
		    @Override
		    public void keyPressed(KeyEvent event) {
		       // System.out.println("key pressed");
		    }
		});
		
		
		JButton btnNewButton = new JButton("Encrypt");
		btnNewButton.setBounds(139, 42, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	
	    	  if(textField.getText().trim().isEmpty())
	    		  {
	    		  lblmsgText.setForeground(Color.RED);
	    		  lblmsgText.setText("'Text To Encrypt' field can not be blank !");
	    		  contentPane.repaint();
	    		  }
	    	  else
	    	  {
	    		  textAreaEText.setText(com.a8ak27.tools.AESEncryption.encrypt(textField.getText().trim()));
	    	  }
	      }
	    });
		
		JLabel lblEncryptedtext = new JLabel("Encrypted Text");
		lblEncryptedtext.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEncryptedtext.setBounds(10, 94, 114, 14);
		contentPane.add(lblEncryptedtext);
		
		 lblmsgText = new JLabel("");
		 lblmsgText.setFont(new Font("Tahoma", Font.BOLD, 10));
		 lblmsgText.setBounds(10, 203, 445, 14);
		contentPane.add(lblmsgText);
		
		 textAreaEText = new JTextArea();
		 textAreaEText.setWrapStyleWord(true);
		 textAreaEText.setLineWrap(true);
		 textAreaEText.setRows(3);
		textAreaEText.setBounds(139, 89, 316, 67);
		contentPane.add(textAreaEText);
		
		

	}
}
