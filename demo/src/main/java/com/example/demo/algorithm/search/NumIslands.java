package com.example.demo.algorithm.search;

/**
 * @author bigwillc
 **/
public class NumIslands {

    static int dx[] = new int[]{-1, 1, 0, 0};
    static int dy[] = new int[]{0, 0, -1, 1};
    static char[][] g;

    public static int numIslands(char[][] grid) {
        int islands = 0;
        g = grid;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                if(g[i][j] == '0') continue;
                islands += sink(i, j);
            }
        }
        return islands;
    }

    private static int sink(int i, int j) {
        if (g[i][j] == '0') {
            return 0;
        }

        g[i][j] = '0';

        for (int k = 0; k < dx.length; ++k) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && x < g[i].length && y >= 0 && y < g.length) {
                if(g[x][y] == '0') continue;
                sink(x, y);
            }
        }

        return 1;
    }

    public static void main(String[] args) {
//        char[][] temp = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
//        int res = numIslands(temp);
//        System.out.println(res);

        int[][] temp = new int[][]{{1, 1, 1}};
        System.out.println(temp.length);
        System.out.println(temp[0].length);
    }
}
