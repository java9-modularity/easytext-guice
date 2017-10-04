module easytext.algorithm.coleman {
   requires easytext.algorithm.api;
   requires guice;
   requires guice.multibindings;
   //exports javamodularity.easytext.algorithm.coleman.guice;

   provides com.google.inject.AbstractModule with javamodularity.easytext.algorithm.coleman.guice.ColemanModule;

   opens javamodularity.easytext.algorithm.coleman;
}
