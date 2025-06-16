package GreedyAlgorithms;

import java.util.Arrays;

public class Dijkstra {
    public static void main(String[] args) {
        //A B C D E
        //利用邻接矩阵表示有向图
        int[][] graph = {
                {0, 10, 20, 3, 0},
                {0, 0, 5, 0, 0},
                {0, 0, 0, 0, 15},
                {0, 2, 0, 0, 11}
        };
        //源点
        int source = 0;
        dijkstra(graph, source);
    }
    public static void dijkstra(int[][] graph, int source) {
        int n = graph.length;
        //首先定义3个数组 dist set path
        int[] dist = new int[n];
        boolean[] set = new boolean[n];
        int[] path = new int[n];
        //初始化3个数组
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(set, false);
        Arrays.fill(path, -1);
        //源点到自身的距离为0
        dist[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            int u = findMinDistanceVertex(dist, set);
            //所有节点已经访问
            if (u == -1) {
                break;
            }
            for (int v = 0; v < n; v++) {
                if (!set[i] && graph[u][v] != 0) {
                    //计算新距离
                    int newDistance = dist[u] + graph[u][v];
                    //新距离更短 更新dist[v] 同时定义v的前驱为u
                    if (newDistance < dist[v]) {
                        dist[v] = newDistance;
                        path[v] = u;
                    }
                }
            }
        }

//打印-- 略
    }
    public static int findMinDistanceVertex(int[] dist, boolean[] set) {
            int minDistance = Integer.MAX_VALUE;
            int minVertex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!set[i] && dist[i] < minDistance) {
                minDistance = dist[i];
                minVertex = i;
            }
        }
        return minVertex;//第一轮 A D B C E
    }
}
