import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {

    public static void main(String[] args) throws IOException
    {
        FileReader sourceStream = null;
        try
        {
            sourceStream = new FileReader("secret.txt");

            String SecretMessage = "";
            int Reader;

            while ((Reader = sourceStream.read()) != -1)
                if (Character.isUpperCase((char)Reader))
                    SecretMessage = SecretMessage + (char)Reader;

                System.out.println(SecretMessage.replace('X', ' '));
        }
        finally
        {

            if (sourceStream != null)
                sourceStream.close();
        }
    }
}