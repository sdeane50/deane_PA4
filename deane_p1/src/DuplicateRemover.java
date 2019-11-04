
import java.io.*;
import java.util.LinkedList;

import java.util.Scanner;

public class DuplicateRemover {
    private LinkedList<String> uniqueWords = new LinkedList<String>();

    public void remove() throws IOException {


        Scanner input = new Scanner(new File("problem1.txt"));

        while (input.hasNext()) {

            String currWord = input.next();
            if(uniqueWords.contains(currWord)){continue;}
            uniqueWords.add(currWord);
        }
    }



    public void write()throws IOException {
        File file = new File("unique_words.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(String.valueOf(uniqueWords));
        writer.close();

    }

}



