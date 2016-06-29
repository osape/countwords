package countwords.input;

import java.io.IOException;
import java.util.TreeSet;

public interface Read {
	public TreeSet<String> read(String inputInfo) throws IOException;
}
