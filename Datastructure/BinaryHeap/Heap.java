public class Heap {

   private int[] arr;
   private int count;
   private int capacity;
   private int heapType;

   public Heap(int capacity, int heapType) {

      //this.capacity = capacity;
      this.heapType = heapType;
      this.arr = new int[capacity];
   }

   public int[] getArr() {
      return this.arr;
   }

   public void setArr(int[] arr) {
      this.arr = arr;
   }

   public int getCount() {
      return this.count;
   }

   public void setCount(int count) {
      this.count = count;
   }

   public void incrementCount() {
      this.count++;
   }

   public void descrementCount() {
      this.count--;
   }

   public int getLChild(int parent) {
      int lChild = parent*2+1;
      if(lChild >= count) {
         return -1;
      }
      return lChild;
   }

   public int getRChild(int parent) {
      int rChild = parent*2+2;
      if(rChild >= count) {
         return -1;
      }
      return rChild;
   }

   public void delete() {
      if(count <= 0) {
         return;
      }
      Application.swap(this.arr, 0, this.count-1);
      descrementCount();
      // Heapifying
      int parent = 0;
      bubbleDown(parent);

   }

   public void bubbleDown(int parent) {
      int lChild = getLChild(parent);
      int rChild = getRChild(parent);
      while(lChild != -1 || rChild != -1) {
         int minIndex = parent;
         if(rChild != -1 && arr[rChild] < arr[minIndex]) {
            minIndex = rChild;
         }
         if(lChild != -1 && arr[lChild] < arr[minIndex]) {
            minIndex = lChild;
         }
         if(minIndex == parent) {
            break;
         }
         Application.swap(arr, parent, minIndex);                 // The while condition makes sure that the parent is more than atleast one of its children
         parent = minIndex;
         rChild = getRChild(parent);
         lChild = getLChild(parent);
      }
   }

   public void insert(int data) {
      this.arr[this.count] = data;
      int child = this.count;
      this.count++;
      int parent = (child-1)/2;
      while(parent >= 0 && arr[parent] > data) {
         Application.swap(this.arr, parent, child);
         child = parent;
         parent = (child-1)/2;
      }
   }

}
