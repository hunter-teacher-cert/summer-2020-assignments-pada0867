import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		BSTree t = new BSTree();

		t.insert(50);
		t.insert(40);
		t.insert(60);
		t.insert(30);
		t.insert(70);
		t.insert(35);
		t.insert(65);


		t.preorderTraverse();
		//t.postorderTraverse();
		//t.inorderTraverse();

		t.delete(70);

		t.preorderTraverse();
		//t.postorderTraverse();
		//t.inorderTraverse();


	}
}
