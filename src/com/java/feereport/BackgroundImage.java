package com.java.feereport;



import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


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
import javax.swing.JTable;
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



public class BackgroundImage {
	
	private JLabel lblBackgroundImage = new JLabel();

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	public JPanel backgroudImage(JPanel panel) {
		
		 //initializes panels and panel layout
		
       panel.setOpaque(false);
       panel.setLayout(new FlowLayout());

       lblBackgroundImage.setLayout(new FlowLayout());

       //sets background image of panel
       lblBackgroundImage.setIcon(new ImageIcon("C:\\Users\\P C\\Desktop\\images5.jpg"));
       lblBackgroundImage.setLayout(new BorderLayout());
       lblBackgroundImage.setSize(500, 500);
	   lblBackgroundImage.add(panel);

	        return panel;
	}
	
	public JLabel getbackgroundimage()
	{
		return lblBackgroundImage;
	}
	
	
	
}



