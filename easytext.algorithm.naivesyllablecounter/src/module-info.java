module easytext.algorithm.naivesyllablecounter {
    requires easytext.algorithm.api;
    requires guice;
    requires guice.multibindings;

    exports javamodularity.easytext.algorithm.naivesyllablecounter.guice;
    opens javamodularity.easytext.algorithm.naivesyllablecounter;
}
