public class ElloUserExecutor
{
    public static void main(String[] args)
    {
        ElloUser.logIn("user@gmail.com", "pass123");
        ElloUser.logIn(9876543210L, "pass456");
    }
}