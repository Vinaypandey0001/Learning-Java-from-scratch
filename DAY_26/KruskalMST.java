//Kruskal’s algorithm finds the Minimum Spanning Tree (MST) of a graph using a Union-Find data structure.@vinaypandey0001


import java.util.*;

public class KruskalMST {
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    static class UnionFind {
        int[] parent, rank;

        UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            Arrays.fill(parent, -1);
            Arrays.fill(rank, 0);
        }

        int find(int u) {
            if (parent[u] == -1) {
                return u;
            }
            return parent[u] = find(parent[u]);
        }

        void union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);

            if (rootU != rootV) {
                if (rank[rootU] < rank[rootV]) {
                    parent[rootU] = rootV;
                } else if
