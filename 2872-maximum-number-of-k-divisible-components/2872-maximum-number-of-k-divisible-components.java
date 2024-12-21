class Solution {
    public long reverse(List<Integer> list[], int visited[], int index, int values[], int k, int count[]) {
        visited[index] = 1;
        long subTreeSum = values[index];
        
        for (int i = 0; i < list[index].size(); i++) {
            int neighbor = list[index].get(i);
            if (visited[neighbor] == 0) { // Corrected the visited condition
                subTreeSum += reverse(list, visited, neighbor, values, k, count);
            }
        }
        
        // Check divisibility
        if (subTreeSum % k == 0) {
            count[0]++;
            return 0; // Reset the subtree sum
        }
        
        return subTreeSum; // Return the sum to the parent
    }

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        // Handle edge cases
        if (n == 1) return 1;
        if (k == 1) return n;

        // Build adjacency list
        List<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) list[i] = new ArrayList<>();
        for (int[] edge : edges) {
            list[edge[0]].add(edge[1]);
            list[edge[1]].add(edge[0]);
        }

        int[] visited = new int[n];
        int[] count = new int[1];
        count[0] = 0;

        // Perform DFS from node 0
        reverse(list, visited, 0, values, k, count);

        return count[0];
    }
}