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

public class outboxFrame extends JFrame {

	private JPanel contentPane;

	/**
	 *建立发件箱界面；
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					outboxFrame frame = new outboxFrame();//创建发件箱界面
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				    ImageIcon img = new ImageIcon("image/allboxs.jpg");//这是背景图片  
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
	public outboxFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("发件箱");
		setBounds(120, 140, 1230, 550);//设置发件箱页面位置以及长宽；
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton returnButton = new JButton("\u8FD4\u56DE");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//创建返回按钮鼠标点击事件；
				setVisible(false);//隐藏发件箱界面；
			}
		});
		returnButton.setBounds(10, 10, 93, 23);
		contentPane.add(returnButton);
		
		JButton deletebutton = new JButton("\u5220\u9664");
		deletebutton.setBounds(56, 43, 93, 23);
		contentPane.add(deletebutton);
		
		JButton alldeletebutton = new JButton("\u5168\u90E8\u5220\u9664");
		alldeletebutton.setBounds(212, 43, 93, 23);
		contentPane.add(alldeletebutton);
		
		JButton forwardbutton = new JButton("\u8F6C\u53D1");
		forwardbutton.setBounds(374, 43, 93, 23);
		contentPane.add(forwardbutton);
	}

}
