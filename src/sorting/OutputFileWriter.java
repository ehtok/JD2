package sorting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFileWriter {

    public static final String TAB = "\t";

    public static void writeListToFile(File file, List<String[]> stringsList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String[] elements : stringsList
            ) {
                for (String element : elements
                ) {
                    writer.write(element + TAB);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
