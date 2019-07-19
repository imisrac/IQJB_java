package command;

import java.util.Map;

public class DictionaryAnalyzerExecutor {

    Map executeOperation(DictionaryOperation dictionaryOperation) {
        return dictionaryOperation.execute();
    }
}
