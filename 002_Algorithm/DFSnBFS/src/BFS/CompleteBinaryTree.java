package BFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class CompleteBinaryTree<E> { // 완전이진트
	private Object[] nodes;
	private int lastIndex;
	private final int MAX_SIZE;

	public CompleteBinaryTree(int maxSIZE) {
		super();
		MAX_SIZE = maxSIZE;
		nodes = new Object[MAX_SIZE + 1]; // 노드 저장인덱스 1부터 사용
	}
	
	public boolean isFull() {
		return lastIndex == MAX_SIZE;
	}
	
	public void add(E e) {
		if (isFull())
			throw new RuntimeException("트리가 노드로 가득찼습니다.");
		nodes[++lastIndex] = e;
	}
	
	public void bfs() {
		
		// 1. 순서를 관리할 큐 준비
		Queue<Integer> queue = new ArrayDeque<>();
		
		// 2. 처음 탐색의 대상이 될 대상을 큐에 넣기
		queue.offer(1); // 루트 노드 인덱스 넣기
		
		// 3. 큐에 저장되어 있는 탐색 대상들을 차례대로 꺼내어 방문
		while(!queue.isEmpty()) {
			// 4. 탐색 대상 꺼내기
			int cur = queue.poll();
			
			// 5. 탐색 대상 탐색하기(대상으로 해야할 작업 수
			System.out.print(nodes[cur] + "\t");
			
			// 6. 탐색 대상과 관계를 맺고 있는 대상들을 다음에 방문하기 위해 순서를 결정하는 큐에 넣기
			if (cur * 2 <= lastIndex)
				queue.offer(cur * 2);
			if (cur * 2 + 1 <= lastIndex)
				queue.offer(cur * 2 + 1);
		}
		
	}
	
public void bfs2() {
		
		// 1. 순서를 관리할 큐 준비
		Queue<int[]> queue = new ArrayDeque<>();
		
		// 2. 처음 탐색의 대상이 될 대상과 너비를 큐에 넣기
		queue.offer(new int[] {1, 0}); // 루트 노드 인덱스, 너비 넣기
		
		// 3. 큐에 저장되어 있는 탐색 대상들을 차례대로 꺼내어 방문
		while(!queue.isEmpty()) {
			// 4. 탐색 대상 꺼내기
			int info[] = queue.poll();
			int cur = info[0];
			int breath = info[1];
			// 5. 탐색 대상 탐색하기(대상으로 해야할 작업 수
			System.out.print(nodes[cur] + "("  + breath + ")\t");
			
			// 6. 탐색 대상과 관계를 맺고 있는 대상들을 다음에 방문하기 위해 순서를 결정하는 큐에 넣기
			if (cur * 2 <= lastIndex)
				queue.offer(new int[] {cur * 2, breath + 1});
			if (cur * 2 + 1 <= lastIndex)
				queue.offer(new int[]{cur * 2 + 1, breath + 1});
		}
		
	}
	
	
}
