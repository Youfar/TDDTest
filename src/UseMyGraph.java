/**
 * Created by youfar on 15/6/15.
 */

public class UseMyGraph {
    public static void main(String[] args) {

        int verNum = 10;
        boolean b;
        MyListGraph listGraph = new MyListGraph();
        listGraph.addVertex(listGraph.new Vertex(0));
        listGraph.addVertex(listGraph.new Vertex(1));
        listGraph.addVertex(listGraph.new Vertex(2));
        listGraph.addVertex(listGraph.new Vertex(3));
        listGraph.addVertex(listGraph.new Vertex(4));
        listGraph.addVertex(listGraph.new Vertex(5));
        listGraph.addVertex(listGraph.new Vertex(6));
        listGraph.addVertex(listGraph.new Vertex(7));
        listGraph.addVertex(listGraph.new Vertex(8));
        listGraph.addVertex(listGraph.new Vertex(9));
        listGraph.addVertex(listGraph.new Vertex(10));
        listGraph.addEdge(0,1);
        listGraph.addEdge(0,4);
        listGraph.addEdge(1,2);
        listGraph.addEdge(2,3);
        listGraph.addEdge(4,5);
        listGraph.addEdge(4,6);
        listGraph.addEdge(5,8);
        listGraph.addEdge(6,7);
        listGraph.addEdge(7,8);
        listGraph.addEdge(8,9);
        b = listGraph.isEdge(0,1);
        System.out.println(b);
        listGraph.displayGraph();

        /*int node = 4, edge = 4;
        String labels[] = {"V1","V2","V3","V4"};
        MyMatrixGraph matrixGraph = new MyMatrixGraph(node);
        for(String label:labels){
            matrixGraph.addVertex(label);
        }

        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(0, 2);
        matrixGraph.addEdge(2, 3);
        matrixGraph.addEdge(3, 0);
        matrixGraph.addEdge(3, 1);

        System.out.println("结点个数是 " + matrixGraph.getNumOfVertex());
        System.out.println("边的个数是 " + matrixGraph.getNumOfEdges());*/



    }
}
