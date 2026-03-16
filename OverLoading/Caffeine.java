class Caffeine
{
    static void startStream(String streamer)
    {
        System.out.println("Starting stream:");
        System.out.println(streamer);
    }

    static void startStream(String streamer, int viewers, int reactions)
    {
        System.out.println("Streamer: " + streamer);
        System.out.println("Viewers: " + viewers);
        System.out.println("Reactions: " + reactions);
    }
}

