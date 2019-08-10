package command;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;


public abstract class DictionaryOperationImpl implements DictionaryOperation {

    private static final Logger LOGGER = Logger.getLogger(DictionaryOperationImpl.class.getName());

    Stream<String> lines;

    public DictionaryOperationImpl() {
        try {
            this.lines = Files.readAllLines(
                    Paths.get("C:\\Users\\eimrnem\\IdeaProjects\\IQJB_java\\commandstreams\\src\\main\\resources\\dictionary.txt"),
                    Charset.defaultCharset()).stream();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Problem reading file!", e);
        }
    }
}
