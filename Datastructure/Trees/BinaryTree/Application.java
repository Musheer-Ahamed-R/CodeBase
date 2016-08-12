
public class Application {

  public static void main(Stringp[] args) {

      Node tree = new Node(1, null, null);

    		tree.setLChild(new Node(2, null, null));
    		tree.setRChild(new Node(3, null, null));

    		tree.getLChild().setLChild(new Node(4, null, null));
    		tree.getLChild().setRChild(new Node(4, null, null));
    		tree.getLChild().setLChild(new Node(6, null, null));
    		tree.getLChild().setRChild(new Node(7, null, null));


    		tree.getLChild().getLChild().setLChild(new Node(8, null, null));
    		tree.getLChild().getLChild().setRChild(new Node(9, null, null));
    		tree.getLChild().getLChild().setLChild(new Node(10, null, null));
    		tree.getLChild().getLChild().setRChild(new Node(5, null, null));
    		tree.getLChild().getLChild().setLChild(new Node(12, null, null));
    		tree.getLChild().getLChild().setRChild(new Node(13, null, null));
    		tree.getLChild().getLChild().setLChild(new Node(14, null, null));
    		tree.getLChild().getLChild().setRChild(new Node(15, null, null));


    		tree.getLChild().getLChild().getLChild().setLChild(new Node(16));
    		tree.getLChild().getLChild().getLChild().setRChild(new Node(17));
    		tree.getLChild().getLChild().getLChild().setLChild(new Node(18));
    		tree.getLChild().getLChild().getLChild().setRChild(new Node(19));

    		tree.getLChild().getLChild().getLChild().setLChild(new Node(20));
    		tree.getLChild().getLChild().getLChild().setRChild(new Node(21));
    		tree.getLChild().getLChild().getLChild().setLChild(new Node(22));
    		tree.getLChild().getLChild().getLChild().setRChild(new Node(6));

    		tree.getLChild().getLChild().getLChild().setLChild(new Node(24));
    		tree.getLChild().getLChild().getLChild().setRChild(new Node(25));
    		tree.getLChild().getLChild().getLChild().setLChild(new Node(26));
    		tree.getLChild().getLChild().getLChild().setRChild(new Node(27));

    		tree.getLChild().getLChild().getLChild().setLChild(new Node(28));
    		tree.getLChild().getLChild().getLChild().setRChild(new Node(29));
    		tree.getLChild().getLChild().getLChild().setLChild(new Node(30));
    		tree.getLChild().getLChild().getLChild().setRChild(new Node(31));

        

  }

}
