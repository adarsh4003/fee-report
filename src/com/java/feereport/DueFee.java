package com.java.feereport;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class DueFee extends JFrame {
	static DueFee frame;
	private JPanel panel2 = new JPanel();
	JButton btn1;

	private JLabel lblBackgroundImage;
	private JButton btn;

	public  DueFee() {
		
		
		//Code to view data in JTable
		List<Student> list=StudentData.due();
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
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		setBounds(100, 100, 800, 400);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// Adding Back Button to the eventLisner
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		btn1 = new JButton("Back");
		add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(new String[]{});
				frame.dispose();
			}
			
		});
		
		 //initializes panels and panel layout
		BackgroundImage image = new BackgroundImage();
		panel2 = image.backgroudImage(panel2);
		lblBackgroundImage = image.getbackgroundimage();
		add(lblBackgroundImage);		
	}

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DueFee();
					frame.setVisible(true);
					frame.setSize(500,500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
