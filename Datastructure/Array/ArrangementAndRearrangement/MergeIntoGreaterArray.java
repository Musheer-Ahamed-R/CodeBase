public class MergeIntoGreaterArray {

    // Merge an array of size n into another array of size m+n

    public static void mergeArray(int[] a, int[] b) {
        int rIndex = 0;
        for(int i=0;i<a.length; i++) {
            if(a[i] == -1) {
                a[i] = b[rIndex];
                rIndex++;
            } else if (a[i] > b[rIndex]) {
                int temp = a[i];
                a[i] = b[rIndex];
                b[rIndex] = temp;
            }
        }
        for(int elem : a) {
            System.out.println(elem);
        }
    }


}