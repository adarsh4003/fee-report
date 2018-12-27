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
import java.net.PasswordAuthentication;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class ViewStudent extends JFrame {
	static ViewStudent frame;
	JTable jt;
	JScrollPane sp;
	private JPanel panel2 = new JPanel();
	JLabel l1;
	JButton btn;
	private  JLabel lblBackgroundImage;
	
	public ViewStudent() throws IOException {
		
		//frame section.
				
		
		//Code to view data in JTable
		List<Student> list=StudentData.view();
		int size=list.size();
		
		String data[][]=new String[size][12];
		int row=0;
		for(Student s:list){
			data[row][0]=String.valueOf(s.getRollno());
			data[row][1]=s.getName();
			data[row][2]=s.getEmail();
			data[row][3]=s.getCourse();
			data[row][4]=String.valueOf(s.getFee());
			data[row][5]=String.valueOf(s.getPaid());
			data[row][6]=String.valueOf(s.getDue());
			data[row][7]=s.getAddress();
			data[row][8]=s.getCity();
			data[row][9]=s.getState();
			data[row][10]=s.getCountry();
			data[row][11]=s.getContactno();
			
			row++;
		}
		String columnNames[]={"Rollno","Name","Email","Course","Fee","Paid","Due","Address","City","State","Country","Contact No"};
		
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
				btn = new JButton("Back");
				btn.setForeground(Color.BLACK);
				btn.setFont(new Font("Serif", Font.BOLD, 18));
				add(btn);
				
				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AccountantSection.main(new String[]{});
						frame.dispose();
					}
					
				});
	}
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewStudent();
					frame.setVisible(true);	
					frame.setSize(620,580);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
