public class Application {

   public static void main(String[] args) {

      Node tree - new Node(1);

      tree.setLChild(2);
      tree.setRChild(3);

      tree.getLChild().setLChild();
      tree.getLChild().setRChild();
      tree.getRChild().setLChild();
      tree.getRChild().setRChild();

      tree.getLChild().getLChild().setLChild();
      tree.getLChild().getLChild().setRChild();
      tree.getLChild().getRChild().setLChild();
      tree.getLChild().getRChild().setRChild();

      tree.getRChild().getLChild().setLChild();
      tree.getRChild().getLChild().setRChild();
      tree.getRChild().getRChild().setLChild();
      tree.getRChild().getRChild().setRChild();


      tree.getLChild().getLChild().getLChild().setLChild();
      tree.getLChild().getLChild().getLChild().setRChild();
      tree.getLChild().getLChild().getRChild().setLChild();
      tree.getLChild().getLChild().getRChild().setRChild();
      tree.getLChild().getRChild().getLChild().setLChild();
      tree.getLChild().getRChild().getLChild().setRChild();
      tree.getLChild().getRChild().getRChild().setLChild();
      tree.getLChild().getRChild().getRChild().setRChild();

      tree.getRChild().getLChild().getLChild().setLChild();
      tree.getRChild().getLChild().getLChild().setRChild();
      tree.getRChild().getLChild().getRChild().setLChild();
      tree.getRChild().getLChild().getRChild().setRChild();
      tree.getRChild().getRChild().getLChild().setLChild();
      tree.getRChild().getRChild().getLChild().setRChild();
      tree.getRChild().getRChild().getRChild().setLChild();
      tree.getRChild().getRChild().getRChild().setRChild();


























   }


}
