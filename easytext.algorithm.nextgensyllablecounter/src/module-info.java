module easytext.algorithm.nextgensyllablecounter {
  requires easytext.algorithm.api;
  requires syllable.counter;
  requires guice; // Automatic module: name derived from library jar name

  opens javamodularity.easytext.algorithm.nextgensyllablecounter;
  exports javamodularity.easytext.algorithm.nextgensyllablecounter.guice;
}
