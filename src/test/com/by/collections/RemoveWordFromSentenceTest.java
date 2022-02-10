package test.com.by.collections;

import org.junit.Assert;
import org.junit.Test;

import com.by.collections.model.LinkedHashMap;

public class RemoveWordFromSentenceTest {
	
	@Test
	public void removeWordFromSentence() {
		String strSentence =   "Paranoids are not paranoid because they are paranoid but "+
				"because they keep putting themselves "+
				"deliberately into paranoid avoidable situations";
		String removeWord = "avoidable";
		LinkedHashMap<String, Integer> hashWordCount = new LinkedHashMap<>();
		insertWords(strSentence,hashWordCount);
		System.out.println(hashWordCount);
		removeWord(removeWord,hashWordCount);
	}
	private void removeWord(String removeWord, LinkedHashMap<String, Integer> hashWordCount) {
		Integer value = hashWordCount.get(removeWord);
		if(value == null)
			System.out.println("Word is not present in the sentence");
		else
		{
			boolean removeFlag = hashWordCount.remove(removeWord);
			if(removeFlag)System.out.println("Word removed\n"+hashWordCount );
			else
				System.out.println("Word not removed\n"+hashWordCount);
		}
	}
	public void insertWords(String strSentence,LinkedHashMap<String, Integer> hashWordCount) {
		String[] words = strSentence.toLowerCase().split(" ");
		
		for(String word: words) {
			Integer value = hashWordCount.get(word);
			if(value == null)
				value = 1;
			else
				value++;
			hashWordCount.add(word,value);
		}
	}

}
