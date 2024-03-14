package com.java.dsa.datastructures;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class DijkstraAlgorithm {

	public static Dictionary[] dijkstra(Graph graph, Vertex startingVertex) {

		Dictionary<String, Integer> distances = new Hashtable<String, Integer>();
		distances.put(startingVertex.getData(), 0);
		Dictionary<String, Vertex> previous = new Hashtable<String, Vertex>();
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.offer(startingVertex);

		for (Vertex v : graph.getVertices()) {
			if (v != startingVertex) {
				distances.put(v.getData(), Integer.MAX_VALUE);
			}
			previous.put(v.getData(), new Vertex(null));
		}

		while (!queue.isEmpty()) {
			Vertex currentVertex = queue.poll();

			for (Edge e : currentVertex.getEdges()) {
				Integer alternativePath = distances.get(currentVertex.getData()) + e.getWeight();
				String neighbourData = e.getEnd().getData();

				if (alternativePath < distances.get(neighbourData)) {
					distances.put(neighbourData, alternativePath);
					previous.put(neighbourData, currentVertex);
					queue.offer(e.getEnd());
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
		System.out.println("\nShortest Distance between " + startingVertex.getData() + " and " + targetVertex.getData()+":-");
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
