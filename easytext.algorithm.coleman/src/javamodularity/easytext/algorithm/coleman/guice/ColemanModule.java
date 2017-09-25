package javamodularity.easytext.algorithm.coleman.guice;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import javamodularity.easytext.algorithm.api.Analyzer;
import javamodularity.easytext.algorithm.coleman.ColemanAnalyzer;

public class ColemanModule extends AbstractModule{

    @Override
    protected void configure() {
        Multibinder.newSetBinder(binder(), Analyzer.class)
                .addBinding().to(ColemanAnalyzer.class);
    }
}
