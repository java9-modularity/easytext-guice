module easytext.algorithm.kincaid {

    requires easytext.algorithm.api;
    requires guice;
    requires guice.multibindings;
    requires javax.inject;

    exports javamodularity.easytext.algorithm.kincaid.guice;
    opens javamodularity.easytext.algorithm.kincaid;
}
