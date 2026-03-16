class Clubhouse 
{
    static void joinRoom(String roomName)
	{
        System.out.println("Joining room:");
        System.out.println(roomName);
    }

    static void joinRoom(String roomName, int listeners, boolean speaker)
	{
        System.out.println("Room Name: " + roomName);
        System.out.println("Listeners: " + listeners);
        System.out.println("Speaker Access: " + speaker);
    }
}

