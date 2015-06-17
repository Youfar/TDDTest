import java.util.ArrayList;
import java.util.Random;

/**
 * Created by youfar on 15/6/15.
 */
public class MyMatrixGraph implements MyGraph{
    private ArrayList vertexList;
    private int[][] edges;
    private int numOfEdges;

    public MyMatrixGraph(int n){
        //初始化矩阵，一维数组和边的数目
        edges = new int[n][n];
        vertexList = new ArrayList(n);
        numOfEdges = 0;
    }

    public int getNumOfVertex(){
        return vertexList.size();
    }

    public int getNumOfEdges(){
        return numOfEdges;
    }

    public void addEdge(int v1, int v2){
        edges[v1][v2] = 1;
        numOfEdges++;
    }

    public void addVertex(Object vertex){
        vertexList.add(vertexList.size(),vertex);
    }

    //判断两点有没有边，有返回假，没有返回真
    public boolean isEdge(int v1, int v2){
        if (edges[v1][v2] == 1 | edges[v2][v1] == 1)
            return false;
        else
            return true;
    }

    //判断顶点在不在图里，在返回假，不在返回真
    public boolean isVertex(Object vertex){
        if (vertexList.contains(vertex)){
            return false;
        } else {
            return true;
        }
    }

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




}
