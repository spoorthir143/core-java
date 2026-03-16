class Kik 
{
    static void chat(String friend)
	{
        System.out.println("Chatting with:");
        System.out.println(friend);
    }

    static void chat(String friend, int messages, boolean botChat)
	{
        System.out.println("Friend: " + friend);
        System.out.println("Messages: " + messages);
        System.out.println("Bot Chat Enabled: " + botChat);
    }
}

