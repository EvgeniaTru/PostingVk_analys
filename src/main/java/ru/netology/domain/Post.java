package ru.netology.domain;

public class Post {
    private int accountId;
    private String accountMiniPictureUrl;
    private String accountName;
    private PostBody postBody;
    private String imageUrl;
    private String audioUrl;
    private String videoUrl;
    private String documentUrl;
    private long viewCount;
    private long likesCount;
    private CommentsInfo commentsInfo;
    private long commentsCount;
    private long rePostCount;
    private boolean pinnedPost;
    private boolean seenToAll;
}
