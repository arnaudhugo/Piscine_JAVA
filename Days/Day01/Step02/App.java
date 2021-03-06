public class App {
    public int countCharInString(String s, char cInput) {
	char[] t_s = s.toCharArray();
	int nb_matches = 0;

	for (int i = 0; i < s.length(); i++) {
	    if (t_s[i] == cInput)
		nb_matches++;
	}
	return(nb_matches);
    }

    public boolean isPalindrom(String word) {
	char[] t_word = word.toCharArray();
	char[] t_reverse = word.toCharArray();
	
	for (int i = 0; i < word.length()/2; i++) {
	    char tmp = t_reverse[i];
	    t_reverse[i] = t_reverse[word.length() - i - 1];
	    t_reverse[word.length() - i - 1] = tmp;
	}
	for (int a = 0; a < word.length(); a++) {
	    for (int b = 0; b < word.length(); b++) {
		if (t_word[a] != t_word[b])
		    return(false);
	    }
	}
	return(false);
    }

    public int countDiffChars(String word) {
	char[] t_word = word.toCharArray();
	String t_vWord = "";
	int nb_diff = 0;

	for (int i = 0; i < word.length(); i++) {
	    if (countCharInString(t_vWord, t_word[i]) < 1) {
		t_vWord = t_vWord + t_word[i];
		nb_diff++;
	    }
	}
	return(nb_diff);
    }
}