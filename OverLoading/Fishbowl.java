class Fishbowl
{
    static void joinDiscussion(String user)
    {
        System.out.println("Joining discussion:");
        System.out.println(user);
    }

    static void joinDiscussion(String user,String topic,int members)
    {
        System.out.println("User: " + user);
        System.out.println("Topic: " + topic);
        System.out.println("Members: " + members);
    }
}

