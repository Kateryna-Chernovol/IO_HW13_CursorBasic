package cursor.hw13;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("myFile.txt"));

        PrintWriter output = new PrintWriter(new BufferedWriter(new
                FileWriter("myFileCopied.txt")));

        String str;
        while ((str = input.readLine()) != null) {
            output.write(str + "\n");
        }

        input.close();
        output.close();

    }
}