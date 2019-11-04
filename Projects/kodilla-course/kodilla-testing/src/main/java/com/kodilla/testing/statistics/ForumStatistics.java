package com.kodilla.testing.statistics;

public class ForumStatistics  {

    private int usersQuantity = 0;
    private int postsQuantity = 0;
    private int commentsQuantity = 0;
    private Double postsPerUser = null;
    private Double commentsPerUser = null;
    private Double commentsPerPosts = null;

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity=statistics.postsCount();
        commentsQuantity=statistics.commentsCount();

        if(usersQuantity>0){
            postsPerUser=(double)postsQuantity/usersQuantity;
            commentsPerUser=(double)commentsQuantity/usersQuantity;
        }

        if (postsQuantity>0){
            commentsPerPosts=(double)commentsQuantity/postsQuantity;
        }

    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerposts() {
        return commentsPerPosts;
    }
}

/*
public void showStatistics() {
        System.out.println("Number of users: " + usersQuantity + "\nNumber of posts: " + postsQuantity +
                "\nNumber of comments: " + commentsQuantity + "\nNumber of posts per user: "
                + (postsPerUser == null ? "divinig by 0 is forbidden so such a factor doesn't exist" : postsPerUser)
                + "\nNumber of comments per user: "
                + (commentsPerUser == null ? "divinig by 0 is forbidden so such a factor doesn't exist" : commentsPerUser)
                + "\nNumber of comments per post: "
                + (commentsPerPost == null ? "divinig by 0 is forbidden so such a factor doesn't exist" : commentsPerPost));
    }
 */