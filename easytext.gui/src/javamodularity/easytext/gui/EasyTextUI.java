package javamodularity.easytext.gui;

import com.google.inject.Inject;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javamodularity.easytext.algorithm.api.Analyzer;

import java.util.Set;

import static javamodularity.easytext.algorithm.api.Preprocessing.toSentences;

public class EasyTextUI extends Scene{
    private static ComboBox<String> algorithm;
    private static TextArea input;
    private static Text output;
    private static String sampleText;
    private final Set<Analyzer> analyzers;

    @Inject
    public EasyTextUI(Set<Analyzer> analyzers) {
        super(new BorderPane(), 300, 250);
        this.analyzers = analyzers;

        Button btn = new Button();
        btn.setText("Calculate");
        btn.setOnAction(event ->
                output.setText(analyze(input.getText(), (String) algorithm.getValue()))
        );

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(3));
        vbox.setSpacing(3);
        Text title = new Text("Choose an algorithm:");
        algorithm = new ComboBox<>();
        for(Analyzer analyzer: analyzers) {
            algorithm.getItems().add(analyzer.getName());
        }

        vbox.getChildren().add(title);
        vbox.getChildren().add(algorithm);
        vbox.getChildren().add(btn);

        input = new TextArea();
        input.setText(sampleText);
        output = new Text();
        BorderPane root = (BorderPane)this.getRoot();
        root.setRight(vbox);
        root.setCenter(input);
        root.setBottom(output);
    }

    private String analyze(String input, String algorithm) {
        for(Analyzer analyzer: analyzers) {
            if(analyzer.getName().equals(algorithm)) {
                return algorithm + ": " + analyzer.analyze(toSentences(input));
            }
        }

        return "No analyzer found for " + algorithm;
    }

    static {
        try {
            sampleText = new String (java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("testinput.txt")));
        } catch (java.io.IOException ioe) {
            sampleText = "Paste text here";
        }
    }
}
