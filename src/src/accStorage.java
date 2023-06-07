package src;

import java.io.*;

public class accStorage {

    private static final String fileloc = System.getProperty("java.io.tmpdir") + File.separator + "accounts.txt";

    public static String getfilepath() {
        return fileloc;
    }

    public static void accounts(String data) {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(fileloc, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
