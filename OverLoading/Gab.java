class Gab
{
    static void postMessage(String user)
    {
        System.out.println("Posting message:");
        System.out.println(user);
    }

    static void postMessage(String user,int likes,int reposts)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Reposts: " + reposts);
    }
}

