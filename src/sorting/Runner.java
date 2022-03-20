package sorting;

import java.io.File;
import java.util.List;

public class Runner {

    public static final File INPUT_FILE = new File("in.txt");
    public static final File OUTPUT_FILE = new File("out.txx");

    public static void main(String[] args) {
        List<String[]> stringsList = InputFileReader.refactorFileToList(INPUT_FILE);
        stringsList.sort(new Sorting());
        OutputFileWriter.writeListToFile(OUTPUT_FILE, stringsList);
    }
}
