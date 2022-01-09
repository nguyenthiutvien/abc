package Exercise1_6;

import junit.framework.TestCase;

public class TheBookTest extends TestCase {

	public void testConstructor() {
		new TheBook("Robinson Crusoe", 15.50, 1719, new Author("Daniel Defoe", 1923));
		new TheBook("Heart of Darkness", 12.80, 1902, new Author("Joseph Conrad", 1967));
		Author author1 = new Author("Pat Conroy", 1929);
		new TheBook("Beach Music", 9.50, 1996, author1);

	}
}
