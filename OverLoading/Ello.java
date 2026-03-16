class Ello
{
    static void createPost(String user)
    {
        System.out.println("Creating post:");
        System.out.println(user);
    }

    static void createPost(String user,int likes,int comments)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Comments: " + comments);
    }
}

