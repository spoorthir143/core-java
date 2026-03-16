class FacebookMessenger 
{
    static void chat(String friendName)
	{
        System.out.println("Chatting with friend:");
        System.out.println(friendName);
    }

    static void chat(String friendName, int messages, boolean videoCall)
	{
        System.out.println("Friend Name: " + friendName);
        System.out.println("Total Messages: " + messages);
        System.out.println("Video Call Active: " + videoCall);
    }
}

