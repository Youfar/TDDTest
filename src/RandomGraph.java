/**
 * Created by youfar on 15/6/15.
 */
import java.util.Random;
public class RandomGraph {
    /*public MyListGraph listrandom(int V, int E) {
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

    }*/

    /*public MyMatrixGraph matrixrandom(int V, int E) {
        if(E > (long) V*(V-1)/2)
            throw new IllegalArgumentException("too many edges");
        if(E < 0)
            throw new IllegalArgumentException("too few edges");
        Random random = new Random();

        MyMatrixGraph matrixRandomGraph = new MyMatrixGraph(V);
        while(matrixRandomGraph.getNumOfEdges() < E){
            int v = random.nextInt(V);
            int w = random.nextInt(V);
            boolean b1 = matrixRandomGraph.isEdge(v, w);
            boolean b2 = matrixRandomGraph.isVertex(v);
            boolean b3 = matrixRandomGraph.isVertex(w);

            // v w不相等，图里都没有，也没有边
            if((v != w) && b1 && b2 & b3){
                matrixRandomGraph.addVertex(v);
                matrixRandomGraph.addVertex(w);
                matrixRandomGraph.addEdge(v, w);
            }
            //v w不相等，没有边，图里有w
            if((v != w) && b1 && b2){
                matrixRandomGraph.addVertex(v);
                matrixRandomGraph.addEdge(v, w);
            }
            if((v != w) && b1 && b3){
                matrixRandomGraph.addVertex(v);
                matrixRandomGraph.addEdge(v, w);
            }
        }
        return matrixRandomGraph;

    }*/

    public static void main(String[] args) {
        int V = 10;
        int E = 10;

        MyMatrixGraph matrixRandom0 = new MyMatrixGraph(V);
        MyMatrixGraph matrixRandom1 = matrixRandom0.matrixRandom(V,E);


    }

}
