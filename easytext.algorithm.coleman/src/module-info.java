module easytext.algorithm.coleman {
   requires easytext.algorithm.api;
   requires guice;
   requires guice.multibindings;
   exports javamodularity.easytext.algorithm.coleman.guice;

   opens javamodularity.easytext.algorithm.coleman;
}
