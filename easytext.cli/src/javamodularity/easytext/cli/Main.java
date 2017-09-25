package javamodularity.easytext.cli;

import java.io.IOException;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javamodularity.easytext.algorithm.coleman.guice.ColemanModule;
import javamodularity.easytext.algorithm.kincaid.guice.KincaidModule;
import javamodularity.easytext.algorithm.naivesyllablecounter.guice.NaiveSyllableCounterModule;
import javamodularity.easytext.algorithm.nextgensyllablecounter.guice.NextgenSyllableCounterModule;

public class Main {

   public static void main(String... args) throws IOException {
      Injector injector = Guice.createInjector(
              new ColemanModule(),
              new KincaidModule(),
              new NextgenSyllableCounterModule(),
              new NaiveSyllableCounterModule()
              );

      CLI cli = injector.getInstance(CLI.class);
      cli.analyze(args[0]);
   }
}
