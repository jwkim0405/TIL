package BFS;

public class BFS {
	public static void main(String[] args) {
		
		String[] names = {"A", "B", "C", "D", "E"}; // 스터디
		
		// 위의 names를 이용하여 완전 이진트리 생성
		CompleteBinaryTree<String> tree = new CompleteBinaryTree<String>(names.length);
		
		for (String name : names)
			tree.add(name);
		
		tree.bfs();
		System.out.println();
		tree.bfs2();
	}
}
