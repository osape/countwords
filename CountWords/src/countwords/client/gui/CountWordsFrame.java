package countwords.client.gui;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CountWordsFrame extends JFrame {
	private JTextArea messageArea;
	public CountWordsFrame() {
		super("単語分析");
		setBounds(100, 100, 500, 500);

		messageArea = new JTextArea();
		add(messageArea);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
