package Node;

public class Main {
    public static void main(String[] args) {
        Node node = new Node("А");
        Node node1 = new Node("Б");
        Node node2 = new Node("В");
        Node node3 = new Node("Г");
        Node node4 = new Node("Д");
        Node node5 = new Node("Е");
        Node node6 = new Node("Ж");
        Node node7 = new Node("З");
        Node node8 = new Node("И");
        Node node9 = new Node("К");

        node.add(node1);
        node.add(node2);
        node.add(node3);
        node.add(node4);

        node1.add(node2);
        node1.add(node5);

        node2.add(node6);

        node3.add(node2);
        node3.add(node7);

        node4.add(node3);
        node4.add(node8);

        node5.add(node3);

        node6.add(node7);
        node6.add(node9);

        node7.add(node9);

        node8.add(node9);

        
    }
}
