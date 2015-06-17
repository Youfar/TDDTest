/**
 * Created by youfar on 15/6/15.
 */
import java.util.Random;
public class RandomGraph {
    /*public static MyListGraph listRandom(int V, int E) {
        if(E > (long) V*(V-1)/2)
            throw new IllegalArgumentException("too many edges");
        if(E < 0)
            throw new IllegalArgumentException("too few edges");
        Random random = new Random();

        MyListGraph listRandomGraph = new MyListGraph();
        while(listRandomGraph.getNumOfEdges() < E){
            int v = random.nextInt(V);
            int w = random.nextInt(V);

            boolean b1 = listRandomGraph.isEdge(v, w);
            boolean b2 = listRandomGraph.isVertex(listRandomGraph.new Vertex(v));
            boolean b3 = listRandomGraph.isVertex(listRandomGraph.new Vertex(w));

            //如果v,w之间没有边,没有点，有一个
            if((v != w) && b1 && b2 && b3){
                listRandomGraph.addVertex(listRandomGraph.new Vertex(v));
                listRandomGraph.addVertex(listRandomGraph.new Vertex(w));
                listRandomGraph.addEdge(v, w);
            }
            if((v != w) && b1 && b2){
                listRandomGraph.addVertex(listRandomGraph.new Vertex(v));
                listRandomGraph.addEdge(v, w);
            }
            if((v != w) && b1 && b3){
                listRandomGraph.addVertex(listRandomGraph.new Vertex(v));
                listRandomGraph.addEdge(v, w);
            }

        }
        return listRandomGraph;

    }*/

    public static MyMatrixGraph matrixRandom(int V, int E) {
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

    }

    public static void main(String[] args) {
        int V = 1000;
        int E = 1000;


        long startTime = System.currentTimeMillis();
        MyMatrixGraph G = matrixRandom(V, E);
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Create by matrix:" +totalTime/1000.0 +"secs.");

        /*startTime = System.currentTimeMillis();
        MyListGraph G1 = listRandom(V, E);
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Create by list:" +totalTime/1000.0 +"secs.");*/



    }

}
