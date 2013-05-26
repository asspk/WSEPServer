package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import data.Comment;
import data.Message;
import data.User;

public class MessageTest {
	
	/*
	 * Check that the delete comment method works. It`s very important to check this method because it`s an important
	 * feature of our forum generator.
	 */
	@Test
	public void testDeleteComment() {
		Message m = new Message(new User("dan", "abc"), "hi", "how are you?");
		m.addComment(new Comment(new User("ben", "kvjf"), "i`m fine"));
		m.DeleteComment(0);
		assertEquals(m.display(), "By: " + "dan" + "\nTitle: " +  "hi" + "\nContent:" + "how are you?" + "\n");
	}
	
	/*
	 * Check that the delete comment method works. It`s very important to check this method because it`s an important
	 * feature of our forum generator.
	 */
	@Test
	public void testDisplayContent() {
		User u = new User("dan", "abc");
		Message m = new Message(u, "hi", "how are you?");
		m.addComment(new Comment(new User("ben", "kvjf"), "i`m fine"));
		assertEquals(m.display(), "By: " + "dan" + "\nTitle: " +  "hi" + "\nContent:" + "how are you?" + "\n" + "\t" + "ben" + ": " + "i`m fine" + "\n");
		m.addComment(new Comment(new User("avi", "oiur"), "aaa"));
		assertEquals(m.display(), "By: " + "dan" + "\nTitle: " +  "hi" + "\nContent:" + "how are you?" + "\n" + "\t" + "ben" + ": " + "i`m fine" + "\n" +  "\t" + "avi" + ": " + "aaa" + "\n");
	}

}
