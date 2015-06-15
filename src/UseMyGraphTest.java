import junit.framework.TestCase;

/**
 * Created by youfar on 15/6/15.
 */
public class UseMyGraphTest extends TestCase {
    int node = 4;

    public void testAddEdge(){
        MyListGraph l = new MyListGraph();
        MyMatrixGraph m = new MyMatrixGraph(node);

        char label1 = 'A';
        char label2 = 'B';
        char label3 = 'C';
        int i1 = 1, i2 = 2, i3 = 3;

        l.addVertex(l.new Vertex(label1));
        l.addVertex(l.new Vertex(label2));
        l.addEdge(i1, i2);
        assertEquals(2,l.getNumOfVertex());
        assertEquals(2,l.getNumOfEdges());

        m.addVertex(label1);
        m.addVertex(label2);
        m.addEdge(i1, i2);
        assertEquals(2,m.getNumOfVertex());
        assertEquals(1,m.getNumOfEdges());

    }

}