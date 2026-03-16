class Circle
{
    static void createGroup(String user)
    {
        System.out.println("Creating group:");
        System.out.println(user);
    }

    static void createGroup(String user,String topic,int members)
    {
        System.out.println("User: " + user);
        System.out.println("Topic: " + topic);
        System.out.println("Members: " + members);
    }
}

