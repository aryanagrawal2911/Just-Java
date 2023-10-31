import java.util.Stack;

public class graph_DFS_Traversal {

	static void TraversalDFS(int gra[][]) {

		Stack<Integer> s = new Stack<>();
		boolean visited[] = new boolean[gra.length];

		s.add(0);

		while (!s.empty()) {
			int u = s.pop();

			if (!visited[u]) {
				System.out.print(u + " ");
				visited[u] = true;
			}

			for (int j = gra[u].length - 1; j >= 0; j--) {

				if (gra[u][j] == 1 && !visited[j]) {
					s.push(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
