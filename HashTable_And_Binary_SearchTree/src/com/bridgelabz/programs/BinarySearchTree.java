package com.bridgelabz.programs;

class Node{                     //class for the creating node in the linklist
	int data;
	Node left;
	Node right;

}

public class BinarySearchTree {           //created class Bst

	
	public Node insert(Node root, int val) {          //method to insert child node
		if (root == null) {
			return createNewNode(val);
		}
		if (val < root.data) {
			root.left = insert(root.left, val);
		}
		else if (val > root.data) {
			root.right = insert(root.right, val);
		}
		return root;

	}

	 
	public Node createNewNode(int k) {           //method to create new node
		Node bst = new Node();
		bst.data = k;
		bst.left = null;
		bst.right = null;
		return bst;
	}
	
	public boolean nodeValid(Node root, int val) {         //Search particular node is valid or not    
		if (root == null) {
			return false;
		}
		Boolean isValid = false;                           // if valid return true else return false

		while (root != null) {
			if(val < root.data) {
				root = root.left;
			}
			else if(val > root.data) {
				root = root.right;
			}
			else {
				isValid = true;
				System.out.println("Node is Valid");
				break;
			}

		}
		return isValid;
	}


	 
	public void print(Node root) {                 //method to print node
		if (root == null) {
			return;
		}
		print(root.left);
		System.out.println(root.data);
		print(root.right);
				
	}

}
