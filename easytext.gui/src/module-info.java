module easytext.gui {
    // JavaFX needs to instantiate our Main Application class
    exports javamodularity.easytext.gui to javafx.graphics;

    requires javafx.graphics;
    requires javafx.controls;
    requires easytext.algorithm.api;
    requires guice;
   // requires easytext.algorithm.kincaid;
   // requires easytext.algorithm.coleman;
    requires javafx.fxml;
    //requires easytext.algorithm.naivesyllablecounter;
    //requires easytext.algorithm.nextgensyllablecounter;

    uses com.google.inject.AbstractModule;

    opens javamodularity.easytext.gui;

}
