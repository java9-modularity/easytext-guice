package javamodularity.easytext.algorithm.naivesyllablecounter.guice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import javamodularity.easytext.algorithm.api.SyllableCounter;
import javamodularity.easytext.algorithm.naivesyllablecounter.NaiveSyllableCounter;

public class NaiveSyllableCounterModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SyllableCounter.class).annotatedWith(Names.named("naive")).to(NaiveSyllableCounter.class);
    }
}
