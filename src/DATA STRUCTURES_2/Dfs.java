import java.util.*;
public class Dfs {
    private int v;
    private LinkedList<Integer> arr[];
    Dfs(int v)
    {
        this.v=v;
        arr=new LinkedList[v];
    
        for(int i=0;i<v;i++)
        {
            arr[i]=new LinkedList<>();
        }
}
    public void dfsUtil(int source,boolean visited[])
    {
        visited[source]=true;
        System.out.println(source);
        Iterator<Integer> i=arr[source].listIterator();
        while(i.hasNext())
        {
            int a=i.next();
            if(!visited[a])
            {
                dfsUtil(a,visited);
            }
        }
    }
    public void dfs(int source)
    {
        boolean visited[]=new boolean[v];
        dfsUtil(source,visited);
    }
    public void addEdge(int v,int edge)
    {
        arr[v].add(edge);
    }
    public static void main(String args[])
    {
        Dfs g= new Dfs(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,4);
        System.out.println("Traversal of a tree");
        g.dfs(0);

    }
}
