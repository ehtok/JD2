package sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFileReader {

    public static final String REGEX = "\\t";

    public static List<String[]> refactorFileToList(File file) {
        List<String[]> stringsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringsList.add(line.split(REGEX));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringsList;
    }
}
