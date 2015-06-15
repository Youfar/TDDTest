/**
 * Created by youfar on 15/6/15.
 */
import java.util.Random;
public class RandomGraph {
    public MyListGraph listrandom(int V, int E) {
        if(E > (long) V*(V-1)/2)
            throw new IllegalArgumentException("too many edges");
        if(E < 0)
            throw new IllegalArgumentException("too few edges");
        Random random = new Random();

        MyListGraph listRandomGraph = new MyListGraph();
        while(listRandomGraph.getNumOfEdges() < E){
            int v = random.nextInt(V);
            int w = random.nextInt(V);
            //如果v,w之间没有边,没有点，有一个
            if((v != w) && ){
                listRandomGraph.addVertex(listRandomGraph.new Vertex(v));
                listRandomGraph.addVertex(listRandomGraph.new Vertex(w));
                listRandomGraph.addEdge(v, w);
            }
            if((v != w) && ){
                listRandomGraph.addVertex(listRandomGraph.new Vertex(v));
                listRandomGraph.addEdge(v, w);
            }
            if((v != w) && ){
                listRandomGraph.addVertex(listRandomGraph.new Vertex(v));
                listRandomGraph.addEdge(v, w);
            }

        }
        return listRandomGraph;

    }

    public MyMatrixGraph matrixrandom(int V, int E) {
        if(E > (long) V*(V-1)/2)
            throw new IllegalArgumentException("too many edges");
        if(E < 0)
            throw new IllegalArgumentException("too few edges");
        Random random = new Random();

        MyMatrixGraph matrixRandomGraph = new MyMatrixGraph(V);

    }

}
