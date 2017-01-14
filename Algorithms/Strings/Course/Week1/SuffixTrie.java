import java.util.*;

public class SuffixTrie {

   // Same Task as in the BruteForce Approach. But, Here we Construct a Trie(BUS) of All the Siffix of the Text and then Iterate Over the All the Patterns.

   // Notes :
   //    -> The Suffix Trie is Formed from N Suffixes(N is the Number of Sufffixes in a Text. This equals Text Length)
   //    -> The Total Length of the Suffix Trie is (N * (N-1)/2).
   //    -> This for Human Genome becomes Huge Impractical Memory. 

   public static void main(String[] args) {

      String[] reads = {"banana", "nana", "band", "zma", "slk", "ana"};
      SuffixTrieNode tNode = new SuffixTrieNode();
      String text = "kazmabananaslk";

      for(int i=0;i<text.length();i++) {
         insertWord(text.substring(i, text.length()), tNode, i);
      }

      //printTrie(tNode, 0);
      for(int i=0;i<reads.length;i++) {
         findReadOccurence(reads[i], tNode);
      }

   }

   public static void insertWord(String word, SuffixTrieNode tNode, int index) {

      SuffixTrieNode temp = tNode;
      for(int i=0;i<word.length();i++) {
         Character ch = word.charAt(i);
         Map<Character, SuffixTrieNode> map = temp.map;
         if(map.containsKey(ch)) {
            temp = map.get(ch);
         } else {
            map.put(ch, (temp = new SuffixTrieNode()));
         }
      }
      temp.isEndOfWord = index;

   }

   public static void getIndex(SuffixTrieNode tNode) {
      if(tNode.map.size() == 0) {
         System.out.println("Found at Index "+tNode.isEndOfWord);
      }
      for(Map.Entry<Character, SuffixTrieNode> entry : tNode.map.entrySet()) {
         getIndex(entry.getValue());
      }
   }

   public static void findReadOccurence(String read, SuffixTrieNode tNode) {

      int charIndex = 0;
      char ch = read.charAt(charIndex);
      SuffixTrieNode temp = tNode;
      while(charIndex < read.length() && temp.map.containsKey(ch)) {
         temp = temp.map.get(ch);
         if(++charIndex < read.length()) {
            ch = read.charAt(charIndex);
         }
      }
      if(charIndex == read.length()) {
         System.out.println("The Read is Found "+read);
         getIndex(temp);
      } else {
         System.out.println("The Read is NOT Found "+read);
      }

   }

   public static void printTrie(SuffixTrieNode tNode, int level) {
      if(tNode.map.size() == 0) {
         System.out.println("Starting with "+tNode.isEndOfWord);
         return;
      }
      System.out.println("Starting with "+tNode.isEndOfWord);
      for(Map.Entry<Character, SuffixTrieNode> entry : tNode.map.entrySet()) {
         System.out.println(entry.getKey());
         printTrie(entry.getValue(), level+1);
         System.out.println("--------------   "+ level);
      }

   }


}
