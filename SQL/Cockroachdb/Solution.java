// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public static void main(String[] args) {
        Solution.solution(1, 4);
    }


    public static String solution(int A, int B) {
        ArrayList<String> list = new ArrayList<>();
        int aCount = 0;
        int bCount = 0;
        for(int i=0;aCount<A && bCount<B; aCount++, bCount++, i+=2) {
            list.add("a");
            list.add("b");
        }
        System.out.println(list.toString());
        String strPrefix = "";
        int count = 0;
        if (aCount != A) {
            strPrefix = "a";
            count = A - aCount;
        } else {
            strPrefix = "b";
            count = B - bCount;   
        }
        for(int i=0;i<list.size() && count > 0;i++) {
            if (list.get(i) != strPrefix) {
                String prevElem = Solution.getPrevElem(list, i);
                if (count == 1) {
                    list.add(i, strPrefix);
                    count = count - 1;
                    i++;
                } else if (prevElem != strPrefix) {
                    list.add(i, strPrefix);
                    list.add(i+1, strPrefix);
                    count = count - 2;
                    i += 2;
                }
            }
        }
        if (count > 0) {
            String prevElem = Solution.getPrevElem(list, list.size());
            if (count == 1) {
                list.add(strPrefix);
            } else if (prevElem != strPrefix) {
                list.add(strPrefix);
                list.add(strPrefix);
            }
        }
        System.out.println(list.toString());
        return list.toString();
    }
    
    public static String getPrevElem (ArrayList list, int i) {
        if (i - 1 <= 0) {
            return null;
        } else {
            return (String)list.get((int)i-1);
        }
    } 
}