class Blogger
{
    static void writeBlog(String author)
    {
        System.out.println("Writing blog:");
        System.out.println(author);
    }

    static void writeBlog(String author, int views, int comments)
    {
        System.out.println("Author: " + author);
        System.out.println("Views: " + views);
        System.out.println("Comments: " + comments);
    }
}

