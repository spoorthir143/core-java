class Koo
{
    static void postKoo(String user)
    {
        System.out.println("Posting Koo by:");
        System.out.println(user);
    }

    static void postKoo(String user, int likes, int reposts)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Reposts: " + reposts);
    }
}

