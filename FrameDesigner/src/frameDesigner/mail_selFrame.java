package frameDesigner;
import  java.awt.*;  
import  javax.swing.*;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import javax.print.attribute.standard.PrinterLocation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class mail_selFrame extends JFrame {
	public static void main(String[] args){
		 
		    
		  
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mail_selFrame frame = new mail_selFrame();//创建收件箱界面；
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    ImageIcon img = new ImageIcon("001.jpg");//这是背景图片  
				JLabel imgLabel = new JLabel(img);//将背景图放在标签里。
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。  
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//设置背景标签的位置  
				Container cp=frame.getContentPane();  
				cp.setLayout(new BorderLayout());  
				((JPanel)cp).setOpaque(false); //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。  
	
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static JPanel contentPane;
	public static Integer mailNum=0;//建立静态整数类型，mailNum作为邮箱类型编号；
	private JPanel _163image;
	private Panel qqimage;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
public mail_selFrame() {
		
		
		
		setTitle("Select Mail");//设置页面标题；
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 560, 312);//设置页面位置及其长宽；
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon imgQQ = new ImageIcon("image/qqlogo.jpg");
		JLabel logQQ= new JLabel(imgQQ);
		logQQ.setBounds(157, 10, 93, 75);
		contentPane.add(logQQ);
		
		ImageIcon img163 = new ImageIcon("image/_163logo.jpg");
		JLabel log163 = new JLabel(img163);
		log163.setBounds(33, 10, 93, 75);
		contentPane.add(log163);
		
		JButton button_163 = new JButton("163\u90AE\u7BB1");//设置163邮箱选择按钮；
		button_163.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//建立鼠标点击事件；
				setVisible(false);//隐藏当前窗口；
				mailNum=1;//163邮箱的序号为1；
			
				  new loginframe();
				  loginframe frame = new loginframe();//跳转到登录界面；
				  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    ImageIcon img = new ImageIcon("image/login.jpg");//这是背景图片  
				JLabel imgLabel = new JLabel(img);//将背景图放在标签里。
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。  
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//设置背景标签的位置  
				Container cp=frame.getContentPane();  
				cp.setLayout(new BorderLayout());  
				((JPanel)cp).setOpaque(false); //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。  
	
					frame.setVisible(true);//界面可视化；
					
			}
		});
		button_163.setBounds(33, 95, 93, 23);//设置163邮箱选择按钮的位置以及长宽；
		contentPane.add(button_163);
		
		JButton button_qq = new JButton("QQ\u90AE\u7BB1");//设置qq邮箱选择按钮；
		button_qq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_qq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//建立鼠标点击事件；
				setVisible(false);//隐藏当前窗口；
				mailNum=2;//qq邮箱的序号为2；
				  new loginframe();
				  loginframe frame = new loginframe();//跳转到登录界面；
				  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    ImageIcon img = new ImageIcon("image/login.jpg");//这是背景图片  
				JLabel imgLabel = new JLabel(img);//将背景图放在标签里。
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。  
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//设置背景标签的位置  
				Container cp=frame.getContentPane();  
				cp.setLayout(new BorderLayout());  
				((JPanel)cp).setOpaque(false); //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。  
	
					frame.setVisible(true);//界面可视化；
					
				
			}
		});
		button_qq.setBounds(157, 95, 93, 23);//设置qq邮箱选择按钮的位置以及长宽；
		contentPane.add(button_qq);
		
		JButton button_xl = new JButton("\u65B0\u6D6A\u90AE\u7BB1");//新浪邮箱选择按钮；
		button_xl.setBounds(280, 95, 93, 23);
		contentPane.add(button_xl);
		
		ImageIcon imgxl = new ImageIcon("image/xllogo.jpg");
		JLabel logxl = new JLabel(imgxl);
		logxl.setBounds(280, 10, 93, 75);
		contentPane.add(logxl);
		
		JButton button_139 = new JButton("139\u90AE\u7BB1");//139邮箱选择按钮；
		button_139.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_139.setBounds(415, 95, 93, 23);
		contentPane.add(button_139);
		
		ImageIcon img139 = new ImageIcon("image/_139logo.jpg");
		JLabel log139 = new JLabel(img139);
		log139.setBounds(415, 10, 93, 75);
		contentPane.add(log139);
		
		//JPanel panel = new JPanel();
		//panel.setBounds(33, 10, 93, 75);
		//contentPane.add(panel);
		
	
	}	
}
