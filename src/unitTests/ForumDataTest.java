package unitTests;

import static org.junit.Assert.*;


import org.junit.Test;


import data.ForumData;
import data.User;

public class ForumDataTest {

	/*
	 * Check if the server handle sign up request properly. It`s very basic and important method and hence it`s critical
	 * to check this functionality.
	 */
	@Test
	public void testSignup() {
		ForumData fd = new ForumData();
		User u1 = new User("or", "ertf");
		fd.init("cars", u1);
		User u2 = fd.signup("dan", "fds");
		assertTrue(u2.getUserName().equals("dan") && u2.getPassword().equals("fds"));
	}
	
	/*
	 * Check if the server handle login request properly. It`s very basic and important method and hence it`s critical
	 * to check this functionality.
	 */
	@Test
	public void testFailLogIn() {
		ForumData fd = new ForumData();
		User u1 = new User("or", "ertf");
		fd.init("cars", u1);
	    fd.signup("ben", "cnc");
	    fd.signup("dor", "aac");
		assertEquals(fd.login("dan", "fds"), null);
	}
		

	/*
	 * Check if the server shows the right content of the right sub-forum. This test important because 
	 * this is a relatively complex method.
	 */
	@Test
	public void testViewSubForum() {
		ForumData fd = new ForumData();
		User u1 = new User("or", "ertf");
		fd.init("cars", u1);
		User u = fd.signup("dan", "abc");         
		User u2 = fd.signup("avi", "def");               
		fd.createSubForum(u1, "movies", "All what you want to know about movies");
		fd.createSubForum(u1, "internet", "All what you want to know about the internet");
		fd.viewSubForum(u, 0);
		fd.viewSubForum(u2, 1);
		fd.createMessage(u, "Welcome to my new forum!", "I hope you will find it useful");
		fd.createMessage(u2, "Welcome!", "I hope you enjoy this wonderful forum!");
		assertEquals(fd.viewSubForum(u, 0), "movies" + ":\n" + "\t" + "0" + ") " + "Welcome to my new forum!" + "\n");
		assertEquals(fd.viewSubForum(u2, 1), "internet" + ":\n" + "\t" + "0" + ") " + "Welcome!" + "\n");
	}
	
	/*
	 * Check that the method responsible for creating a sub-forum is working. It`s important to check
	 * this method mainly because it will be activated many times.
	 */
	@Test
	public void testCreateSubForum() {
		ForumData fd = new ForumData();
		User u1 = new User("or", "ertf");
		fd.init("cars", u1);
		assertEquals(fd.createSubForum(u1, "movies", "good movies"), "Sub Forum: " + "movies" + " with description: " + "good movies" + "\n\n\tCreated Succesfully.\n"); 
	}

	/*
	 * Check that the method responsible for creating a sub-forum is working. It`s important to check
	 * this method mainly because it will be activated many times.
	 */
	@Test
	public void testFailCreateSubForum() {
		ForumData fd = new ForumData();
		User u1 = new User("or", "ertf");
		fd.init("cars", u1);
		User u2 = fd.signup("dan", "abc");
		assertEquals(fd.createSubForum(u2, "movies", "good movies"), "Error: Permission denied. You are not an admin. You cannot create a subforum.\n"); 
	}
	
	/*
	 * Check that the method responsible for allowing a user to go back to the previous page is working. It`s important to check
	 * this method mainly because it will be activated many times.
	 */
	@Test
	public void testBack() {
		ForumData fd = new ForumData();
		User u1 = new User("or", "ertf");
		fd.init("cars", u1);
		User u2 = fd.signup("dan", "abc");
		fd.createSubForum(u1, "movies", "good movies");
		fd.viewSubForum(u2, 0);
		fd.createMessage(u2, "amazing forum!", "this is an amazing forum!");
		assertEquals(fd.back(u2), "movies" + ":\n" + "\t" + "0" + ") " + "amazing forum!" + "\n");
		assertEquals(fd.back(u2), "cars" + ":\n" + "\t" + "0" + ") " + "movies" + "\n");
	}

}
