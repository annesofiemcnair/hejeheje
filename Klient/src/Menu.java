import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JPanel {

	private JButton btnLogOut;
	private JButton viewCalendar;
	private JLabel lblWelcome;
	
	
	public Menu(){
		setLayout(null);
		
		lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 200));
		lblWelcome.setBounds(20,6,261,38);
		add(lblWelcome);
		
		
		btnLogOut = new JButton ("log out");
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD,20));
		btnLogOut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				}
		}); 
		
		
		
	}


	}
	
