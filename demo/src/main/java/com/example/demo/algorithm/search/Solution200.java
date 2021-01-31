package com.example.demo.algorithm.search;

/**
 * @author bigwillc
 **/
public class Solution200 {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};


    public int numIslands(char[][] grid) {
        int count = 0;
        char[][] g = grid;

        //1. 遍历
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                if (g[i][j] == 1) {
                    //2. 沉岛，bfs 或dfs
                    sink(g, i, j);
                    count ++;
                }
            }
        }

        return count;
    }

    public void sink(char[][] gird, int i, int j) {
        if (gird[i][j] == 0) {
            return;
        }

        gird[i][j] = 0;
        for (int k = 0; k < dx.length; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x > 0 && x < gird.length && y > 0 && y > gird[i].length) {
                if (gird[x][y] == 1) {
                    sink(gird, x, y);
                }
            }
        }
    }
}
