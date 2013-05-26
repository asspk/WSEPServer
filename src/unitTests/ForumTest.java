package unitTests;

import static org.junit.Assert.*;


import org.junit.Test;


import data.Forum;
import data.SubForum;
import data.User;

public class ForumTest {
	
	/*
	 * Check the method which responsible for adding a new user to the forum. It`s important to check
	 * this method mainly because it will be activated many times.
	 */
	@Test
	public void testAddForumUser() {
		Forum f = new Forum();
		f.setName("cars");
		User u1 = new User("dan", "123");
		User u2 = new User("ben", "567");
		f.addForumUser(u1);
		assertEquals(f.userExists("dan"), u1);
		assertEquals(f.userExists("ben"), null);
		f.addForumUser(u2);
		assertEquals(f.userExists("ben"), u2);
	}
	
	/*
	 * Check the method which responsible for displaying the content of the forum. It`s important to check
	 * this method mainly because it will be activated many times.
	 */
	@Test
	public void testDisplayContent() {
		Forum f = new Forum();
		f.setName("cars");
		User u1 = new User("dan", "123");
		User u2 = new User("ben", "567");
		f.addForumUser(u1);
		f.addForumUser(u2);
		SubForum sf = new SubForum("cakes", u1);
		SubForum sf2 = new SubForum("internet", u2);
		f.addSubforum(sf);
		f.addSubforum(sf2);
		assertEquals(f.display(), "cars" + ":\n" + "\t" + "0" + ") "+ "cakes" + "\n" + "\t" + "1" + ") "+ "internet" + "\n");
	}

}
