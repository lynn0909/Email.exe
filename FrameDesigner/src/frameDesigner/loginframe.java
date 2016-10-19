package frameDesigner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.JComboBox;
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
	private JPasswordField passWord;//密码
	private JTextField useName;//用户名·
	public String testName="2042305316@qq.com";//设置测试用户名；
	public String testpassWord="123456";//设置测试密码123456
	private Integer nameTrue=1,passwordTrue=1;//用户名与密码校验成功标志，nameTrue和passWordTue均为1时进行登录，否则让用户再次输入；
	public Integer loadMark=1;//登录成功标志，值为1时登录成功，值为0时登录失败；
	JLabel unloadtip;//创建输入不正确时提示框；
	/**
	 * Launch the application.
	 */ 
	mail_selFrame n=new mail_selFrame();
	private Integer num=mail_selFrame.mailNum;//引用邮箱选择界面的mailNum邮箱类型序号；用来标志邮箱类型；
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginframe frame = new loginframe();//建立登录界面；
					frame.setVisible(true);//界面可视化；
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
		
		setTitle("My Mail");//设置登录界面标题；
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 559, 312);//设置登录界面的大小和位置；
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		useName = new JTextField();//用户名输入文本框；
		useName.setBounds(170, 102, 185, 21);//设置用户名输入文本框位置以及长宽；
		contentPane.add(useName);
		useName.setColumns(10);
		
		
		JButton button = new JButton("\u767B\u5F55");//登录按钮；
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//创建一个鼠标点击事件；
					  setVisible(false);//隐藏当前窗口；
					  nameTrue=testName.compareTo(useName.getText());
					  passwordTrue=testpassWord.compareTo(passWord.getText());
					  if(nameTrue==0&&(passwordTrue==0)){//密码用户名输入正确；
						  if(loadMark==1){//登录成功；
						  new mainFrame();
						  mainFrame frame=new mainFrame();//跳转到主界面；
						  frame.setVisible(true);//界面可视化；
						  }
						  else{//登录失败；
							  new loginFailed();
							  loginFailed frame = new loginFailed();//跳转到登录失败界面；
								frame.setVisible(true);//界面可视化；
						  }
					  }
					  else{
						  setVisible(true);//回到登录界面；
						  unloadtip.setText("用户名或密码不正确，请重新输入");//提示用户重新输入密码以及用户名；
					  }
				}

		});
		button.setBounds(216, 225, 93, 23);//设置按钮位置以及长宽；
		contentPane.add(button);
		
		JLabel label_useName = new JLabel("\u7528\u6237\u540D");//用户名·标签
		label_useName.setBounds(120, 108, 54, 15);//设置用户名标签的位置以及长宽；
		contentPane.add(label_useName);
		
		JLabel label_passWord = new JLabel("\u5BC6\u7801");//密码·标签·
		label_passWord.setBounds(120, 168, 54, 15);//设置密码标签的位置以及长宽；
		contentPane.add(label_passWord);
		
		passWord = new JPasswordField();//密码文本输入框；
		passWord.setBounds(170, 162, 185, 21);//设置密码文本输入框的位置以及长宽；
		contentPane.add(passWord);
		passWord.setColumns(10);
		
		JLabel lblcom;//邮箱后缀；
		if(num==1)//选择163邮箱；
		lblcom = new JLabel("@163.com");//显示163邮箱标签；
		else if(num==2)//选择qq邮箱；
		lblcom=new JLabel("@qq.com");//显示qq邮箱标签；
		else {
			lblcom=new JLabel("others");	
		}
		lblcom.setBounds(365, 102, 68, 32);//设置邮箱标签位置以及长宽；
		
		contentPane.add(lblcom);
		
		unloadtip = new JLabel("");//密码或用户名不正确提示框；
		unloadtip.setBounds(170, 200, 266, 15);
		//unloadtip.setBackground(Color.blue);
		unloadtip.setOpaque(true);
		contentPane.add(unloadtip);
		
	}
}
