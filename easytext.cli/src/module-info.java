module easytext.cli {
    requires easytext.algorithm.api;
    requires guice;
    requires easytext.algorithm.coleman;
    requires easytext.algorithm.kincaid;
    requires easytext.algorithm.nextgensyllablecounter;
    requires easytext.algorithm.naivesyllablecounter;

    opens javamodularity.easytext.cli;
}
