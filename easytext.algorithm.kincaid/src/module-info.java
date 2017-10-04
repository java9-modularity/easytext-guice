module easytext.algorithm.kincaid {

    requires easytext.algorithm.api;
    requires guice;
    requires guice.multibindings;
    requires javax.inject;

  //  exports javamodularity.easytext.algorithm.kincaid.guice;

    provides com.google.inject.AbstractModule with javamodularity.easytext.algorithm.kincaid.guice.KincaidModule;

    opens javamodularity.easytext.algorithm.kincaid;
}
