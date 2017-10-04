package javamodularity.easytext.gui;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ServiceLoader;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("EasyText");

        Injector injector = Guice.createInjector(
                ServiceLoader.load(AbstractModule.class));

        EasyTextUI eas = injector.getInstance(EasyTextUI.class);

        primaryStage.setScene(eas);
        primaryStage.show();
    }




}
