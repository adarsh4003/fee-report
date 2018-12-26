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
	                frame.setLocationRelativeTo(null);
	                frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminLogin() {
//----------------------------------------------------------------------------------------------------------------------------------------------------//		
		setTitle("ADMIN-LOGIN");
        setSize(650, 650);

        //initializes panels and panel layout
        panel2 = new JPanel();
        panel2.setOpaque(false);
        panel2.setLayout(new FlowLayout());

        lblBackgroundImage.setLayout(new FlowLayout());

        //sets background image of panel
        lblBackgroundImage.setIcon(new ImageIcon("C:\\Users\\P C\\Desktop\\images.jpg"));
        lblBackgroundImage.setLayout(new BorderLayout());
        lblBackgroundImage.setSize(500, 500);

        //adds button to panels
        panel2.add(btnLogin);
      
        lblBackgroundImage.add(panel2);

        add(lblBackgroundImage);
		
		
//----------------------------------------------------------------------------------------------------------------------------------------------------//		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//contentPane = new JPanel();
		panel2.setBorder(new EmptyBorder(5, 5, 5, 5));
	    //setContentPane(panel2);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setForeground(Color.red);
		lblAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.red);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.red);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		
	//	JButton btnLogin = new JButton("login");
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
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
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
					.addContainerGap(51, Short.MAX_VALUE))
		);
		panel2.setLayout(gl_contentPane);
	}
}
