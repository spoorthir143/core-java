class Flickr
{
    static void sharePhoto(String photographer)
    {
        System.out.println("Sharing photo by:");
        System.out.println(photographer);
    }

    static void sharePhoto(String photographer,int views,int likes)
    {
        System.out.println("Photographer: " + photographer);
        System.out.println("Views: " + views);
        System.out.println("Likes: " + likes);
    }
}

