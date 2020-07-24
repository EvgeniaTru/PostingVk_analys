package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private int count;
    private int offset;
    private int postId;

    public Post[] search(int accountId, String domain, String query, boolean ownersOnly, int count, int offset) {
        return null;
    }

    public void delete (int accountId, int postId) {
    }

}
