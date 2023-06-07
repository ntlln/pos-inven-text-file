package src;

import java.io.*;

public class productStorage {

    private static final String fileloc = System.getProperty("java.io.tmpdir") + File.separator + "products.txt";

    public static String getfilepath() {
        return fileloc;
    }

    public static void products(String data) {
        try ( BufferedReader reader = new BufferedReader(new FileReader(fileloc))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(data)) {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(fileloc, true))) {
            writer.write(data);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
