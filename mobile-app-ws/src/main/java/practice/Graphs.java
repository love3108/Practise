package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Graphs {
	static int vertices=5;
	static LinkedList<Integer> adj[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS();
		adj = new LinkedList[vertices];
		for (int i=0; i<vertices; ++i) {
			adj[i] = new LinkedList<Integer>();
		}
		System.out.println("BFS-------");
		addBFSEdge(0, 1);
	    addBFSEdge(0, 2);
	    addBFSEdge(1, 2);
	    addBFSEdge(2, 0);
	    addBFSEdge(2, 3);
	    addBFSEdge(3, 3);
	    bfs(2);
	}
	
	public static void DFS()
	{
		
		LinkedList<Integer>[] ll=new LinkedList[vertices];
		for(int i=0;i<vertices;i++){
			ll[i]=new LinkedList<Integer>();
		}
		for(int i=0;i<vertices;i++){
			addEtoVDFS(ll,0, 1);
	        addEtoVDFS(ll,0, 2);
	        addEtoVDFS(ll,1, 2);
	        addEtoVDFS(ll,2, 0);
	        addEtoVDFS(ll,2, 3);
	        addEtoVDFS(ll,3, 3);
		}
		 boolean visited[] = new boolean[vertices];
		 dfsUtil(ll,visited,0);
	}
	public static void dfsUtil(LinkedList<Integer>[] ll, boolean visited[],int v) {
		visited[v]=true;
		System.out.println("Visited : "+v);
		Iterator<Integer> list=ll[v].listIterator();
		while(list.hasNext()) {
			int next=list.next();
			if(!visited[next]) {
				dfsUtil(ll,visited,next);
			}
		}
	}
	public static void addEtoVDFS(LinkedList<Integer>[] ll,int v,int e)
	{
		ll[v].add(e);
	}
	/*--------------BFS-------------*/
	public static void addBFSEdge(int v,int e) {
		System.out.println("Added "+v+" in e "+e);
		adj[v].add(e);
	}
	public static void bfs(int s) {
		boolean visited[]=new boolean[vertices];
		LinkedList<Integer> queue=new LinkedList<Integer>();
		queue.add(s);
		visited[s]=true;
		while(!queue.isEmpty()) {
			int val=queue.poll();
			System.out.println("Value : "+val);
			Iterator<Integer> list=adj[val].listIterator();
			while(list.hasNext()) {
				int q=list.next();
				if(!visited[q]) {
					queue.add(q);
					visited[q]=true;
				}
			}
		}
	}
}
