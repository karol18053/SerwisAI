package serwis;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;


public class Info extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static JFrame okno = new JFrame();
	
	public Info() {//konstruktor klasy info
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();//tworzenie panelu (tsa)
		Color kolor = new Color(0, 128, 255);
		panel.setBackground(kolor);
		panel.setBounds(0, 0, 400, 123);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton okButton = new JButton("OK");// przycisk ok
		okButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {//funkcjonalność przycisku ok
				setVisible(false);
			}
		});
		okButton.setBounds(150, 80, 89, 23);
		panel.add(okButton);
		
		JLabel lblInfo = new JLabel("Sprawd\u017A czy wszystkie dane \r\nzosta\u0142y wprowadzone poprawnie");// wyświetlany text
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setForeground(Color.RED);
		lblInfo.setBounds(5, 10, 390, 69);
		panel.add(lblInfo);
		setTitle("Co� posz�o nie tak!");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\karol\\Desktop\\Studia\\Inżynierka\\Serwis\\Logo\\RT.ico"));
		setVisible(true);
		setBounds(0, 0, 400, 150);
		setLocationRelativeTo(null);
		setResizable(false);		
	}
					
	
}



