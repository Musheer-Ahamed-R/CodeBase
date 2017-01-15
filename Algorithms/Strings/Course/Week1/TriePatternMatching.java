import java.util.*;

public class TriePatternMatching {

   // Same Task as in the BruteForce Approach. But, Here we Construct a Trie(BUS) of Patterns and then Iterate Over the Text.

   // 1 -> Using Trie Node       -  O(N * M)    M - Length of the Longest Pattern.

   // Notes :
   //    -> This Algorithm Dramatically Improves from Brute-Force with Respect to Speed, but becomes Impractical with respect to Memory.
   //    -> In general, the number of edges for a trie is O of the Total length of the patterns.
   //       And for the human genomes, the total length of the patterns will be in trillions. So unfortunately,
   //       our algorithm will be impractical for read matrix.

   public static void main(String[] args) {

      String[] reads = {"bananas", "nana", "sama"};
      TrieNode tNode = new TrieNode();
      String text = "pananabananas";

      for(int i=0;i<reads.length;i++) {
         insertWord(reads[i], tNode);
      }

      findReadOccurence(text, tNode);
      //printTrie(tNode, 1);*/


   }

   public static void insertWord(String word, TrieNode tNode) {

      TrieNode temp = tNode;
      for(int i=0;i<word.length();i++) {
         Character ch = word.charAt(i);
         Map<Character, TrieNode> map = temp.map;
         if(map.containsKey(ch)) {
            temp = map.get(ch);
         } else {
            map.put(ch, (temp = new TrieNode()));
         }
      }
      temp.isEndOfWord = true;

   }

   public static void findReadOccurence(String text, TrieNode tNode) {


      for(int i=0;i<text.length();i++) {
         int j=i;
         Character ch = null;
         TrieNode temp = tNode;
         while(j < text.length() && temp.map.containsKey(ch = text.charAt(j))) {   // Short
            temp = temp.map.get(ch);
            j++;
         }
         if(temp.isEndOfWord) {
            System.out.println(text.substring(i, j)+" At Index "+i);
         } else {
            //System.out.println(text.substring(i, j)+" At Index "+i);
         }
      }
   }

   public static void printTrie(TrieNode tNode, int level) {
      if(tNode.map.size() == 0) {
         System.out.println("Starting with "+tNode.isEndOfWord);
         return;
      }
      System.out.println("Starting with "+tNode.isEndOfWord);
      for(Map.Entry<Character, TrieNode> entry : tNode.map.entrySet()) {
         System.out.println(entry.getKey());
         printTrie(entry.getValue(), level+1);
         System.out.println("--------------   "+ level);
      }

   }


}
