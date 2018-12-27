
package com.java.feereport;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class AdminLogin extends JFrame {
	static AdminLogin frame;
	private JPanel panel2;
	private JLabel lblBackgroundImage = new JLabel();
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	JButton btnLogin = new JButton("login");
	JButton btnback = new JButton("Back");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				frame = new AdminLogin();
				 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                frame.pack();
	                frame.setSize(500,300);
	                frame.setLocationRelativeTo(null);
	                frame.setVisible(true);
			}
		});
		
				
			
	}

	
//	public JPanel backgroudImage(JPanel panel) {
//		
//        
//        
//        return panel;
//	}
	
	/**
	 * Create the frame.
	 */
	public AdminLogin() {
//----------------------------------------------------------------------------------------------------------------------------------------------------//		
		setTitle("ADMIN-LOGIN");
        setSize(500, 500);
       panel2  = new JPanel();
       

		 //initializes panels and panel layout
		BackgroundImage image = new BackgroundImage();
		panel2 = image.backgroudImage(panel2);
		lblBackgroundImage = image.getbackgroundimage();
		add(lblBackgroundImage);
		
//----------------------------------------------------------------------------------------------------------------------------------------------------//		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//contentPane = new JPanel();
		panel2.setBorder(new EmptyBorder(5, 5, 5, 5));
	    //setContentPane(panel2);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setForeground(Color.BLACK);
		lblAdminLogin.setFont(new Font("Serif", Font.BOLD, 20));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Serif", Font.BOLD, 20));
	 
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Serif", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		
	//	JButton btnLogin = new JButton("login");
		btnLogin.setFont(new Font("Serif", Font.BOLD, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			char ch[]=passwordField.getPassword();
			String password=String.valueOf(ch);
			if(name.equals("adarsh")&&password.equals("adarsh4003")){
				String s[]={};
				AdminSection.main(s);
				frame.dispose();
				
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this,"Sorry, username or password error!");
				textField.setText("");passwordField.setText("");
			}
			}
		});
		
		
		btnback.setFont(new Font("Serif", Font.BOLD, 20));
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FeeReport.main(new String[]{});
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(panel2);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(180)
							.addComponent(lblAdminLogin))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								.addComponent(lblPassword))
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordField)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(177)
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(177)
								.addComponent(btnback, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(111, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAdminLogin)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword))
					.addGap(36)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(51, Short.MAX_VALUE)
					.addComponent(btnback, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		panel2.setLayout(gl_contentPane);
	}
}
