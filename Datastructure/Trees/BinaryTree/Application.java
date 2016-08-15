import java.util.*;

public class Application {

  public static void main(String[] args) {

    Node skewedTree = new Node(1, null, null);
    skewedTree.setRChild(new Node(3, null, null));
    skewedTree.getRChild().setRChild(new Node(7, null, null));
    skewedTree.getRChild().getRChild().setRChild(new Node(15, null, null));
    skewedTree.getRChild().getRChild().getRChild().setRChild(new Node(31, null, null));
    skewedTree.getRChild().getRChild().getRChild().getRChild().setRChild(new Node(63, null, null));


    Node tree = new Node(1, null, null);

    tree.setLChild(new Node(2, null, null));
    tree.setRChild(new Node(3, null, null));

    tree.getLChild().setLChild(new Node(4, null, null));
    tree.getLChild().setRChild(new Node(5, null, null));
    tree.getRChild().setLChild(new Node(6, null, null));
    tree.getRChild().setRChild(new Node(7, null, null));

  	tree.getLChild().getLChild().setLChild(new Node(8, null, null));
  	tree.getLChild().getLChild().setRChild(new Node(9, null, null));
  	tree.getLChild().getRChild().setLChild(new Node(10, null, null));
    tree.getLChild().getRChild().setRChild(new Node(11, null, null));
  	tree.getRChild().getLChild().setLChild(new Node(12, null, null));
  	tree.getRChild().getLChild().setRChild(new Node(13, null, null));
  	tree.getRChild().getRChild().setLChild(new Node(14, null, null));
  	tree.getRChild().getRChild().setRChild(new Node(15, null, null));


		tree.getLChild().getLChild().getLChild().setLChild(new Node(16));
		tree.getLChild().getLChild().getLChild().setRChild(new Node(17));
		tree.getLChild().getLChild().getRChild().setLChild(new Node(18));
		tree.getLChild().getLChild().getRChild().setRChild(new Node(19));

		tree.getLChild().getRChild().getLChild().setLChild(new Node(20));
		tree.getLChild().getRChild().getLChild().setRChild(new Node(21));
		tree.getLChild().getRChild().getRChild().setLChild(new Node(22));
    tree.getLChild().getRChild().getRChild().setRChild(new Node(23));

		tree.getRChild().getLChild().getLChild().setLChild(new Node(24));
		tree.getRChild().getLChild().getLChild().setRChild(new Node(25));
		tree.getRChild().getLChild().getRChild().setLChild(new Node(26));
		tree.getRChild().getLChild().getRChild().setRChild(new Node(27));

		tree.getRChild().getRChild().getLChild().setLChild(new Node(28));
		tree.getRChild().getRChild().getLChild().setRChild(new Node(29));
		tree.getRChild().getRChild().getRChild().setLChild(new Node(30));
		tree.getRChild().getRChild().getRChild().setRChild(new Node(31));

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
    //TreeView.topView(skewedTree);
    //TreeView.bottomView(skewedTree);


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
    //AncestorTree.printLCA2(tree, 5, 23);

    MaxLevel.printMaxLevel(tree);
    //System.out.println(sum);
  }

}
