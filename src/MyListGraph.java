//import sun.security.provider.certpath.Vertex;

import java.util.*;

/**
 * Created by youfar on 15/6/15.
 */
public class MyListGraph implements MyGraph{
    /*class Vertex{
        public int index;
        private ArrayList<Vertex> next = null;

        public void setIndex(int index){
            this.index = index;
        }

        public void addAdj(Vertex ver){
            if(next == null)
                next = new ArrayList<Vertex>();
            next.add(ver);
        }
    }

    private int verNum = 0;
    private Vertex vertexList[];

    public MyListGraph(int n){
        vertexList = new Vertex[n];
    }

    public void addVertex(Vertex vertex){
        vertex.setIndex(verNum);
        vertexList[verNum] = vertex;
        verNum++;
    }


    public void addEdge(int v1, int v2){
        vertexList[v1].addAdj(vertexList[v2]);
    }

    public int getNumOfVertex(){
        return vertexList.length;
    }

    public int getNumOfEdges(){
        return verNum;
    }*/


    private ArrayList<Vertex> vertexList;// 用一个ArrayList保存图中的所有结点
    private boolean isDirected = false;// 标记是否为有向图
    private int nVerts = 0;// 保存总的顶点数
    private int numOfEdges;

    public class Vertex {
        public int label;
        //public boolean wasVisted;
        public boolean isInGraph;
        public int indexId;//顶点的标号
        //由于采用"邻接表"方式表示图,所以每个顶点对象持有一个邻接表adjList
        private ArrayList<Vertex> adjacentList = null;

        public Vertex(int lab) // constructor
        {
            this.label = lab;
            //this.wasVisted = false;
        }

        // 为节点添加邻接点
        public void addAdj(Vertex ver) {
            if (adjacentList == null)
                adjacentList = new ArrayList<Vertex>();
            adjacentList.add(ver);
            ver.isInGraph = true;
        }

        //返回一个顶点的邻接表,在遍历图时需根据邻接表找下一个节点
        public ArrayList<Vertex> getAdj() {
            return this.adjacentList;
        }

        public void setIndex(int index) {
            this.indexId = index;
        }

        public String toString() {
            return "顶点 :" + label + " ";
        }
    }


    public MyListGraph() {
        vertexList = new ArrayList<Vertex>();
    }


    public void addVertex(Vertex vertex) {
        vertex.setIndex(nVerts);
        vertexList.add(vertex);
        nVerts++;
    }

    public void addEdge(int start, int end) {
        boolean startInGraph, endInGraph;
        vertexList.get(start).addAdj(vertexList.get(end));
        if (!isDirected) {
            vertexList.get(end).addAdj(vertexList.get(start));
        }
        numOfEdges++;

        /*startInGraph = vertexList.contains(start);
        endInGraph = vertexList.contains(end);
        System.out.println(startInGraph + ":" + endInGraph);*/

    }

    public int getNumOfVertex() {
        return nVerts;
    }

    public int getNumOfEdges() {
        return numOfEdges;
    }

    // 打印邻接表
    public void displayGraph() {
        for (int i = 0; i < vertexList.size(); i++) {
            printVertx(vertexList.get(i));
        }
    }

    public void printVertx(Vertex vertex) {
        ArrayList<Vertex> next = vertex.getAdj();
        if (next == null) {
            System.out.println(vertex.toString() + " 无邻接点！");
        } else {
            System.out.print(vertex.toString() + "邻接表:");
            for (int i = 0; i < next.size(); i++) {
                System.out.print(next.get(i).label + " ");
            }
            System.out.println();
        }
    }

    //需要传入对象作为参数
    public boolean isEdge(int v1, int v2){
        MyListGraph listGraph = new MyListGraph();
        Vertex ver1 = listGraph.new Vertex(v1);
        Vertex ver2 = listGraph.new Vertex(v2);
        boolean b = ver1.adjacentList.contains(ver2);
        if (b)
            return false;
        else
            return true;
    }

    //判断顶点在不在图里，在返回假，不在返回真
    public boolean isVertex(Vertex ver){
        if (ver.isInGraph == true){
            return false;
        } else {
            return true;
        }
    }











}
