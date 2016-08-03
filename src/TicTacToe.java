import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class gridDemo extends JFrame{
	
	int count=0;
	JButton btnNewButton_1 = new JButton();
	JButton btnNewButton_2 = new JButton();
	JButton btnNewButton_3 = new JButton();
	JButton btnNewButton_4 = new JButton();
	JButton btnNewButton_5 = new JButton();
	JButton btnNewButton_6 = new JButton();
	JButton btnNewButton_7 = new JButton();
	JButton btnNewButton_8 = new JButton();
	JButton btnNewButton_9 = new JButton();
	
	public static void main(String[] args) {
					gridDemo frame = new gridDemo();
					frame.setVisible(true);
	}
	
	public gridDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 475);
		getContentPane().setLayout(new GridLayout(3, 3, 4, 4));
		
	
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_1.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_1.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_1);
		
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_2.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_2.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_2);
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_3.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_3.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_3);
		
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_4.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_4.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_4);
	
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_5.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_5.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_5);
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_6.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_6.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_6);
		
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_7.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_7.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_7);
		
		
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_8.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_8.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_8);
		
		
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count%2==0){
					btnNewButton_9.setText("X");
					}
				else if(count%2!=0){
					btnNewButton_9.setText("O");
					}
				counter();
			}
		});
		getContentPane().add(btnNewButton_9);
		
	}
	public void counter(){
			count++;
			result();
		}
	public void result(){
		if((btnNewButton_1.getText().equals("X"))&&(btnNewButton_2.getText().equals("X"))&&(btnNewButton_3.getText().equals("X"))){
			JOptionPane.showMessageDialog(gridDemo.this," X Win");
			System.exit(1);
		}
		if((btnNewButton_1.getText().equals("O"))&&(btnNewButton_2.getText().equals("O"))&&(btnNewButton_3.getText().equals("O"))){
			JOptionPane.showMessageDialog(gridDemo.this," O Win");
			System.exit(1);
		}
		if((btnNewButton_4.getText().equals("O"))&&(btnNewButton_5.getText().equals("O"))&&(btnNewButton_6.getText().equals("O"))){
			JOptionPane.showMessageDialog(gridDemo.this," O Win");
			System.exit(1);
		}
		if((btnNewButton_7.getText().equals("O"))&&(btnNewButton_8.getText().equals("O"))&&(btnNewButton_9.getText().equals("O"))){
			JOptionPane.showMessageDialog(gridDemo.this," O Win");
			System.exit(1);
		}
		if((btnNewButton_1.getText().equals("O"))&&(btnNewButton_4.getText().equals("O"))&&(btnNewButton_7.getText().equals("O"))){
			JOptionPane.showMessageDialog(gridDemo.this," O Win");
			System.exit(1);
		}
		if((btnNewButton_2.getText().equals("O"))&&(btnNewButton_5.getText().equals("O"))&&(btnNewButton_8.getText().equals("O"))){
			JOptionPane.showMessageDialog(gridDemo.this," O Win");
			System.exit(1);
		}
		if((btnNewButton_3.getText().equals("O"))&&(btnNewButton_6.getText().equals("O"))&&(btnNewButton_9.getText().equals("O"))){
			JOptionPane.showMessageDialog(gridDemo.this," O Win");
			System.exit(1);
		}
		if((btnNewButton_1.getText().equals("O"))&&(btnNewButton_5.getText().equals("O"))&&(btnNewButton_9.getText().equals("O"))){
			JOptionPane.showMessageDialog(gridDemo.this," O Win");
			System.exit(1);
		}
		if((btnNewButton_3.getText().equals("O"))&&(btnNewButton_5.getText().equals("O"))&&(btnNewButton_7.getText().equals("O"))){
			JOptionPane.showMessageDialog(gridDemo.this," O Win");
			System.exit(1);
		}
		if((btnNewButton_4.getText().equals("X"))&&(btnNewButton_5.getText().equals("X"))&&(btnNewButton_6.getText().equals("X"))){
			JOptionPane.showMessageDialog(gridDemo.this," X Win");
			System.exit(1);
		}
		if((btnNewButton_7.getText().equals("X"))&&(btnNewButton_8.getText().equals("X"))&&(btnNewButton_9.getText().equals("X"))){
			JOptionPane.showMessageDialog(gridDemo.this," X Win");
			System.exit(1);
		}
		if((btnNewButton_1.getText().equals("X"))&&(btnNewButton_4.getText().equals("X"))&&(btnNewButton_7.getText().equals("X"))){
			JOptionPane.showMessageDialog(gridDemo.this," X Win");
			System.exit(1);
		}
		if((btnNewButton_2.getText().equals("X"))&&(btnNewButton_5.getText().equals("X"))&&(btnNewButton_8.getText().equals("X"))){
			JOptionPane.showMessageDialog(gridDemo.this," X Win");
			System.exit(1);
		}
		if((btnNewButton_3.getText().equals("X"))&&(btnNewButton_6.getText().equals("X"))&&(btnNewButton_9.getText().equals("X"))){
			JOptionPane.showMessageDialog(gridDemo.this," X Win");
			System.exit(1);
		}
		if((btnNewButton_1.getText().equals("X"))&&(btnNewButton_5.getText().equals("X"))&&(btnNewButton_9.getText().equals("X"))){
			JOptionPane.showMessageDialog(gridDemo.this," X Win");
			System.exit(1);
		}
		if((btnNewButton_3.getText().equals("X"))&&(btnNewButton_5.getText().equals("X"))&&(btnNewButton_7.getText().equals("X"))){
			JOptionPane.showMessageDialog(gridDemo.this," X Win");
			System.exit(1);
		}
		
	}
}
