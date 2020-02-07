package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

//Test suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter=0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.print("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
     public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        //When
        forumUser.addPost("mrsmith", "Hello everyone");

        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, ","mrsmith");

        //When
        forumUser.addComment(thePost, "mrsmith", "Thanks");
    }
    @Test
    //Test3
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, ", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

@Test
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thanks");

        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }


    @Test
    //Test5
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hellow everyone", "mrsmith");

        //When
        boolean result = forumUser.removePost(thePost);
        //then
        Assert.assertFalse(result);
    }
    //Test 6
    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thanks");

        //When
        boolean result=forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    //Test7
    @Test
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone", "mrsmith");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());

        //When
        boolean result=forumUser.removePost(thePost);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getPostsQuantity());
    }

    //Test8
    @Test
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone", "mrsmith");
        ForumComment theComment = new ForumComment(thePost,"mrsmith", "Thanks");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result=forumUser.removeComment(theComment);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getCommentsQuantity());
    }
}
