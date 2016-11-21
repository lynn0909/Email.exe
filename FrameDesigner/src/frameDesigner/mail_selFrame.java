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
					mail_selFrame frame = new mail_selFrame();//�����ռ�����棻
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    ImageIcon img = new ImageIcon("001.jpg");//���Ǳ���ͼƬ  
				JLabel imgLabel = new JLabel(img);//������ͼ���ڱ�ǩ�
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����  
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ�����ǩ��λ��  
				Container cp=frame.getContentPane();  
				cp.setLayout(new BorderLayout());  
				((JPanel)cp).setOpaque(false); //ע����������������Ϊ͸��������LayeredPane����еı���������ʾ������  
	
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static JPanel contentPane;
	public static Integer mailNum=0;//������̬�������ͣ�mailNum��Ϊ�������ͱ�ţ�
	private JPanel _163image;
	private Panel qqimage;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
public mail_selFrame() {
		
		
		
		setTitle("Select Mail");//����ҳ����⣻
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 560, 312);//����ҳ��λ�ü��䳤��
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
		
		JButton button_163 = new JButton("163\u90AE\u7BB1");//����163����ѡ��ť��
		button_163.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//����������¼���
				setVisible(false);//���ص�ǰ���ڣ�
				mailNum=1;//163��������Ϊ1��
			
				  new loginframe();
				  loginframe frame = new loginframe();//��ת����¼���棻
				  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    ImageIcon img = new ImageIcon("image/login.jpg");//���Ǳ���ͼƬ  
				JLabel imgLabel = new JLabel(img);//������ͼ���ڱ�ǩ�
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����  
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ�����ǩ��λ��  
				Container cp=frame.getContentPane();  
				cp.setLayout(new BorderLayout());  
				((JPanel)cp).setOpaque(false); //ע����������������Ϊ͸��������LayeredPane����еı���������ʾ������  
	
					frame.setVisible(true);//������ӻ���
					
			}
		});
		button_163.setBounds(33, 95, 93, 23);//����163����ѡ��ť��λ���Լ�����
		contentPane.add(button_163);
		
		JButton button_qq = new JButton("QQ\u90AE\u7BB1");//����qq����ѡ��ť��
		button_qq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_qq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//����������¼���
				setVisible(false);//���ص�ǰ���ڣ�
				mailNum=2;//qq��������Ϊ2��
				  new loginframe();
				  loginframe frame = new loginframe();//��ת����¼���棻
				  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    ImageIcon img = new ImageIcon("image/login.jpg");//���Ǳ���ͼƬ  
				JLabel imgLabel = new JLabel(img);//������ͼ���ڱ�ǩ�
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����  
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ�����ǩ��λ��  
				Container cp=frame.getContentPane();  
				cp.setLayout(new BorderLayout());  
				((JPanel)cp).setOpaque(false); //ע����������������Ϊ͸��������LayeredPane����еı���������ʾ������  
	
					frame.setVisible(true);//������ӻ���
					
				
			}
		});
		button_qq.setBounds(157, 95, 93, 23);//����qq����ѡ��ť��λ���Լ�����
		contentPane.add(button_qq);
		
		JButton button_xl = new JButton("\u65B0\u6D6A\u90AE\u7BB1");//��������ѡ��ť��
		button_xl.setBounds(280, 95, 93, 23);
		contentPane.add(button_xl);
		
		ImageIcon imgxl = new ImageIcon("image/xllogo.jpg");
		JLabel logxl = new JLabel(imgxl);
		logxl.setBounds(280, 10, 93, 75);
		contentPane.add(logxl);
		
		JButton button_139 = new JButton("139\u90AE\u7BB1");//139����ѡ��ť��
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
