package frameDesigner;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class writeMailFrame extends JFrame {

	private JPanel contentPane;
	private JTextField recipienttextField;
	private JTextField copytextField;
	private JTextField themetextField;
	private JTextField maintextField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					writeMailFrame frame = new writeMailFrame();//创建写邮件界面
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    ImageIcon img = new ImageIcon("image/allbox.jpg");//这是背景图片  
				JLabel imgLabel = new JLabel(img);//将背景图放在标签里。
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。  
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//设置背景标签的位置  
				Container cp=frame.getContentPane();  
				cp.setLayout(new BorderLayout());  
				((JPanel)cp).setOpaque(false); //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。  
	
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
	public writeMailFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 140, 1230, 550);//设置写邮件界面的位置以及长宽；
		setTitle("写邮件");//设置界面标题；
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton returnbutton = new JButton("\u8FD4\u56DE");
		returnbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);//隐藏写邮件界面；
				
			}
		});
		returnbutton.setBounds(10, 10, 93, 23);
		contentPane.add(returnbutton);
		
		JButton sendbutton = new JButton("\u53D1\u9001");
		sendbutton.setBounds(74, 43, 93, 23);
		contentPane.add(sendbutton);
		
		JButton timesendbutton = new JButton("\u5B9A\u65F6\u53D1\u9001");
		timesendbutton.setBounds(230, 43, 93, 23);
		contentPane.add(timesendbutton);
		
		JButton button = new JButton("\u5B58\u8349\u7A3F");
		button.setBounds(378, 43, 93, 23);
		contentPane.add(button);
		
		JLabel recipientlabel = new JLabel("\u6536\u4EF6\u4EBA");
		recipientlabel.setBounds(41, 89, 54, 15);
		contentPane.add(recipientlabel);
		
		JLabel copylabel = new JLabel("\u6284\u9001");
		copylabel.setBounds(41, 123, 54, 15);
		contentPane.add(copylabel);
		
		JLabel themelabel = new JLabel("\u4E3B\u9898");
		themelabel.setBounds(41, 156, 54, 15);
		contentPane.add(themelabel);
		
		JLabel mainlabel = new JLabel("\u6B63\u6587");
		mainlabel.setBounds(41, 183, 54, 15);
		contentPane.add(mainlabel);
		
		recipienttextField = new JTextField();
		recipienttextField.setBounds(147, 86, 1022, 21);
		contentPane.add(recipienttextField);
		recipienttextField.setColumns(10);
		
		copytextField = new JTextField();
		copytextField.setBounds(147, 120, 1022, 21);
		contentPane.add(copytextField);
		copytextField.setColumns(10);
		
		themetextField = new JTextField();
		themetextField.setBounds(147, 153, 1022, 21);
		contentPane.add(themetextField);
		themetextField.setColumns(10);
		
		maintextField = new JTextField();
		maintextField.setBounds(147, 180, 1022, 302);
		contentPane.add(maintextField);
		maintextField.setColumns(10);
	}
}
