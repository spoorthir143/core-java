class Houseparty
{
    static void joinRoom(String user)
    {
        System.out.println("Joining party room:");
        System.out.println(user);
    }

    static void joinRoom(String user,int friendsOnline,String game)
    {
        System.out.println("User: " + user);
        System.out.println("Friends Online: " + friendsOnline);
        System.out.println("Game: " + game);
    }
}

