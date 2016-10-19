package frameDesigner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
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
	public mainFrame() {
		setBackground(new Color(0, 255, 255));
		setTitle("My Mail");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1376, 700);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new MatteBorder(2, 2, 3, 3, (Color) new Color(0, 255, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u767B\u5F55\u5176\u4ED6\u8D26\u53F7");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);//隐藏当前窗口；
				  new loginframe();
				  loginframe frame = new loginframe();//跳到登录界面；
					frame.setVisible(true);//界面可视化；
			}
		});
		button.setBounds(1188, 0, 156, 23);
		contentPane.add(button);
	}
}
