package countwords.logic;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestAnalyzeCount {
	private Analyze an;

	@Before
	public void setUp() throws Exception {
		an = new Analyze();
	}

	@Test
	public void test01() {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Hello1");
		ts.add("Hello2");
		ts.add("Hello3");

		int actual = an.count(ts);
		int expected = 3;
		assertThat(actual,is(expected));
	}

}
