import java.util.*;

public class TrieNode {

   public Map<Character, TrieNode> map = new HashMap<>();
   public boolean isEndOfWord = false;

   public TrieNode() {

   }

   public String toString() {
      
      return map+"---->"+isEndOfWord;
   }


}
