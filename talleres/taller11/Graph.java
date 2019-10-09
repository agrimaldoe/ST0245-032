import java.util.ArrayList;

/**
 * Clase abstracta para la implementacion de grafos dirigidos
 * recordar los usos de clase abstracta 
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html"> Abstract </a>
 *
 * @author Mauricio Toro, Camilo Paez
 */
public abstract class Graph {
	protected int size;

	public Graph(int vertices) {
		size = vertices;
	}

	public abstract void addArc(int source, int destination, int weight);

	public abstract ArrayList<Integer> getSuccessors(int vertex);
	
	public abstract int getWeight(int source, int destination);

	public int size() {
		return size;
	}
}