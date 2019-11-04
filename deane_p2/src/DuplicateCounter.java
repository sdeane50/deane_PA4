
import java.io.*;
import java.util.*;

public class DuplicateCounter {
     HashMap<String,Integer> uniqueWords = new HashMap<String,Integer>();

    public void count () throws IOException {

        Scanner input = new Scanner(new File("problem2.txt"));

        while (input.hasNext()) {
            String s = input.next();
            if(uniqueWords.containsKey(s))   {uniqueWords.put(s, uniqueWords.get(s)+1);}
            else { uniqueWords.put(s, 1);}
        }
    }

    public void write()throws IOException {
        //FileWriter writer = new FileWriter(file);
        File file = new File("unique_word_counts.txt.");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        Set<String> keys = uniqueWords.keySet();
        for (String s : keys) {
            writer.write(String.valueOf(uniqueWords.get(s)));
           writer.write("\n");
        }

       // File file = new File("unique_word_counts.txt.");
       // file.createNewFile();
        //FileWriter writer = new FileWriter(file);
        //writer.write(String.valueOf(uniqueWords));
        writer.close();

    }

}



