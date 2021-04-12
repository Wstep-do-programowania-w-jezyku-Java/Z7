import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainFrame mf=new MainFrame("Okno główne");
				mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mf.setVisible(true);
			}
		});
	}

}
