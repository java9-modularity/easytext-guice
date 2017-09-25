package javamodularity.easytext.algorithm.nextgensyllablecounter.guice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import javamodularity.easytext.algorithm.api.SyllableCounter;
import javamodularity.easytext.algorithm.nextgensyllablecounter.SyllableCounter3Wrapper;

public class NextgenSyllableCounterModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SyllableCounter.class).annotatedWith(Names.named("nextgen")).to(SyllableCounter3Wrapper.class);
    }
}
