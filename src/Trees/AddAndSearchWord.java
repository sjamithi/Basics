package Trees;

public class AddAndSearchWord {
    class Trie {
        boolean isLeaf;
        Trie[] chars;

        public Trie() {
            isLeaf = false;
            chars = new Trie[26];
        }
    }

    private Trie root;
    public AddAndSearchWord() {
         root = new Trie();
    }

    public void addWord (String s) {
        Trie curr = this.root;

        for (char c: s.toCharArray()) {
            if (curr.chars[c - 'a'] == null) {
                curr.chars[c - 'a'] = new Trie();
            }
            curr = curr.chars[c-'a'];
        }
        curr.isLeaf = true;
    }

    public boolean search(String word) {
        Trie curr = this.root;
        for (char c: word.toCharArray()) {
            if (curr.chars[c-'a'] == null) {
                return false;
            }
            curr = curr.chars[c-'a'];
        }
        return curr != null && curr.isLeaf;
    }

    public boolean wildCardSearch(String word) {
        return dfs(this.root, word, 0);
    }

    private boolean dfs(Trie curr, String word, int start) {
        if (curr.isLeaf && start == word.length())
            return true;
        if (start > word.length())
            return false;
        char c = word.charAt(start);

        if (c != '.') {
            return curr.chars[c-'a'] != null &&
                    dfs(curr.chars[c-'a'], word, start+1);
        } else {
            for (int i = 0; i< 26; i++) {
                if (curr.chars[i] != null) {
                    if (dfs(curr.chars[i], word, start+1))
                        return true;
                }
            }
        }


        return false;
    }

    public static void main(String[] args) {
        AddAndSearchWord obj = new AddAndSearchWord();
        obj.addWord("sand");
        boolean ans = obj.search("sand");
        System.out.println("true -> "+obj.wildCardSearch("s.nd"));
        System.out.println("true -> "+obj.wildCardSearch(".and"));
        System.out.println("false- >"+obj.wildCardSearch("n..d"));
        System.out.println("true -> "+ans);
        System.out.println("true -> "+obj.wildCardSearch("sand"));
        System.out.println("false -> "+obj.wildCardSearch("samd"));
    }
}
