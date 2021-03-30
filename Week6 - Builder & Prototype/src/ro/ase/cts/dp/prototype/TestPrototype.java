package ro.ase.cts.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {

		Tree3DModel tree1 = new Tree3DModel("green", 100);
		// Tree3DModel tree2 = new Tree3DModel("green", 100);

		// Shallow-Copy
		Tree3DModel anotherTree = tree1;
		
		// Deep-Copy
		Tree3DModel tree2 = (Tree3DModel) tree1.clone();
		Tree3DModel tree3 = (Tree3DModel) tree1.clone();
		Tree3DModel tree4 = (Tree3DModel) tree1.clone();

	}

}
