package k_coloracao;

public class Graph {
	public int numVertices;
	public Vertex[] vertices;

	public Graph(int numVertices) {
		this.numVertices = numVertices;
		vertices = new Vertex[numVertices];
		for (int i = 0; i < numVertices; i++) {
			vertices[i] = new Vertex(i);
		}
	}

	public void addEdge(int v, int w) { // adiciona em ambos vertices os adjacentes (grafo deve ser nao direcionado)
		vertices[v].addAdj(w);
		vertices[w].addAdj(v);
	}

	public Vertex[] getVertices() {
		return vertices;
	}

	public Vertex getVertex(int index) {
		return vertices[index];
	}
}
