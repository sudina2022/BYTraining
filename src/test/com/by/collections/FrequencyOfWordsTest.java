package test.com.by.collections;

import org.junit.Assert;
import org.junit.Test;

import com.by.collections.model.NodeHashMap;


public class FrequencyOfWordsTest {

	@Test
	public void getFrequencyOfWords() {
		String strSentence = "To be or not to be";
		NodeHashMap<String, Integer> hashWordCount = new NodeHashMap<>();
		String[] words = strSentence.toLowerCase().split(" ");
		for(String word: words) {
			Integer value = hashWordCount.get(word);
			if(value == null) 
				value = 1;
			else
				value++;
			hashWordCount.add(word,value);
		}
		Integer freq = hashWordCount.get("to");
		Assert.assertEquals(2, freq.intValue());
		freq = hashWordCount.get("not");
		Assert.assertEquals(1, freq.intValue());
		freq = hashWordCount.get("check");
		if(freq==null) 
			freq = 0;
		Assert.assertEquals(0,freq.intValue());
		
	}
}