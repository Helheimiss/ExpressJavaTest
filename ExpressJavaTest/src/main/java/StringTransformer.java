public class StringTransformer
{
    public String transform(String message)
    {


        String text = "";
        for (int i = message.length() - 1; i != -1; i--)
        {
            text += message.toCharArray()[i];
            text = text.replace("o","15").replace("a", "1").replace("e", "5").replace("i" , "9").replace("u", "21").replace("y", "25").replace("A", "1");
        }

        return text;
    }
}