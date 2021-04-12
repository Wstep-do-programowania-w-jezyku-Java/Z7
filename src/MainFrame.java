import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener{
	private JButton b1,b2,b3,b4;
	private JPanel panel;
	private ButtonListener buttonListener;
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton clickedButton=(JButton) e.getSource();
			if(clickedButton==b3)
				JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), 
						"Kliknięto "+clickedButton.getText());
			else
				JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), 
						"Kliknięto "+clickedButton.getText());
		}
		
	}
	
	public MainFrame(String title) {
		super(title);
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension dim= tk.getScreenSize();
		setSize(dim.width/2, dim.height/2);
		setLocation(dim.width/4, dim.height/4);
		
		panel=new JPanel();
		setContentPane(panel);
		
		b1=new JButton("Przycisk 1");
		b2=new JButton("Przycisk 2");
		add(b1);
		add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), 
						"Kliknięto przycisk 1");
				
			}
		});
		
		b2.addActionListener(this);
		
		b3=new JButton("Przycisk 3");
		b4=new JButton("Przycisk 4");
		add(b3);
		add(b4);
		buttonListener=new ButtonListener();
		b3.addActionListener(buttonListener);
		b4.addActionListener(buttonListener);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, 
				"Kliknięto przycisk 2");
		
	}
}
