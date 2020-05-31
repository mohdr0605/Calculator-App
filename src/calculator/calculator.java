package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator{
	
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea(2,10);
	 
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button0 = new JButton();

    JButton buttonadd = new JButton();
    JButton buttonsub = new JButton();
    JButton buttonmul = new JButton();
    JButton buttondiv = new JButton();
    JButton buttonclear = new JButton();
    JButton buttondot = new JButton();
    JButton buttonequal = new JButton();
    
    double number1,number2,result;
    int addc=0,mulc=0,subc=0,divc=0;
    
    public calculator() {
    	frame.setSize(350,500);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    	frame.setTitle("Rehan Calculator");
    	 
    	//Frame.setResizable(false);
    	frame.add(panel);
    	panel.setBackground(Color.LIGHT_GRAY);
    	Border border = BorderFactory.createLineBorder(Color.RED,4);
    	
    	panel.add(textarea);
    	
    	textarea.setBackground(Color.BLACK);
    	Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
    	textarea.setBorder(tborder);
    	Font font = new Font("arial",Font.BOLD,33);
    	textarea.setFont(font);
    	textarea.setForeground(Color.WHITE);
    	
        textarea.setPreferredSize(new Dimension(2,10));
        textarea.setLineWrap(true);
          
        button1.setPreferredSize(new Dimension(100,40));
        button2.setPreferredSize(new Dimension(100,40));
        button3.setPreferredSize(new Dimension(100,40));
        button4.setPreferredSize(new Dimension(100,40));
        button5.setPreferredSize(new Dimension(100,40));
        button6.setPreferredSize(new Dimension(100,40));
        button7.setPreferredSize(new Dimension(100,40));
        button8.setPreferredSize(new Dimension(100,40));
        button9.setPreferredSize(new Dimension(100,40));
        button0.setPreferredSize(new Dimension(100,40));
        
    	buttondot.setPreferredSize(new Dimension(100,40));
    	buttonsub.setPreferredSize(new Dimension(100,40));
    	buttonadd.setPreferredSize(new Dimension(100,40));
    	buttondiv.setPreferredSize(new Dimension(100,40));
    	buttonmul.setPreferredSize(new Dimension(100,40));
    	buttonequal.setPreferredSize(new Dimension(100,40));
    	buttonclear.setPreferredSize(new Dimension(100,40));
    	
    	panel.add(button1);
    	panel.add(button2);
    	panel.add(button3);
    	panel.add(button4);
    	panel.add(button5);
    	panel.add(button6);
    	panel.add(button7);
    	panel.add(button8);
    	panel.add(button9);
    	panel.add(button0);
    	panel.add(buttondot);
    	panel.add(buttonsub);
    	panel.add(buttonadd);
    	panel.add(buttondiv);
    	panel.add(buttonmul);
    	panel.add(buttonequal);
    	panel.add(buttonclear);
    	
        button1.addActionListner(this);
    	button2.addActionListner(this);
    	button3.addActionListner(this);
    	button4.addActionListner(this);
    	button5.addActionListner(this);
    	button6.addActionListner(this);
    	button7.addActionListner(this);
    	button8.addActionListner(this);
    	button9.addActionListner(this);
    	button0.addActionListner(this);
    	buttondot.addActionListner(this);
    	buttonsub.addActionListner(this);
    	buttonadd.addActionListner(this);
    	buttonmul.addActionListner(this);
    	buttondiv.addActionListner(this);
    	buttonequal.addActionListner(this);
    	buttonclear.addActionListner(this);
    	
    	
    	
		
		
		
		
		
    	
		
		
		
		
		
		
		
		
		
		
		
    	
		
    	
    			
    }
	
	
}