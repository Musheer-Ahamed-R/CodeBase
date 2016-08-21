public class Application {

   public static void main(String[] args) {

      Node tree - new Node(80);

      tree.setLChild(40);
      tree.setRChild(120);

      tree.getLChild().setLChild(20);
      tree.getLChild().setRChild(60);
      tree.getRChild().setLChild(100);
      tree.getRChild().setRChild(140);

      tree.getLChild().getLChild().setLChild(10);
      tree.getLChild().getLChild().setRChild(30);
      tree.getLChild().getRChild().setLChild(50);
      tree.getLChild().getRChild().setRChild(70);

      tree.getRChild().getLChild().setLChild(90);
      tree.getRChild().getLChild().setRChild(110);
      tree.getRChild().getRChild().setLChild(130);
      tree.getRChild().getRChild().setRChild(150);


      // tree.getLChild().getLChild().getLChild().setLChild();
      // tree.getLChild().getLChild().getLChild().setRChild();
      // tree.getLChild().getLChild().getRChild().setLChild();
      // tree.getLChild().getLChild().getRChild().setRChild();
      // tree.getLChild().getRChild().getLChild().setLChild();
      // tree.getLChild().getRChild().getLChild().setRChild();
      // tree.getLChild().getRChild().getRChild().setLChild();
      // tree.getLChild().getRChild().getRChild().setRChild();
      //
      // tree.getRChild().getLChild().getLChild().setLChild();
      // tree.getRChild().getLChild().getLChild().setRChild();
      // tree.getRChild().getLChild().getRChild().setLChild();
      // tree.getRChild().getLChild().getRChild().setRChild();
      // tree.getRChild().getRChild().getLChild().setLChild();
      // tree.getRChild().getRChild().getLChild().setRChild();
      // tree.getRChild().getRChild().getRChild().setLChild();
      // tree.getRChild().getRChild().getRChild().setRChild();


























   }


}
