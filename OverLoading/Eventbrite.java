class Eventbrite
{
    static void createEvent(String organizer)
    {
        System.out.println("Creating event:");
        System.out.println(organizer);
    }

    static void createEvent(String organizer,String event,int attendees)
    {
        System.out.println("Organizer: " + organizer);
        System.out.println("Event: " + event);
        System.out.println("Attendees: " + attendees);
    }
}

