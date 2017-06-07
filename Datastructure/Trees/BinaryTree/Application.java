import java.util.*;

public class Application {

   public static void main(String[] args) {

      //Scanner input = new Scanner(System.in);
      //String s = input.nextLine();

      Node skewedTree = new Node(1, null, null);
      skewedTree.setRChild(new Node(3, null, null));
      skewedTree.getRChild().setRChild(new Node(7, null, null));
      skewedTree.getRChild().getRChild().setRChild(new Node(15, null, null));
      skewedTree.getRChild().getRChild().getRChild().setRChild(new Node(31, null, null));
      skewedTree.getRChild().getRChild().getRChild().getRChild().setRChild(new Node(63, null, null));


      Node tree2 = new Node(2, null, null);

      tree2.setLChild(new Node(7, null, null));
      tree2.setRChild(new Node(5, null, null));
      
      //tree2.getLChild().setLChild(new Node(7, null, null));
      //tree2.getLChild().setRChild(new Node(6, null, null));
      tree2.getRChild().setLChild(new Node(5, null, null));
      tree2.getRChild().setRChild(new Node(9, null, null));
//
      //tree2.getLChild().getLChild().setLChild(new Node(1, null, null));
      //tree2.getLChild().getLChild().setRChild(new Node(2, null, null));
      //tree2.getLChild().getRChild().setLChild(new Node(1, null, null));
      //tree2.getLChild().getRChild().setRChild(new Node(11, null, null));
      //tree2.getRChild().getLChild().setLChild(new Node(5, null, null));
      //tree2.getRChild().getLChild().setRChild(new Node(6, null, null));
      tree2.getRChild().getRChild().setLChild(new Node(4, null, null));
      //tree2.getRChild().getRChild().setRChild(new Node(8, null, null));


      Node tree = new Node(1, null, null);

      tree.setLChild(new Node(2, null, null));
      tree.setRChild(new Node(3, null, null));

      tree.getLChild().setLChild(new Node(4, null, null));
      tree.getLChild().setRChild(new Node(5, null, null));
      tree.getRChild().setLChild(new Node(6, null, null));
      tree.getRChild().setRChild(new Node(7, null, null));
//
      tree.getLChild().getLChild().setLChild(new Node(8, null, null));
      tree.getLChild().getLChild().setRChild(new Node(9, null, null));
      tree.getLChild().getRChild().setLChild(new Node(12, null, null));
      //tree.getLChild().getRChild().setRChild(new Node(11, null, null));
      //tree.getRChild().getLChild().setLChild(new Node(12, null, null));
      //tree.getRChild().getLChild().setRChild(new Node(13, null, null));
      tree.getRChild().getRChild().setLChild(new Node(10, null, null));
      //tree.getRChild().getRChild().setRChild(new Node(15, null, null));
      
      //
     //tree.getLChild().getLChild().getLChild().setLChild(new Node(16));
     //tree.getLChild().getLChild().getLChild().setRChild(new Node(17));
     tree.getLChild().getLChild().getRChild().setLChild(new Node(13));
     tree.getLChild().getLChild().getRChild().setRChild(new Node(14));
    //
     //tree.getLChild().getRChild().getLChild().setLChild(new Node(20));
     //tree.getLChild().getRChild().getLChild().setRChild(new Node(21));
     //tree.getLChild().getRChild().getRChild().setLChild(new Node(22));
     //tree.getLChild().getRChild().getRChild().setRChild(new Node(23));
    //
     //tree.getRChild().getLChild().getLChild().setLChild(new Node(24));
     //tree.getRChild().getLChild().getLChild().setRChild(new Node(25));
     //tree.getRChild().getLChild().getRChild().setLChild(new Node(26));
     //tree.getRChild().getLChild().getRChild().setRChild(new Node(27));
    //
     //tree.getRChild().getRChild().getLChild().setLChild(new Node(28));
     tree.getRChild().getRChild().getLChild().setRChild(new Node(11));
     //tree.getRChild().getRChild().getRChild().setLChild(new Node(30));
     //tree.getRChild().getRChild().getRChild().setRChild(new Node(11));

      tree.getLChild().getLChild().getRChild().getRChild().setLChild(new Node(15));

      int[] inOrder = new int[]{8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15};
      int[] preOrder = new int[]{1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15};
      int[] postOrder = new int[]{8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1};

      //PreOrderTraversal.recurPreOrder(tree);
      //PreOrderTraversal.iterPreOrder(tree);
      //PreOrderTraversal.iterPreOrder2(tree);

      //InOrderTraversal.recurInOrder(tree);
      //InOrderTraversal.iterInOrder(tree);
      //InOrderTraversal.iterInOrder2(tree);

      //PostOrderTraversal.recurPostOrder(tree);
      //PostOrderTraversal.iterPostOrder(tree);
      //PostOrderTraversal.iterPostOrder2(tree);
      //PostOrderTraversal.iterPostOrder3(tree);

      //LevelOrderTraversal.levelOrder(tree);

      //Random.makeThreaded(tree);

      //boolean isIdentical = Identical.isIdentical(tree, skewedTree);
      //System.out.println(isIdentical);

      //int max = MaxElement.getMax(tree);
      //int max = MaxElement.iterGetMax(tree);

      //boolean isPresent = FindElement.isPresent(tree, 3);
      //boolean isPresent = FindElement.isPresentIter(tree, 15);

      //int size = TreeSize.getSizeRecur(tree);
      //int size = TreeSize.getSizeIter(tree);

      //ReverseLevelOrder.reverseLevelOrder(tree);

      //ZigZagTraversal.zigZagTraversal(tree);
      //ZigZagTraversal.zigZagTraversal2(tree);

      //int height = TreeHeight.heightRecur(tree);
      //int height = TreeHeight.heightIter(tree);

      //boolean isMirror = Mirror.isMirror(tree, tree2);

      //TreeView.leftView(tree);
      //TreeView.rightView(tree);
      //TreeView.topView(tree);
      //TreeView.bottomView(tree);


      //int sum = TreeSum.getSumRecur(tree);
      //int sum = TreeSum.getSumIter(tree);

      /*Map<Integer, List<Node>> verticalLevelMap = new HashMap<>();
      VerticalTree.printVerticalOrderRecur(tree, 0, verticalLevelMap);
      for(Map.Entry<Integer, List<Node>> element : verticalLevelMap.entrySet()) {
      System.out.println("Level "+element.getKey()+"  "+element.getValue());
      }*/

      //VerticalTree.printVerticalOrderIter(tree);

      /*Map<Integer, Integer> verticalLevelSumMap = new TreeMap<>();
      VerticalTree.sumVerticalOrderRecur(tree, 0, verticalLevelSumMap);
      for(Map.Entry<Integer, Integer> element : verticalLevelSumMap.entrySet()) {
      System.out.println(element.getKey()+" --> "+element.getValue());
      }*/

      //VerticalTree.sumVerticalOrderIter(tree);

      //AncestorTree.printAncestor(tree, 24);

      //AncestorTree.printLCA(tree, 5, 11);
      //AncestorTree.printLCA2(tree, 23, 50);

      //MaxLevel.printMaxLevel(tree);

      //MorrisTraversal.morrisInorder(tree);
      //MorrisTraversal.morrisPreOrder(tree);

      //PrintBinaryTree.printTree(tree);

      //System.out.println(sum);

      //Node root = InOrderAndPreOrder.constructTree(inOrder, 0, 14, preOrder);
      //PrintBinaryTree.printTree(root);
      //Node root = InOrderAndPostOrder.constructTree(inOrder, 0, 14, postOrder);
      //PrintBinaryTree.printTree(root);

      //int leafCount = CountLeaf.countLeaf(tree);
      //System.out.println(leafCount);

      //Pair pair = Diameter.diameter(tree);
      //System.out.println(pair.diameter);

      //int height = Height.height(tree);
      //System.out.println(height);

      //MaxWidth.maxWidth(tree);

      //PrintNodesFromRoot.printNodesFromRoot(tree, 2);

      //int level = NodeLevel.nodeLevel(tree, 1);
      //System.out.println(level);

      //ConnectLevel.connectLevel(tree);

      //boolean isSumTree = SumTree.isSumTree(tree);
      //System.out.println(isSumTree);

      //ZigZagTraversal.spiralPrint(tree);

      //TreeView.recursiveRightView(tree, 1);

      //RootToLeafPath.rootToLeafPath(tree);

      //System.out.println(RootToLeafSum.rootToLeafSum(tree, 0, 11));

      //CheckCompleteBinaryTree.checkCompleteBinaryTree(tree);

      //System.out.println(DeepestLeafNode.deepestLeafNode(tree, 0, 'L'));
      //System.out.println(DeepestLeafNode.result);
      //System.out.println(DeepestLeafNode.maxLevel);

      //System.out.println(RootToLeafPathSum.rootToLeafPathSum(tree, 0));

      //System.out.println(LeftLeafSum.leftLeafSum(tree, 'N'));

      //Ancestors.printAncestors(tree, 50);

      //PerfectBinaryLevelOrder.perfectBinaryLevelOrder(tree);
      //PerfectBinaryLevelOrder.printBST(tree);

      //System.out.println(IsoMorphic.isoMorphic(tree, tree2));

      //NodesAtDistance.nodesAtDistance(tree, 10, 3);

      //NodeDistance.nodeDistance(tree, 8, 17);

      //System.out.println(DeepestOddLevelLeaf.deepestOddLevelLeaf(tree, 1));

      //System.out.println(CheckLeafSameLevel.checkLeafSameLevel(tree, 1));

      //levelOrder(tree2);
      //Node root = RemoveHalfNode.removeHalfNode(tree2);    
      //levelOrder(root);

      //CheckCousins.checkCousins(tree, 21, 29);

      //ConvertSumTree.convertSumTree(tree);
      //levelOrder(tree);

      //ConvertChildrenSum.convertChildrenSum(tree);
      //levelOrder(tree);

      /*int height = HeightBalanced.heightBalanced(tree2);
      if(height == -1) {
        System.out.println("NOT BALANCED");
      } else {
        System.out.println("BALANCED");
      }*/

      //DoubleTree.doubleTree(tree);
      //levelOrder(tree);

      /*levelOrder(tree);
      System.out.println(RemoveNodesPath.removeNodesPath(tree, 6, 1));
      levelOrder(tree);*/

      levelOrder(tree);
      System.out.println(RemoveNodesPath.removeNodesPathSum(tree, 20, 0));
      levelOrder(tree);
  }

  public static void levelOrder(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    while(!q.isEmpty()) {
      int count = q.size();
      while(count-- > 0) {
        Node target = q.remove();
        System.out.print(target.getData() +"  ");
        if(target.getLChild() != null) {
          q.add(target.getLChild());
        }
        if(target.getRChild() != null) {
          q.add(target.getRChild());
        }
      }
      System.out.println();
    }
    
  }

}
