package Node;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private List<Node> connections;

    public Node(String name) {
        this.name = name;
        this.connections = new ArrayList<>();
    }

    public void add(Node node) {
        connections.add(node);
    }

    public Node get(String name) {
        for (Node connection : connections) {
            if (connection.name.equals(name)) {
                return connection;
            }
        }
    }
}
