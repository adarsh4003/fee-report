package com.java.feereport;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
  
public class BackgroundTable
{
	public static void main(String[] args) throws IOException {
	    JFrame frame = new JFrame("Test");

	    final BufferedImage image = ImageIO.read( new File("C:\\Users\\P C\\Desktop\\images5.jpg"));

	    JTable table = new JTable(16, 3) {{
	        setOpaque(false);
	        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {{
	            setOpaque(false);
	        }});
	    }};

	    frame.add(new JScrollPane(table) {{
	            setOpaque(false);
	            getViewport().setOpaque(false);
	        }
	        @Override
	        protected void paintComponent(Graphics g) {
	            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	            super.paintComponent(g);
	        }

	    });
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true);
	    
	}
	
}