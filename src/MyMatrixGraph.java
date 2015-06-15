import java.util.ArrayList;

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




}
