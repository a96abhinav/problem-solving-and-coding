package com.java.dsa.datastructures;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class DijkstraAlgorithm {

	public static Dictionary[] dijkstra(Graph g, Vertex startingVertex) {
		Dictionary<String, Integer> distances = new Hashtable<>();
		Dictionary<String, Vertex> previous = new Hashtable<>();
		PriorityQueue<QueueObject> queue = new PriorityQueue<QueueObject>();

		queue.add(new QueueObject(startingVertex, 0));

		for (Vertex v : g.getVertices()) {
			if (v != startingVertex) {
				distances.put(v.getData(), Integer.MAX_VALUE);
			}
			previous.put(v.getData(), new Vertex(null));
		}

		distances.put(startingVertex.getData(), 0);

		while (queue.size() != 0) {
			Vertex current = queue.poll().vertex;
			for (Edge e : current.getEdges()) {
				Integer alternative = distances.get(current.getData()) + e.getWeight();
				String neighborValue = e.getEnd().getData();
				if (alternative < distances.get(neighborValue)) {
					distances.put(neighborValue, alternative);
					previous.put(neighborValue, current);
					queue.add(new QueueObject(e.getEnd(), distances.get(neighborValue)));
				}
			}
		}
		return new Dictionary[] { distances, previous };
	}

	public static void shortestPathBetween(Graph graph, Vertex startingVertex, Vertex targetVertex) {
		Dictionary[] dijkstraDictionaries = dijkstra(graph, startingVertex);
		Dictionary distances = dijkstraDictionaries[0];
		Dictionary previous = dijkstraDictionaries[1];

		Integer distance = (Integer) distances.get(targetVertex.getData());
		System.out.println(
				"\nShortest Distance between " + startingVertex.getData() + " and " + targetVertex.getData() + ":-");
		System.out.println(distance);

		ArrayList<Vertex> path = new ArrayList<>();
		Vertex v = targetVertex;

		while (v.getData() != null) {
			path.add(0, v);
			v = (Vertex) previous.get(v.getData());
		}
		System.out.println("Shortest Path:-");
		List<String> shortestRoute = new ArrayList<String>();
		for (Vertex pathVertex : path) {
			shortestRoute.add(pathVertex.getData());
		}
		System.out.println(shortestRoute.stream().collect(Collectors.joining(" -> ")));
	}
}