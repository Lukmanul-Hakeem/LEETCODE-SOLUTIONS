class Solution {
    class Cell{
        int row;
        int column;
        int priority;
        Cell(int row,int column,int priority){
            this.row = row;
            this.column = column;
            this.priority = priority;
        }
    }
    public int minTimeToReach(int[][] moveTime) {
        int rowlength = moveTime.length;
        int columnlength = moveTime[0].length;
        int dp[][] = new int[moveTime.length][moveTime[0].length];
        for(int i=0;i<rowlength;i++)for(int j=0;j<columnlength;j++)dp[i][j] = Integer.MAX_VALUE;
        dp[0][0] = 0;

        PriorityQueue<Cell> queue = new PriorityQueue<>((a,b) -> Integer.compare(a.priority,b.priority));
        queue.offer(new Cell(0,0,moveTime[0][0]));

        int time = 0;

        while(!queue.isEmpty()){
            
            Cell c = queue.poll();

            if(c.column + 1 < columnlength){
                if(dp[c.row][c.column] < moveTime[c.row][c.column+1]){
                    time = moveTime[c.row][c.column+1] - dp[c.row][c.column] + 1;
                }else{
                    time++;
                }

                if(dp[c.row][c.column+1] > dp[c.row][c.column] + time){
                    dp[c.row][c.column+1] = dp[c.row][c.column] + time;
                    queue.offer(new Cell(c.row,c.column+1,dp[c.row][c.column+1]));
                }
            }

            time = 0;

            if(c.column - 1 >= 0){
                if(dp[c.row][c.column] < moveTime[c.row][c.column-1]){
                    time = moveTime[c.row][c.column-1] - dp[c.row][c.column] + 1;
                }else{
                    time++;
                }
                if(dp[c.row][c.column-1] > dp[c.row][c.column] + time){
                    dp[c.row][c.column-1] = dp[c.row][c.column] + time;
                    queue.offer(new Cell(c.row,c.column-1,dp[c.row][c.column-1]));
                }    
            }

            time = 0;

            if(c.row - 1 >= 0){
                if(dp[c.row][c.column] < moveTime[c.row - 1][c.column]){
                    time = moveTime[c.row - 1][c.column] - dp[c.row][c.column] + 1;
                }else{
                    time++;
                }

                if(dp[c.row - 1][c.column] > dp[c.row][c.column] + time){
                    dp[c.row - 1][c.column] = dp[c.row][c.column] + time;
                    queue.offer(new Cell(c.row - 1,c.column,dp[c.row - 1][c.column]));
                }
            }

            time = 0;
            
            if(c.row + 1 < rowlength){
                if(dp[c.row][c.column] < moveTime[c.row + 1][c.column]){
                    time = moveTime[c.row + 1][c.column] - dp[c.row][c.column] + 1;
                }else{
                    time++;
                }

                if(dp[c.row + 1][c.column] > dp[c.row][c.column] + time){
                    dp[c.row + 1][c.column] = dp[c.row][c.column] + time;
                    queue.offer(new Cell(c.row + 1,c.column,dp[c.row + 1][c.column]));
                }
            
            }

            time = 0;
            
        }

        // for(int i=0;i<rowlength;i++){
        //     for(int j=0;j<columnlength;j++)System.out.print(dp[i][j]+" ");
        //     System.out.println();
        // }

        return dp[rowlength - 1][columnlength - 1];

        
    }
}