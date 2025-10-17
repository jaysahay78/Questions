import java.util.*;

public class Test {

    static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] cost = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j) cost[i][j] = 0;
                else cost[i][j] = (int)1e9;
            }
        }

        for(int i=0; i<edges.length; i++){
            cost[edges[i][0]][edges[i][1]] = edges[i][2];
            cost[edges[i][1]][edges[i][0]] = edges[i][2];
        }

        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost [k][j]);
                }
            }
        }
        int minCities = 0;
        int ans = -1;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(cost[i][j] <= distanceThreshold) count++;
            }
            if(count <= minCities){
                minCities = count;
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] edges = {
                {0,1,3},
                {1,2,1},
                {1,3,4},
                {2,3,1}
        };
        System.out.println(findTheCity(4, edges, 4));

    }
}
