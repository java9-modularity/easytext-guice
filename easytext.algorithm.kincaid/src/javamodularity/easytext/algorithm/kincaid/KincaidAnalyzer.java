package javamodularity.easytext.algorithm.kincaid;

import com.google.inject.Inject;
import javamodularity.easytext.algorithm.api.Analyzer;
import javamodularity.easytext.algorithm.api.SyllableCounter;

import javax.inject.Named;
import java.util.List;

public class KincaidAnalyzer implements Analyzer {

   private SyllableCounter syllableCounter;

   @Inject
   public KincaidAnalyzer(@Named("nextgen") SyllableCounter syllableCounter) {

      this.syllableCounter = syllableCounter;
   }

   public String getName() {
      return "Flesch-Kincaid";
   }

   public double analyze(List<List<String>> sentences) {
      float totalsentences = sentences.size();
      float totalwords = sentences.stream().mapToInt(sentence -> sentence.size()).sum();
      float totalsyllables = sentences.stream()
         .flatMapToInt(sentence ->
            sentence.stream().mapToInt(word -> syllableCounter.countSyllables(word)))
         .sum();
      return 206.835 - 1.015 * (totalwords / totalsentences) - 84.6 * (totalsyllables / totalwords);
   }

}
