package javamodularity.easytext.cli;

import com.google.inject.Inject;
import javamodularity.easytext.algorithm.api.Analyzer;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import static javamodularity.easytext.algorithm.api.Preprocessing.toSentences;

public class CLI {

    private final Set<Analyzer> analyzers;

    @Inject
    public CLI(Set<Analyzer> analyzers) {
        this.analyzers = analyzers;
    }

    public void analyze(String filename) throws IOException {
        if (filename.length() == 0) {
            System.out.println("Welcome to EasyText. Please provide a filename as input argument");
            return;
        }

        Path path = Paths.get(filename);
        System.out.println("Reading " + path);
        String text = new String(Files.readAllBytes(path), Charset.forName("UTF-8"));

        List<List<String>> sentences = toSentences(text);

        for(Analyzer analyzer: analyzers) {
            System.out.println(analyzer.getName() + ": " + analyzer.analyze(sentences));
        }
    }
}
