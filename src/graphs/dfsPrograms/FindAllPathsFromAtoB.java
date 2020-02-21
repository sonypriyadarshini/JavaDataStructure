//package graphs.dfsPrograms;
//
////https://www.geeksforgeeks.org/find-paths-given-source-destination/
////https://www.geeksforgeeks.org/count-possible-paths-two-vertices/
//
//import java.util.ArrayList;
//
//public class FindAllPathsFromAtoB {
//
//    int V;
//    static class Graph{
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//    void findpath(int d, int s){
//        ArrayList<Integer> path = new ArrayList<>();
//        Boolean visit[]=new Boolean[V];
//        path.add(d);
//        findPathhelper(d,s,path,visit);
//    }
//
//    void findPathhelper(Integer d, Integer s,ArrayList<Integer> path,Boolean[] visit){
//        visit[d]=true;
//        if(d.equals(s)){
//            System.out.println(path);
//            return;
//        }
//
//        for(Integer x:adj(d)){
//            if(visit[x]==false){
//            path.add(x);
//            findPathhelper(x,s,path,visit);
//            path.remove(x);
//            }
//        }
//        visit[d]=false;
//    }
//}
//
//
//    private void printAllPathsUtil(Integer u, Integer d,
//                                   boolean[] isVisited,
//                                   List<Integer> localPathList) {
//
//        // Mark the current node
//        isVisited[u] = true;
//
//        if (u.equals(d))
//        {
//            System.out.println(localPathList);
//            // if match found then no need to traverse more till depth
//            isVisited[u]= false;
//            return ;
//        }
//
//        // Recur for all the vertices
//        // adjacent to current vertex
//        for (Integer i : adjList[u])
//        {
//            if (!isVisited[i])
//            {
//                // store current node
//                // in path[]
//                localPathList.add(i);
//                printAllPathsUtil(i, d, isVisited, localPathList);
//
//                // remove current node
//                // in path[]
//                localPathList.remove(i);
//            }
//        }
//
//        // Mark the current node
//        isVisited[u] = false;
//    }
//
//// Driv