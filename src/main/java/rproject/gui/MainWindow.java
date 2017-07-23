package rproject.gui;

import rproject.gui.panels.MapPanel;
import rproject.gui.panels.WelcomePanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

	private static MainWindow mainWindow;

	public static final int DEFAULT_WIDTH = 800;

	public static final int DEFAULT_HEIGHT = 500;

	// Panels (screens)

	private CardLayout cl = new CardLayout();

	private JPanel panelCont = new JPanel();

	private JPanel welcomePanel = new WelcomePanel();

	private JPanel mapPanel = new MapPanel();

	/**
	 * The constructor.
	 */
	public MainWindow() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setVisible(true);
		setTitle("RProject Risk Simulator v1.0");

		initGUI();
		initSettings();

		mainWindow = this;
	}

	private void initGUI() {
		panelCont.setLayout(cl);
		panelCont.add(welcomePanel, WelcomePanel.ID);
		panelCont.add(mapPanel, MapPanel.ID);

		cl.show(panelCont, WelcomePanel.ID);

		add(panelCont);

		// Game game = new Game("map1", new String[]{"A", "B", "C"});
		// game.start();
	}

	private void initSettings() {
		new Thread(() -> {
			// ...
		}).start();
	}

	/**
	 * Shows a panel specified by the given ID.
	 *
	 * @param id the identifier string of a panel to display
	 */
	public void show(String id) {
		cl.show(panelCont, id);
	}

	public static MainWindow getMainWindow() {
		return mainWindow;
	}

	/**
	 * Starts the RProject simulator.
	 *
	 * @param args command line arguments; not used in this program
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(MainWindow::new);
	}
}
