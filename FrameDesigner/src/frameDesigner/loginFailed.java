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

public class loginFailed extends JFrame {//��¼ʧ����ʾ����

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFailed frame = new loginFailed();
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
	public loginFailed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(440, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		contentPane.setLayout(null);
		
		JLabel reminder = new JLabel("\u767B\u5F55\u5931\u8D25\uFF01");//��ʾ��¼ʧ�ܣ�
		reminder.setBounds(180, 100, 100, 20);
		contentPane.add(reminder);
		
		JButton button = new JButton("ȷ��");//ȷ����ť��
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//����һ��������¼���
					  setVisible(false);//���ص�ǰ���ڣ�
					  new loginframe();
					  loginframe frame = new loginframe();//������¼���棻
						frame.setVisible(true);//������ӻ���
				}

		});
		button.setBounds(160, 200, 93, 23);
		contentPane.add(button);
		
	}

}
