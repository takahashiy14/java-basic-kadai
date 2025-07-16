package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> dicMap = new HashMap<String, String>();
	

    // コンストラクタで10個の単語を登録
    public Dictionary_Chapter21() {
    	dicMap.put("apple", "りんご");
    	dicMap.put("peach", "桃");
    	dicMap.put("banana", "バナナ");
    	dicMap.put("lemon", "レモン");
    	dicMap.put("pear", "梨");
    	dicMap.put("kiwi", "キウィ");
    	dicMap.put("strawberry", "いちご");
    	dicMap.put("grape", "ぶどう");
    	dicMap.put("muscat", "マスカット");
    	dicMap.put("cherry", "さくらんぼ");
    }
    
    
    	public String searchWord(String word) {
    		if(dicMap.containsKey(word)) {
    			return word + "の意味は" + dicMap.get(word);
    		} else {
    			return word + "は辞書に存在しません。";
    		}
    	}
    
}
