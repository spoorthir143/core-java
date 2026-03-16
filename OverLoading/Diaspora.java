class Diaspora
{
    static void sharePost(String user)
    {
        System.out.println("Sharing post:");
        System.out.println(user);
    }

    static void sharePost(String user,int likes,int comments)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Comments: " + comments);
    }
}

