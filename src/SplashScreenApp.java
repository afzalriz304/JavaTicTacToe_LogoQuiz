import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class SplashScreenApp extends JWindow {  	//for splash screen

	JProgressBar progressBar = new JProgressBar();
	private Timer progressTimer=null;
	JLabel lblNewLabel_1 = new JLabel("MyApp");
	private Timer animationTimer=null;
	private boolean isVisible=true;
	int color=1;
	int Xcounter=1;
	int x;
	int progressCounter=1;
	
	public static void main(String[] args) {
					SplashScreenApp frame = new SplashScreenApp();
					frame.setVisible(true);
					frame.doanimation();
					frame.doprogress();
	}

	public SplashScreenApp() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 373);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.GREEN);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(21, 11, 415, 256);
		getContentPane().add(lblNewLabel);
		Icon icon= new ImageIcon(SplashScreenApp.class.getResource("splashscreen.gif"));
		lblNewLabel.setIcon(icon);
		
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(162, 301, 127, 22);
		getContentPane().add(lblNewLabel_1);
		
		
		progressBar.setBounds(31, 270, 405, 27);
		getContentPane().add(progressBar);
		
	}
	
	private void doanimation(){
		animationTimer=new Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(color){
				case 1:
					lblNewLabel_1.setForeground(Color.CYAN);
					break;
				case 2:
					lblNewLabel_1.setForeground(Color.DARK_GRAY);
					break;
				case 3:
					lblNewLabel_1.setForeground(Color.green);
					break;
				default:
					lblNewLabel_1.setForeground(Color.black);
					
				}
				
				if(color<=3){
					color++;
				}
				else{
					color=1;
				}
				if(Xcounter<=70){
					lblNewLabel_1.setBounds(x, 285 , 127, 38);
					x++;
					Xcounter++;
				}
				else{
					Xcounter=1;
					x=150;
				}
				lblNewLabel_1.setVisible(isVisible);
				isVisible =! isVisible;
			}

		});
		animationTimer.start();
	}
	
	private void doprogress(){
		progressTimer=new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(progressCounter<=progressBar.getMaximum()){
					progressBar.setValue(progressCounter);
					progressCounter++;
				}
				else{
					if(animationTimer != null){
						animationTimer.stop();
					}
					if(progressTimer !=null){
						progressTimer.stop();
					}
					SplashScreenApp.this.setVisible(false);
					SplashScreenApp.this.dispose();
					MainScreen obj=new MainScreen();
					obj.setVisible(true);
				}
			}
		});
		progressTimer.start();
	}
}
