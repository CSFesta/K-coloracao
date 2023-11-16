package k_coloracao;

import java.util.LinkedList;

public class Vertex {
	private int num;
	private int color = -1;
	private LinkedList<Integer> adj = new LinkedList<>();

	public Vertex(int num) {
		this.num = num;
	}

	public void addAdj(int v) {
		adj.add(v);
	}

	public int getNum() {
		return num;
	}

	public LinkedList<Integer> getAdj() {
		return adj;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
