package Graph;

public class UnweightedGraph<T extends Comparable<T>> extends WeightedGraph<T, Integer> {

    public boolean addEdge(T source, T destination) {
        return super.addEdge(source, destination, 1);
    }

    public boolean addUndirectedEdge(T source, T destination) {
        return super.addUndirectedEdge(source, destination, 1);
    }

}