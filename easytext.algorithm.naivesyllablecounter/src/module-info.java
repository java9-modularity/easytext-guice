module easytext.algorithm.naivesyllablecounter {
    requires easytext.algorithm.api;
    requires guice;
    requires guice.multibindings;

    //exports javamodularity.easytext.algorithm.naivesyllablecounter.guice;
    provides com.google.inject.AbstractModule with javamodularity.easytext.algorithm.naivesyllablecounter.guice.NaiveSyllableCounterModule;

    opens javamodularity.easytext.algorithm.naivesyllablecounter;
}
