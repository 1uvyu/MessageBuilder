public class Main
{
    public static void main(String[] args)
    {
        MessageBuilder m = new MessageBuilder("The");
        System.out.println(m.getAbbreviation());
        MessageBuilder b = new MessageBuilder("good");
        System.out.println(b.getAbbreviation());
    }
}