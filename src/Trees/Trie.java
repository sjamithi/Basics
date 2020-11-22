package Trees;

public class Trie {

    class TrieNode {
        boolean isLeaf;
        TrieNode[] chars;

        public TrieNode() {
            isLeaf = false;
            chars = new TrieNode[26];
        }
    }

    private TrieNode root;
    public Trie() {
        this.root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = this.root;

        for (char c: word.toCharArray()) {
            if (curr.chars[c - 'a'] == null) {
                curr.chars[c - 'a'] = new TrieNode();
            }
            curr = curr.chars[c - 'a'];
        }
        curr.isLeaf = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode temp = find(word);
        return temp != null && temp.isLeaf;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    public TrieNode find(String word) {
        TrieNode curr = this.root;

        for (char c: word.toCharArray()) {
            if (curr.chars[c - 'a'] == null)
                return null;
            curr = curr.chars[c - 'a'];
        }
        return curr;
    }


    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println(trie.search("apple"));   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
