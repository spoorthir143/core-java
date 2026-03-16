class Likee
{
    static void liveStream(String host)
    {
        System.out.println("Starting live stream:");
        System.out.println(host);
    }

    static void liveStream(String host, int viewers, int gifts)
    {
        System.out.println("Host: " + host);
        System.out.println("Viewers: " + viewers);
        System.out.println("Gifts Received: " + gifts);
    }
}

