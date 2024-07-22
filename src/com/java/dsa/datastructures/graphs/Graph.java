package com.java.dsa.datastructures.graphs;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Edge {
	private Vertex start;
	private Vertex end;
	private Integer weight;
}

@Data
class Vertex {
	private String data;
	private ArrayList<Edge> edges;

	Vertex(String data) {
		this.data = data;
		edges = new ArrayList<Edge>();
	}

	public void addEdge(Vertex endVertex, Integer weight) {
		this.edges.add(new Edge(this, endVertex, weight));
	}

	public void removeEdge(Vertex endVertex) {
		this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
	}

	public void print(boolean showWeight) {
		String message = "";

		if (this.edges.size() == 0) {
			System.out.println(this.data + " -->");
			return;
		}

		for (int i = 0; i < this.edges.size(); i++) {
			if (i == 0) {
				message += this.edges.get(i).getStart().data + " -->  ";
			}

			message += this.edges.get(i).getEnd().data;

			if (showWeight) {
				message += " (" + this.edges.get(i).getWeight() + ")";
			}

			if (i != this.edges.size() - 1) {
				message += ", ";
			}
		}
		System.out.println(message);
	}
}

@Data
public class Graph {

	private ArrayList<Vertex> vertices;
	private boolean isDirected;
	private boolean isWeighted;

	Graph(boolean isWeighted, boolean isDirected) {
		this.isDirected = isDirected;
		this.isWeighted = isWeighted;
		this.vertices = new ArrayList<Vertex>();
	}

	public Vertex addVertex(String data) {
		Vertex vertex = new Vertex(data);
		this.vertices.add(vertex);
		return vertex;
	}

	public void addEdge(Vertex startV, Vertex endV, Integer weight) {
		if (!this.isWeighted) {
			weight = null;
		}
		startV.addEdge(endV, weight);
		if (!this.isDirected) {
			endV.addEdge(startV, weight);
		}
	}

	public void removeEdge(Vertex startV, Vertex endV) {
		startV.removeEdge(endV);
		if (!this.isDirected) {
			endV.removeEdge(startV);
		}
	}

	public void print() {
		for (Vertex v : this.vertices) {
			v.print(isWeighted);
		}
	}

	public static void main(String[] args) {
		Graph busNetwork = new Graph(true, true);
		Vertex marathalli = busNetwork.addVertex("Marathalli");
		Vertex hsrLayout = busNetwork.addVertex("HSR Layout");
		Vertex krPuramRs = busNetwork.addVertex("KR Puram Railway Station");
		Vertex mgRoad = busNetwork.addVertex("MG Road");
		Vertex spiceGarden = busNetwork.addVertex("Spice Gargen");
		Vertex varthur = busNetwork.addVertex("Varthur");
		Vertex koramangala = busNetwork.addVertex("Koramangala");
		
		busNetwork.addEdge(spiceGarden, marathalli, 5);
		busNetwork.addEdge(marathalli, hsrLayout, 10);
		busNetwork.addEdge(marathalli, krPuramRs, 7);		
		busNetwork.addEdge(hsrLayout, koramangala, 5);
		busNetwork.addEdge(koramangala, mgRoad, 3);
		busNetwork.addEdge(krPuramRs, mgRoad, 5);		
		busNetwork.addEdge(marathalli, mgRoad, 15);		
		busNetwork.addEdge(varthur, spiceGarden, 5);
		busNetwork.addEdge(mgRoad, koramangala, 3);
		
		System.out.println("Bengaluru bus network:-\n");
		busNetwork.print();
		
		DijkstraAlgorithm.shortestPathBetween(busNetwork, spiceGarden, koramangala);
	}

}
