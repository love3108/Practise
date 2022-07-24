package graphs;

import java.util.HashSet;
import java.util.Stack;

public class TopologicalSort {

	public static void main(String[] args) {
		// add nodes
		Node nodeG = new Node("G", null, null);
		Node nodeH = new Node("H", null, null);
		Node nodeF = new Node("F", null, nodeG);
		Node nodeE = new Node("E", nodeH, nodeF);
		Node nodeC = new Node("C", nodeE, null);
		Node nodeD = new Node("D", nodeF, null);
		Node nodeB = new Node("B", null, nodeD);
		Node nodeA = new Node("A", nodeC, nodeB);
		HashSet<String> visited = new HashSet<String>();
		Stack<String> st = new Stack<String>();
		topoUtil(nodeA, visited, st);
		while (!st.isEmpty()) {
			System.out.print(">>>>"+st.pop());
		}
	}

	public static void topoUtil(Node node, HashSet<String> visited, Stack<String> stack) {

		if (node != null) {
			topoUtil(node.nextL, visited, stack);
			topoUtil(node.nextR, visited, stack);
			if (!visited.contains(node.value)) {
				visited.add(node.value);
				stack.push(node.value);
			}
		}
	}
}

class Node {

	String value;
	Node nextR;
	Node nextL;

	public Node(String value, Node nextL, Node nextR) {
		this.value = value;
		this.nextR = nextR;
		this.nextL = nextL;
	}

}
