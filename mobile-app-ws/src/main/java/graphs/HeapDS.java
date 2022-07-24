package graphs;

import java.util.ArrayList;

public class HeapDS<T> {

	ArrayList<Node> nodes=new ArrayList<>();
	
	class Node
	{
		int val;
		T key;
		public Node(int val,T key) {
			this.val=val;
			this.key=key;
		}
	}
	
	
	/*
	 *  public void add(int weight,T key) {
        Node node = new Node();
        node.weight = weight;
        node.key = key;
        allNodes.add(node);
        int size = allNodes.size();
        int current = size - 1;
        int parentIndex = (current - 1) / 2;
        nodePosition.put(node.key, current);

        while (parentIndex >= 0) {
            Node parentNode = allNodes.get(parentIndex);
            Node currentNode = allNodes.get(current);
            if (parentNode.weight > currentNode.weight) {
                swap(parentNode,currentNode);
                updatePositionMap(parentNode.key,currentNode.key,parentIndex,current);
                current = parentIndex;
                parentIndex = (parentIndex - 1) / 2;
            } else {
                break;
            }
        }
    }
	 * */
	
	public void add(int val,T key) {
		System.out.println("Goinf to add : "+val);
		Node node=new Node(val,key);
		nodes.add(node);
		int current=nodes.size()-1;
		int parent=(current-1)/2;
		Node prtNode=nodes.get(parent);
		Node curNode=nodes.get(current);
		while(prtNode.val<curNode.val) {
			System.out.println("Parent Node : "+prtNode.val+" Curr node : "+curNode.val);
			swap(prtNode,curNode);
			current=parent;
			parent = (parent-1)/2;
			prtNode=nodes.get(parent);
			curNode=nodes.get(current);
		}
	}
	public void swap(Node node1,Node node2) {
		T tmpKey=node1.key;
		int val=node1.val;
		node1.key=node2.key;
		node1.val=node2.val;
		node2.key=tmpKey;
		node2.val=val;
	}
	 public void printHeap(){
		 int i=1;
	        for(Node n : nodes){
	            System.out.println("index : "+(i++)+" Key : "+n.val + " " + n.key);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapDS <String> heap = new HeapDS<String>();
		heap.add(3, "Tushar");
        heap.add(4, "Ani");
        heap.add(8, "Vijay");
        heap.add(10, "Pramila");
        heap.add(5, "Roy");
        heap.add(6, "NTF");
        heap.add(2,"AFR");
        //heap.add(11,"AFR");
        heap.printHeap();
	}

}
