package countwords.input;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestReadFileRead {
	private ReadFile rf;

	@Before
	public void setUp() throws Exception {
		rf = new ReadFile();
	}

	@Test
	public void testRead01() throws Exception {
		TreeSet<String> expected = new TreeSet<String>();

		TreeSet<String> actual = rf.read(".\\textfile\\test.txt");

		assertThat(actual,is(
				contains(
				"2015",
				"A",
				"August",
				"Blue",
				"Hokutosei,",
				"Italian",
				"KAWAGUCHI,",
				"Kawaguchi,",
				"Prefecture.",
				"Saitama",
				"Train,",
				"an",
				"as",
				"been",
				"blue",
				"car",
				"dining",
				"express,",
				"has",
				"in",
				"last",
				"of",
				"restaurant",
				"retired",
				"revived",
				"sleeper",
				"the",
				"which",
				"—"
				)));

	}
}
