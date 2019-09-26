package com.kodilla.stream.forumuser;

import java.util.List;
import java.util.ArrayList;

public final class Forum {
    private final List<ForumUser> theForumUsers = new ArrayList<>();

    public Forum(){
        theForumUsers.add(new ForumUser(1,"Jan",'m',2019,10,10,0));
        theForumUsers.add(new ForumUser(2,"Kasia",'k',1988,2,10,12));
        theForumUsers.add(new ForumUser(3,"Czarek",'m',1967,3,10,22));
        theForumUsers.add(new ForumUser(4,"Ania",'k',2000,4,10,0));
        theForumUsers.add(new ForumUser(5,"Jarek",'m',1945,5,10,11));
        theForumUsers.add(new ForumUser(6,"Jarek",'m',1945, 1,2,5));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUsers);
    }
}
