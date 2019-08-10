package command;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class DictionaryOperationImpl implements DictionaryOperation {

    List<String> lines;

    public DictionaryOperationImpl() {
        try {
            this.lines = Files.readAllLines(
                    Paths.get("C:\\Users\\eimrnem\\IdeaProjects\\IQJB_java\\commandstreams\\src\\main\\resources\\dictionary.txt"),
                    Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
