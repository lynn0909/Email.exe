package frameDesigner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.List;
import frameDesigner.mail_selFrame;
public class loginframe extends JFrame {

	private JPanel contentPane;
	private JPasswordField passWord;//����
	private JTextField useName;//�û�����
	public String testName="2042305316@qq.com";//���ò����û�����
	public String testpassWord="123456";//���ò�������123456
	private Integer nameTrue=1,passwordTrue=1;//�û���������У��ɹ���־��nameTrue��passWordTue��Ϊ1ʱ���е�¼���������û��ٴ����룻
	public Integer loadMark=1;//��¼�ɹ���־��ֵΪ1ʱ��¼�ɹ���ֵΪ0ʱ��¼ʧ�ܣ�
	JLabel unloadtip;//�������벻��ȷʱ��ʾ��
	/**
	 * Launch the application.
	 */ 
	mail_selFrame n=new mail_selFrame();
	private Integer num=mail_selFrame.mailNum;//��������ѡ������mailNum����������ţ�������־�������ͣ�
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginframe frame = new loginframe();//������¼���棻
					 
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
					    ImageIcon img = new ImageIcon("image/login.jpg");//���Ǳ���ͼƬ  
					JLabel imgLabel = new JLabel(img);//������ͼ���ڱ�ǩ�
					frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����  
					imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ�����ǩ��λ��  
					Container cp=frame.getContentPane();  
					cp.setLayout(new BorderLayout());  
					((JPanel)cp).setOpaque(false); //ע����������������Ϊ͸��������LayeredPane����еı���������ʾ������  
		
	
					frame.setVisible(true);//������ӻ���
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginframe() {
		
		setTitle("My Mail");//���õ�¼������⣻
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 559, 312);//���õ�¼����Ĵ�С��λ�ã�
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		useName = new JTextField();//�û��������ı���
		useName.setBounds(170, 102, 185, 21);//�����û��������ı���λ���Լ�����
		contentPane.add(useName);
		useName.setColumns(10);
		
		
		JButton button = new JButton("\u767B\u5F55");//��¼��ť��
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//����һ��������¼���
					  setVisible(false);//���ص�ǰ���ڣ�
					  nameTrue=testName.compareTo(useName.getText());
					  passwordTrue=testpassWord.compareTo(passWord.getText());
					  if(nameTrue==0&&(passwordTrue==0)){//�����û���������ȷ��
						  if(loadMark==1){//��¼�ɹ���
						  new mainFrame();
						  mainFrame frame1=new mainFrame();//��ת�������棻
						  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
						    ImageIcon img = new ImageIcon("image/mainFrame.jpg");//���Ǳ���ͼƬ  
						JLabel imgLabel = new JLabel(img);//������ͼ���ڱ�ǩ�
						frame1.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����  
						imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ�����ǩ��λ��  
						Container cp=frame1.getContentPane();  
						cp.setLayout(new BorderLayout());  
						((JPanel)cp).setOpaque(false); //ע����������������Ϊ͸��������LayeredPane����еı���������ʾ������  
			
						  
						  frame1.setVisible(true);//������ӻ���
						  }
						  else{//��¼ʧ�ܣ�
							  new loginFailed();
							  loginFailed frame = new loginFailed();//��ת����¼ʧ�ܽ��棻
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
					  }
					  else{
						  setVisible(true);//�ص���¼���棻
						  unloadtip.setText("�û��������벻��ȷ������������");//��ʾ�û��������������Լ��û�����
						  
					  }
				}

		});
		button.setBounds(216, 225, 93, 23);//���ð�ťλ���Լ�����
		contentPane.add(button);
		
		
		JLabel label_useName = new JLabel("\u7528\u6237\u540D");//�û�������ǩ
		label_useName.setBounds(120, 108, 54, 15);//�����û�����ǩ��λ���Լ�����
		contentPane.add(label_useName);
		
		JLabel label_passWord = new JLabel("\u5BC6\u7801");//���롤��ǩ��
		label_passWord.setBounds(120, 168, 54, 15);//���������ǩ��λ���Լ�����
		contentPane.add(label_passWord);
		
		passWord = new JPasswordField();//�����ı������
		passWord.setBounds(170, 162, 185, 21);//���������ı�������λ���Լ�����
		contentPane.add(passWord);
		passWord.setColumns(10);
		
		JLabel lblcom;//�����׺��
		if(num==1)//ѡ��163���䣻
		lblcom = new JLabel("@163.com");//��ʾ163�����ǩ��
		else if(num==2)//ѡ��qq���䣻
		lblcom=new JLabel("@qq.com");//��ʾqq�����ǩ��
		else {
			lblcom=new JLabel("others");	
		}
		lblcom.setBounds(365, 102, 68, 32);//���������ǩλ���Լ�����
		
		contentPane.add(lblcom);
		
		unloadtip = new JLabel("");//������û�������ȷ��ʾ��
		unloadtip.setBounds(170, 200, 266, 15);
		//unloadtip.setBackground(Color.BLACK);
		unloadtip.setOpaque(false);
		contentPane.add(unloadtip);
		
	}
}
