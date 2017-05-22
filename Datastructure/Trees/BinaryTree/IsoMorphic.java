public class IsoMorphic {

	// Tree Isomorphism Problem

	public static boolean isoMorphic(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
		if(root1.getData() != root2.getData()) {
			return false;
		}
		return  isoMorphic(root1.getLChild(), root2.getRChild()) && isoMorphic(root1.getRChild(), root2.getLChild()) || 
				isoMorphic(root1.getLChild(), root2.getLChild()) && isoMorphic(root1.getRChild(), root2.getRChild());
	}

}