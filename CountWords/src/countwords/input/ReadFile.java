package countwords.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class ReadFile implements Read {
	public TreeSet<String> read(String fileName) throws IOException {
		TreeSet<String> ts = new TreeSet<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while( (line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while(st.hasMoreElements()) {
					String tmpStr = st.nextToken();
					ts.add(tmpStr);
				}
			}
		}
		return ts;
	}
}
