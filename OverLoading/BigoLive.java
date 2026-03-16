class BigoLive
{
    static void liveStream(String host)
    {
        System.out.println("Host starting live:");
        System.out.println(host);
    }

    static void liveStream(String host, int viewers, int likes)
    {
        System.out.println("Host: " + host);
        System.out.println("Viewers: " + viewers);
        System.out.println("Likes: " + likes);
    }
}

