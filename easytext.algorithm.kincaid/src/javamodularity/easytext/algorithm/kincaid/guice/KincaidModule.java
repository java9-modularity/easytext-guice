package javamodularity.easytext.algorithm.kincaid.guice;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import javamodularity.easytext.algorithm.api.Analyzer;
import javamodularity.easytext.algorithm.kincaid.KincaidAnalyzer;

public class KincaidModule extends AbstractModule {
    @Override
    protected void configure() {
        Multibinder.newSetBinder(binder(), Analyzer.class).addBinding().to(KincaidAnalyzer.class);
    }
}
