class BeReal
{
    static void postPhoto(String user)
    {
        System.out.println("Posting real photo:");
        System.out.println(user);
    }

    static void postPhoto(String user, int reactions, int comments)
    {
        System.out.println("User: " + user);
        System.out.println("Reactions: " + reactions);
        System.out.println("Comments: " + comments);
    }
}

