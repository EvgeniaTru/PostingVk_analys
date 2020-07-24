package ru.netology.domain;

public class Post {
    private int id;
    private int accountId;
    private int fromId;
    private int createdBy;
    private int date;
    private PostBody postBody;
    private int replyAccountId;
    private int replyPostId;
    private Geo geo;
    private long viewCount;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private String copyright;
    private long commentsCount;
    private RepostInfo repostInfo;
    private int signerId;
    private String postType;
    private PostSource postSource;
    private boolean pinnedPost;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean friendsOnly;
    private boolean adMark;
    private boolean isFavourite;
    private int postponedId;

}
