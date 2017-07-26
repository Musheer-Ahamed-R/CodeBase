import java.util.*;

public class Application {

   public static void main(String[] args) {
       int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
       System.out.println("Hello World");
      //ZigZag.zigZag(arr);
      //System.out.println();
      //ZigZagOrder.sortZigZag(arr);
      // System.out.println(Arrays.toString(arr));

      char[][] matrix = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
                        {'G', 'E', 'E', 'K', 'S', 'S', 'K', 'E', 'E', 'G', 'E', 'E', 'K'},
                        {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};

      //FindString.finalAttempt(matrix, "GEEKS");

      //int[] a = {40, 10, 20, 5, 45, 50, 65, 90, 35, 25};
      int[] a = {2, 3, 22, 8, 21, 2, 43, 44, 45, 16, 8, 9};

      int sum = 24;
      //PairNumberSum.pairNoSum1(a, sum);
      //PairNumberSum.pairNoSum2(a, sum);

      TripletWithSum.tripletWithSum(a, 24);

      //MajorityElement.majorityElem1(a);
      //MajorityElement.boyerMooreAlgorithn(a);

      //CountPairs.pairsCount(a, 4);

      int[] b = {2, 3, 5, 6};
      //LostElement.lostElement1(a, b);
      //LostElement.lostElement2(a, b);
      //LostElement.binarySearch(a, b);
      //LostElement.usingXor(a, b);
      //LostElement.usingSumDiff(a, b);

      //FindDistinctElement.findUsingXor(a);

      //CountOne.binarySearch(b);

      //FindDuplicateElements.findDuplicate(a);

      //TwoNonRepeatingElements.findNonRepeatingElem(a);

      //PeakElement.findPeakElement(a);
      //PeakElement.binarySearchPeakElem(a);


      // NextPrevGreaterSmaller.printNextGreater(a);
      // System.out.println("-----------------");
      // NextPrevGreaterSmaller.printNextSmallest(a);
      // System.out.println("-----------------");
      // NextPrevGreaterSmaller.printPrevGreater(a);
      // System.out.println("-----------------");
      // NextPrevGreaterSmaller.printPrevSmallest(a);

      //System.out.println(PeakElement.isPeak(a, 9));

      //Pivot.findPivot(a);
      //PivotSearch.findPivotElem1(a, 20);
      //PivotSearch.findPivotElem2(a, 20);

      //Leaders.leaders1(a);
      //Leaders.leaders2(a);

      //OddOccurence.oddOccurence(b, 2);


      //RemoveZerosInPlace.removeZerosInPlace(b);
      //MoveZerosInPlace.removeZerosInPlaceSimpleSolution(a);

      //MaximumSubArray.maximumSumSubArray(a);
      //MaximumSubArray.kadaneMaximumSubArray(a);

      //MinimumLengthSubArray.minimumLengthSubArray(a, 15);
      //MinimumLengthSubArray.minimumLengthSubArray2(a, 15);
      //MinimumLengthSubArray.minimumLengthSubArray3(a, -13);

      //System.out.println(25+-20);

      //MaxDifference.maximumDifference(a);

      //MinDifference.minDiff(a);

      //FlipZero.flipZeroint(a, 4);

      //TrappingRainWater.trappingRainWater(a);

      //Reverse.reverse(a);
      //Reverse.reverseRecursion(a, 0);
      //System.out.println(Arrays.toString(a));

      //Rotation.rotation(a, 2);

      //Distinct .printDuplicate(a);
      //System.out.println(2 ^ 4);

      //MinJumpSteps.minJump(a);

      //SingleScanSort.singleScanSort(a);
      //SingleScanSort.singleScanSortTwoIndex(a);
      //SingleScanSort.singleScanSortEvenOdd(a);

      //FirstRepeating.firstRepeating(a);
      //FirstRepeating.firstRepeating2(a);

      //UnionAndIntersection.unionAndIntersection(a, b);

      DiffWithSum.diffWithSum(a, 42);
   }


}
