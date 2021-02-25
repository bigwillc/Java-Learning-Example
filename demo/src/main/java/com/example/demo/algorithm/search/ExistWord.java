package com.example.demo.algorithm.search;

/**
 * @author bigwillc
 **/
public class ExistWord {

    int[] dx = new int[]{-1, 1, 0, 0};
    int[] dy = new int[]{0, 0, -1, 1};
    int len;
    char[][] b;
    int rows;
    int cols;
    boolean[][] visited;
    char[] charArray;


    public boolean exist(char[][] board, String word) {
        rows = board.length;
        if (rows == 0) {
            return false;
        }
        cols = board[0].length;
        visited = new boolean[rows][cols];

        this.len = word.length();
        this.charArray = word.toCharArray();
        this.b = board;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, int begin) {
        // terminator
        if (begin == len - 1) {
            return b[i][j] == charArray[begin];
        }

        if (b[i][j] == charArray[begin]) {
            visited[i][j] = true;
            for (int k = 0; k < dx.length; k++) {
                // set visited flag;
                int x = i + dx[k];
                int y = j + dy[k];
                if (x >= 0 && x < b.length && y >= 0 && y < b[0].length && !visited[x][y]) {
                    if (dfs(x, y, begin + 1)) {
                        return true;
                    }
                }
            }
            visited[i][j] = false;
        }
        return false;
    }


    public static void main(String[] args) {
        char c = 'h';
        String word = "hello";
        boolean flag;
        String word2 = String.valueOf(c) + "ello";
        if (word2.equals(word)) {
            flag = true;
        } else {
            flag = false;
        }

        System.out.println(flag);
    }
}
