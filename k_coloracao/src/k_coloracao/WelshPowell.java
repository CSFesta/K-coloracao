package k_coloracao;

import java.util.ArrayList;
import java.util.List;

public class WelshPowell {
	public int kColoracao(Graph graph) {

		ArrayList<Integer> notPainted = new ArrayList<Integer>(sort(graph));
		System.out.println(notPainted.toString());
		int color = 0;
		while (!notPainted.isEmpty()) {
			for (int i = 0; i < notPainted.size(); i++) {
				Vertex vertex = graph.getVertex(notPainted.get(i)); //vertice nao pintado 
				boolean shouldPaint = true;
				for (int j = 0; j < vertex.getAdj().size(); j++) {
					Vertex verticeAdj = graph.getVertex(vertex.getAdj().get(j)); //vertice adjacente ao nao pintado
					if (verticeAdj.getColor() == color) {
	 					shouldPaint = false;
						break;
					}
				}
				if (shouldPaint) {
					vertex.setColor(color);
					notPainted.remove(i--);
				}
			}
			color++;
		}
		return color;
	}

	public List<Integer> sort(Graph grafo) {
		List<Integer> index = new ArrayList<>();
		for (int i = 0; i < grafo.numVertices; i++) {
			index.add(i);
		}
		index.sort((a, b) -> -Integer.compare(grafo.getVertex(a).getAdj().size(), grafo.getVertex(b).getAdj().size()));
		return index;
	}
}
