package com.java.feereport;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class ViewAccountant extends JFrame {
	static ViewAccountant frame;
	private JPanel panel2 = new JPanel();
	private JLabel lblBackgroundImage;
	private JButton btn;
	public ViewAccountant() throws IOException {
		//Code to view data in JTable
		List<Accountant> list=AccountantData.view();
		int size=list.size();
		
		String data[][]=new String[size][5];
		int row=0;
		for(Accountant a:list){
			data[row][0]=String.valueOf(a.getId());
			data[row][1]=a.getName();
			data[row][2]=a.getPassword();
			data[row][3]=a.getEmail();
			data[row][4]=a.getContactno();
			row++;
		}
		String columnNames[]={"Id","Name","Password","Email","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
		
		final BufferedImage image = ImageIO.read( new File("C:\\Users\\P C\\Desktop\\images5.jpg"));

		jt=new JTable(data,columnNames){{
	        setOpaque(false);
	        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {{
	            setOpaque(false);
	        }});
	    }};

		
		add(new JScrollPane(jt) {{
		    setOpaque(false);
		    setPreferredSize(new Dimension(600, 500));
		    getViewport().setOpaque(false);
		}
		@Override
		protected void paintComponent(Graphics g) {
		    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		    super.paintComponent(g);
		}
		
		});
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		
		// Adding Back Button to the eventLisner
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		JButton btn = new JButton("Back");
		btn.setForeground(Color.BLACK);
		btn.setFont(new Font("Serif", Font.BOLD,16));
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[]{});
				frame.dispose();
			}
		});
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewAccountant();
					frame.setVisible(true);
					frame.setSize(500,500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		
		
		
	}
	
}
