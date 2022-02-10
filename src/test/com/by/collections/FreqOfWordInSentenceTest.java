package test.com.by.collections;

import org.junit.Assert;
import org.junit.Test;

import com.by.collections.model.LinkedHashMap;


public class FreqOfWordInSentenceTest {

	@Test
	public void getFreqOfWordsInSentence() {
		String strSentence =   "Paranoids are not paranoid because they are paranoid but"+
							"because they keep putting themselves"+
							"deliberately into paranoid avoidable situations";
		LinkedHashMap<String, Integer> hashWordCount = new LinkedHashMap<>();
		String[] words = strSentence.toLowerCase().split(" ");
		
		for(String word: words) {
			Integer value = hashWordCount.get(word);
			if(value == null)
				value = 1;
			else
				value++;
			hashWordCount.add(word,value);
		}
		
		Integer freq = hashWordCount.get("paranoid");
		Assert.assertEquals(3, freq.intValue());
		
	}
}
