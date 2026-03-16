class Line 
{
    static void sendSticker(String friend)
	{
        System.out.println("Sending sticker to:");
        System.out.println(friend);
    }

    static void sendSticker(String friend, int stickers, boolean groupChat)
	{
        System.out.println("Friend: " + friend);
        System.out.println("Total Stickers: " + stickers);
        System.out.println("Group Chat: " + groupChat);
    }
}

