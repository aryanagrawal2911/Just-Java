import java.util.ArrayDeque;

public class Graph_BFS_Traversal {

	static void TraversalBFS(int gra[][]) {

		ArrayDeque<Integer> ad = new ArrayDeque<>();
		boolean visited[] = new boolean[gra.length];

		ad.add(0);
		visited[0] = true;

		while (!ad.isEmpty()) {

			int u = ad.poll();
			System.out.print(u + " ");

			for (int j = 0; j < gra[u].length; j++) {

				if (gra[u][j] == 1 && !visited[j]) {
					ad.add(j);
					visited[j] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
