package javamodularity.easytext.cli;

import java.io.IOException;
import java.util.ServiceLoader;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

   public static void main(String... args) throws IOException {
      Injector injector = Guice.createInjector(
              ServiceLoader.load(AbstractModule.class)
              );

      CLI cli = injector.getInstance(CLI.class);
      cli.analyze(args[0]);
   }
}
