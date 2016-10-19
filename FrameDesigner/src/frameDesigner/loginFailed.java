package frameDesigner;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class loginFailed extends JFrame {//登录失败提示界面

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFailed frame = new loginFailed();
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
	public loginFailed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(440, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		contentPane.setLayout(null);
		
		JLabel reminder = new JLabel("\u767B\u5F55\u5931\u8D25\uFF01");//提示登录失败；
		reminder.setBounds(180, 100, 100, 20);
		contentPane.add(reminder);
		
		JButton button = new JButton("确定");//确定按钮；
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//创建一个鼠标点击事件；
					  setVisible(false);//隐藏当前窗口；
					  new loginframe();
					  loginframe frame = new loginframe();//跳到登录界面；
						frame.setVisible(true);//界面可视化；
				}

		});
		button.setBounds(160, 200, 93, 23);
		contentPane.add(button);
		
	}

}
