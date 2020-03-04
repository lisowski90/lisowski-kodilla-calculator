package com.kodilla.testing.forum.statistics;


public class Counter {
    Statistics statistics;

    double users;
    double posts;
    double comments;
    double postPerUser;
    double commentPerUser;
    double commentPerPost;

    public Counter(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistic(Statistics statistics) {
        users = statistics.userName().size();
        posts = statistics.postCount();
        comments = statistics.commentCount();
        if(users != 0 ) {
            postPerUser = posts/users;
        } else {
            postPerUser = 0;
        }
        if(posts != 0 && users != 0) {
            commentPerUser = comments/users;
        } else {
            commentPerUser = 0;
        }
        if(posts != 0) {
            commentPerPost = comments/posts;
        }

    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }
}
