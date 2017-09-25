package javamodularity.easytext.gui;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.stage.Stage;
import javamodularity.easytext.algorithm.coleman.guice.ColemanModule;
import javamodularity.easytext.algorithm.kincaid.guice.KincaidModule;
import javamodularity.easytext.algorithm.naivesyllablecounter.guice.NaiveSyllableCounterModule;
import javamodularity.easytext.algorithm.nextgensyllablecounter.guice.NextgenSyllableCounterModule;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("EasyText");

        Injector injector = Guice.createInjector(
                new ColemanModule(),
                new KincaidModule(),
                new NextgenSyllableCounterModule(),
                new NaiveSyllableCounterModule());

        EasyTextUI eas = injector.getInstance(EasyTextUI.class);

        primaryStage.setScene(eas);
        primaryStage.show();
    }




}
