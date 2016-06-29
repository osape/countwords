package countwords.start;

import java.io.IOException;
import java.util.TreeSet;

import javax.swing.JTextArea;

import countwords.client.gui.CountWordsFrame;
import countwords.input.ReadFile;
import countwords.logic.Analyze;

public class StartGUI {
	private final static String FILE = ".\\textfile\\test.txt";

	public static void main(String[] args) {
		CountWordsFrame cwf = new CountWordsFrame();
		JTextArea messageArea = cwf.getMessageArea();
		ReadFile rf = new ReadFile();
		TreeSet<String> ts = null;

		try {
			ts = rf.read(FILE);
			Analyze analyze = new Analyze();
			String count = String.valueOf(analyze.count(ts));
			messageArea.setText(count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
