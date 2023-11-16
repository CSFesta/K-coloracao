package k_coloracao;

public class Main {

	public static void main(String[] args) {
		Graph graph = new Graph(7);
		WelshPowell wp = new WelshPowell();
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(3, 5);
		graph.addEdge(5, 6);
		graph.addEdge(4, 6);

		for (int i = 0; i < graph.numVertices; i++) {
			System.out.print(graph.getVertex(i).getAdj().size() + " ");
		}
		System.out.println();

		System.out.println(wp.kColoracao(graph)); // retorna a quantidade de cores minimas
		Vertex[] result = graph.getVertices();
		for (int i = 0; i < graph.numVertices; i++) {
			System.out.println("V:" + i + " | " + result[i].getColor());
		}

	}

}
