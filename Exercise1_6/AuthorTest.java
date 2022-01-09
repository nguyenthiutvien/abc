package Exercise1_6;

import junit.framework.TestCase;

public class AuthorTest extends TestCase {
	public void testAuthorConstructor() {
		new Author("Daniel Defoe", 1923);
		new Author("Joseph Conrad", 1967);
		new Author("Pat Conroy", 1929);
	}
}
