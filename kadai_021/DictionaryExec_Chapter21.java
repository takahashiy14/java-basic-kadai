package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();
		
		
		String[] wordsToSearch = {
				"apple", "banana", "grape", "melon"
		};
		
		
		for(String word : wordsToSearch) {
			String result = dict.searchWord(word);
			System.out.println(result);
		}
	}

}
