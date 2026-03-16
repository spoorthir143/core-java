class ClubhouseRoom
{
    static void joinRoom(String user)
    {
        System.out.println("Joining room:");
        System.out.println(user);
    }

    static void joinRoom(String user,String topic,int listeners)
    {
        System.out.println("User: " + user);
        System.out.println("Topic: " + topic);
        System.out.println("Listeners: " + listeners);
    }
}

