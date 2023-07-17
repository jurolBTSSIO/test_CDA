package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class AppFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static AppFrame appFrame;
	static public Dimension dimension;
	public Container controlHost;

	public AppFrame() {
		super("");

		controlHost = getContentPane();
		this.setTitle("Tableau des ventes");
		dimension = getToolkit().getScreenSize();
		this.setSize(dimension);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setResizable(true);
		this.setFocusable(true);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		appFrame = new AppFrame();
		appFrame.controlHost.add(new VueTableauDesVentes(), BorderLayout.NORTH);
		appFrame.controlHost.add(new VueVide(), BorderLayout.CENTER);
		appFrame.setVisible(true);
	}
}
