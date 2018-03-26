package com.a8ak27.tools;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
 

public class AESEncryption {
    private static byte[] key = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'
    };
 
    public static String encrypt(String plainText) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plainText.getBytes("UTF8"));
            String encryptedString = new String(Base64.getEncoder().encode(cipherText),"UTF-8");
            return encryptedString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static String decrypt(String encryptedText) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] cipherText = Base64.getDecoder().decode(encryptedText.getBytes("UTF8"));
            String decryptedString = new String(cipher.doFinal(cipherText),"UTF-8");
            return decryptedString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}



package com.a8ak27.tools;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class BLTest {

	private JFrame frmBlSmokeTesting;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BLTest window = new BLTest();
					window.frmBlSmokeTesting.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BLTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBlSmokeTesting = new JFrame();
		frmBlSmokeTesting.setFont(new Font("Courier New", Font.PLAIN, 12));
	
		frmBlSmokeTesting.setIconImage(Toolkit.getDefaultToolkit().getImage(BLTest.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		frmBlSmokeTesting.setTitle("BL Smoke Testing");
		frmBlSmokeTesting.getContentPane().setMinimumSize(new Dimension(1024, 768));
		frmBlSmokeTesting.setBounds(100, 100, 450, 300);
		frmBlSmokeTesting.setExtendedState(frmBlSmokeTesting.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		frmBlSmokeTesting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBlSmokeTesting.getContentPane().setLayout(null);
		//frmBlSmokeTesting.setResizable(false);
		
		JButton btnTestAuto = new JButton("Auto");
		btnTestAuto.setIcon(null);
		btnTestAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTestAuto.setBounds(10, 11, 123, 23);
		frmBlSmokeTesting.getContentPane().add(btnTestAuto);
		
		JButton btnTestProperty = new JButton("Property");
		btnTestProperty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTestProperty.setBounds(10, 45, 123, 23);
		frmBlSmokeTesting.getContentPane().add(btnTestProperty);
		
		JButton btnNewButton = new JButton("Motorcycle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(155, 11, 123, 23);
		frmBlSmokeTesting.getContentPane().add(btnNewButton);
		
		JButton btnBoat = new JButton("Boat");
		btnBoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoat.setBounds(301, 11, 123, 23);
		frmBlSmokeTesting.getContentPane().add(btnBoat);
		
		JButton btnLandlorad = new JButton("Landlorad");
		btnLandlorad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLandlorad.setBounds(155, 45, 123, 23);
		frmBlSmokeTesting.getContentPane().add(btnLandlorad);
		
		JButton btnNewButton_1 = new JButton("MFH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(301, 45, 123, 23);
		frmBlSmokeTesting.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PUP");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(10, 79, 123, 23);
		frmBlSmokeTesting.getContentPane().add(btnNewButton_2);
		
		JEditorPane dtrpnTesting = new JEditorPane();
		dtrpnTesting.setEditable(false);
		dtrpnTesting.setFont(new Font("Courier New", Font.PLAIN, 13));
		dtrpnTesting.setForeground(Color.GREEN);
		dtrpnTesting.setBackground(Color.BLACK);
		dtrpnTesting.setBounds(10, 153, 1345, 528);
		frmBlSmokeTesting.getContentPane().add(dtrpnTesting);
		
		JButton btnTestAll = new JButton("Test All");
		btnTestAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTestAll.setBounds(155, 79, 123, 23);
		frmBlSmokeTesting.getContentPane().add(btnTestAll);
		
		textField = new JTextField();
		textField.setBounds(72, 113, 111, 29);
		frmBlSmokeTesting.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTestDate = new JLabel("Test Date");
		lblTestDate.setBounds(10, 113, 64, 29);
		frmBlSmokeTesting.getContentPane().add(lblTestDate);
		
		JLabel lblMmddyyyy = new JLabel("MM/DD/YYYY");
		lblMmddyyyy.setBounds(193, 120, 85, 14);
		frmBlSmokeTesting.getContentPane().add(lblMmddyyyy);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(280, 120, 345, 22);
		frmBlSmokeTesting.getContentPane().add(lblNewLabel);
	}
}
