package radiobutton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class myframe extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
     JFrame frame;
     JRadioButton rb1,rb2,rb3;
    
     myframe(){
	
	frame=new JFrame();
	frame.setLayout(new FlowLayout());
	rb1=new JRadioButton();
	rb2=new JRadioButton();
	rb3=new JRadioButton();
	ButtonGroup bg=new ButtonGroup();
	 rb1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    System.out.println( "First Choice Selected is ->"+ rb1.isSelected());            
		    
		}
	});
	 rb2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    System.out.println( "Second Choice Selected is ->"+ rb2.isSelected());            
		    
		}
	});
	 
	 
	 rb3.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    System.out.println( "Third Choice Selected is ->"+ rb3.isSelected());  
		   
		    
		}
	});
	
	
	rb1.setName("Radio Button 1");
	rb2.setName("Radio Button 2");
	rb3.setName("Radio Button 3");
	rb1.setText("First Chocie");
	rb2.setText("Second Chocie");
	rb3.setText("Third Chocie");
	rb1.setToolTipText("Click to Select");
	rb1.setFont(new Font("Serg UI",Font.PLAIN,24));
	rb2.setFont(new Font("Serg UI",Font.PLAIN,24));
	rb3.setFont(new Font("Serg UI",Font.PLAIN,24));
	 
	bg.add(rb1);
	bg.add(rb2);
	bg.add(rb3);
	
	 frame.add(rb1);
	 frame.add(rb2);
	 frame.add(rb3);
	 frame.pack();
	 frame.setVisible(true);
     
     
     
     } // constructor
    
   
     
    
} // end of class



