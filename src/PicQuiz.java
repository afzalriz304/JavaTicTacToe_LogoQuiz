import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.TableView.TableCell;
import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URI;
import java.util.*;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PicQuiz extends JFrame {
	
	int count=0;
	int counter=0;
	JLabel lblNewLabel = new JLabel();
	JTextField textField= new JTextField();
	JButton btnNewButton = new JButton("check");
	
	JLabel lblNewLabel_1 = new JLabel();
	JTextField textField_1 = new JTextField();
	JButton btnNewButton_1 = new JButton("check");
	
	JLabel lblNewLabel_2 = new JLabel();
	JLabel lblNewLabel_3 = new JLabel();
	JLabel lblNewLabel_4 = new JLabel();
	JTextField textField_2 = new JTextField();
	JTextField textField_3 = new JTextField();
	JTextField textField_4 = new JTextField();
	JButton btnNewButton_2 = new JButton("check");
	JButton btnNewButton_3 = new JButton("check");
	JButton btnNewButton_4 = new JButton("check");
	
	public static void main(String[] args) {
					PicQuiz frame = new PicQuiz();
					frame.setVisible(true);
					
	}

	public PicQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 640);
		getContentPane().setLayout(null);
		
		
		lblNewLabel.setBounds(30, 26, 150,150);
		getContentPane().add(lblNewLabel);
		Icon icon =new ImageIcon(PicQuiz.class.getResource("new_opera_logo (150x150).jpg"));
		lblNewLabel.setIcon(icon);
		 
		textField.setBounds(30, 187, 150, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(textField.getText().equalsIgnoreCase("opera")){
					 btnNewButton.setVisible(false);
					 textField.setVisible(false);
					 
					 JLabel label= new JLabel("Correct");
					 label.setBounds(30, 187, 150, 28);
					 getContentPane().add(label);
					 label.setVisible(true);
					 count++;
					 counter++;
				 }
				 else{
					 btnNewButton.setVisible(false);
					 textField.setVisible(false);
					 JLabel label= new JLabel("InCorrect");
					 label.setBounds(30, 187, 150, 28);
					 getContentPane().add(label);
					 label.setVisible(true);
					 count--;
					 counter++;
				 }
			}
		});
		btnNewButton.setBounds(30, 226, 150, 25);
		getContentPane().add(btnNewButton);
		lblNewLabel_1.setBounds(180, 26, 150, 150);
		Icon icon_1 =new ImageIcon(PicQuiz.class.getResource("firefox-256 (150x150).jpg"));
		lblNewLabel_1.setIcon(icon_1);

		
		getContentPane().add(lblNewLabel_1);
		textField_1.setColumns(10);
		textField_1.setBounds(180, 187, 150, 28);
		
		getContentPane().add(textField_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_1.getText().equalsIgnoreCase("firefox")){
					 btnNewButton_1.setVisible(false);
					 textField_1.setVisible(false);
					 
					 JLabel label_1= new JLabel("Correct");
					 label_1.setBounds(180, 187, 150, 28);
					 getContentPane().add(label_1);
					 label_1.setVisible(true);
					 count++;
					 counter++;
				 }
				 else{
					 btnNewButton_1.setVisible(false);
					 textField_1.setVisible(false);
					 JLabel label_1= new JLabel("InCorrect");
					 label_1.setBounds(180, 187, 150, 28);
					 getContentPane().add(label_1);
					 label_1.setVisible(true);
					 count--;
					 counter++;
				 }
			}
		});
		btnNewButton_1.setBounds(180, 226, 150, 25);
		
		getContentPane().add(btnNewButton_1);
		lblNewLabel_2.setBounds(331, 26, 150, 150);
		Icon icon_2 =new ImageIcon(PicQuiz.class.getResource("manchester_united (150x150).jpg"));
		lblNewLabel_2.setIcon(icon_2);

		
		getContentPane().add(lblNewLabel_2);
		lblNewLabel_3.setBounds(487, 26, 150, 150);
		Icon icon_3 =new ImageIcon(PicQuiz.class.getResource("Linux-logo-w-shadows-by-Creato937 (150x150).jpg"));
		lblNewLabel_3.setIcon(icon_3);

		
		getContentPane().add(lblNewLabel_3);
		lblNewLabel_4.setBounds(642, 26, 150, 150);
		Icon icon_4 =new ImageIcon(PicQuiz.class.getResource("fc_barcelona_101029 (150x150).jpg"));
		lblNewLabel_4.setIcon(icon_4);

		
		getContentPane().add(lblNewLabel_4);
		textField_2.setColumns(10);
		textField_2.setBounds(331, 187, 150, 28);
		
		getContentPane().add(textField_2);
		textField_3.setColumns(10);
		textField_3.setBounds(487, 187, 150, 28);
		
		getContentPane().add(textField_3);
		textField_4.setColumns(10);
		textField_4.setBounds(642, 187, 150, 28);
		
		getContentPane().add(textField_4);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_2.getText().equalsIgnoreCase("Manchester")){
					 btnNewButton_2.setVisible(false);
					 textField_2.setVisible(false);
					 
					 JLabel label_2= new JLabel("Correct");
					 label_2.setBounds(331, 187, 150, 28);
					 getContentPane().add(label_2);
					 label_2.setVisible(true);
					 count++;
					 counter++;
					 result();
				 }
				 else{
					 btnNewButton_2.setVisible(false);
					 textField_2.setVisible(false);
					 JLabel label_2= new JLabel("InCorrect");
					 label_2.setBounds(331, 187, 150, 28);
					 getContentPane().add(label_2);
					 label_2.setVisible(true);
					 count--;
					 counter++;
					 result();
				 }
			}
		});
		btnNewButton_2.setBounds(331, 226, 150, 25);
		
		getContentPane().add(btnNewButton_2);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_3.getText().equalsIgnoreCase("linux")){
					 btnNewButton_3.setVisible(false);
					 textField_3.setVisible(false);
					 
					 JLabel label_3= new JLabel("Correct");
					 label_3.setBounds(487, 187, 150, 28);
					 getContentPane().add(label_3);
					 label_3.setVisible(true);
					 count++;
					 counter++;
					 result();
				 }
				 else{
					 btnNewButton_3.setVisible(false);
					 textField_3.setVisible(false);
					 JLabel label_3= new JLabel("InCorrect");
					 label_3.setBounds(487, 187, 150, 28);
					 getContentPane().add(label_3);
					 label_3.setVisible(true);
					 count--;
					 counter++;
					 result();
				 }
			}
		});
		btnNewButton_3.setBounds(487, 226, 150, 25);
		
		getContentPane().add(btnNewButton_3);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_4.getText().equalsIgnoreCase("barcelona")){
					 btnNewButton_4.setVisible(false);
					 textField_4.setVisible(false);
					 
					 JLabel label_4= new JLabel("Correct");
					 label_4.setBounds(642, 187, 150, 28);
					 getContentPane().add(label_4);
					 label_4.setVisible(true);
					 count++;
					 counter++;
					 result();
				 }
				 else{
					 btnNewButton_4.setVisible(false);
					 textField_4.setVisible(false);
					 JLabel label_4= new JLabel("InCorrect");
					 label_4.setBounds(642, 187, 150, 28);
					 getContentPane().add(label_4);
					 label_4.setVisible(true);
					 count--;
					 counter++;
					 result();
				 }
			}
		});
		btnNewButton_4.setBounds(642, 226, 150, 25);
		getContentPane().add(btnNewButton_4);
		
		
		
		
	}
	
	public void result(){
		if(counter==5){
			JButton btnResult = new JButton("SCORE");
			
			Integer in=new Integer(count);

			btnResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				JLabel resultlabel=new JLabel();
				resultlabel.setText(in.toString());
				getContentPane().add(resultlabel);
				resultlabel.setVisible(true);
				resultlabel.setBounds(600, 376, 200, 50);
				}
			});
			btnResult.setBounds(318, 376, 200, 50);
			
			getContentPane().add(btnResult);

		}
	}
}
