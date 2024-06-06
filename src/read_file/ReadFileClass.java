package read_file;

import java.io.*;

public class ReadFileClass {
    // File path is passed as parameter
    public static void main(String[] args) {
//        File file = new File(
//                "src\\read_file\\test.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(
                    "src\\read_file\\test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
//
        int i;
        // Holds true till there is nothing to read
        while (true)

        // Print all the content of a file
        {
            try {
                if (!((i = fr.read()) != -1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print((char)i);
        }
    }
}