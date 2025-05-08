class Solution {

    class Cell{
        int row;
        int column;
        int priority;
        int flag;

        Cell(int row,int column,int priority,int flag){
            this.row = row;
            this.column = column;
            this.priority = priority;
            this.flag = flag;
        }
    }
    public int minTimeToReach(int[][] moveTime) {
        PriorityQueue<Cell> queue = new PriorityQueue<>((a,b) -> Integer.compare(a.priority,b.priority));
        queue.offer(new Cell(0,0,0,0));

        int dp[][] = new int[moveTime.length][moveTime[0].length];

        for(int i=0;i<moveTime.length;i++)for(int j=0;j<moveTime[0].length;j++)dp[i][j] = Integer.MAX_VALUE;
        dp[0][0] = 0;

        Cell c = null;
        int time = 0;
        int val = 1;
        int rowlength = moveTime.length;
        int columnlength = moveTime[0].length;
        int flag = 0;

        while(!queue.isEmpty()){
            c = queue.poll();
            //System.out.println(c.row+" "+c.column+" "+val);

            if(c.flag == 0){
                val = 1;
                flag = 1;
            }else{
                val = 2;
                flag = 0;
            } 

            if(c.column + 1 < columnlength){
                if(dp[c.row][c.column] < moveTime[c.row][c.column+1]){
                    time = moveTime[c.row][c.column+1] - dp[c.row][c.column] + val;
                }else{
                    time += val;
                }

                if(dp[c.row][c.column+1] > dp[c.row][c.column] + time){
                    dp[c.row][c.column+1] = dp[c.row][c.column] + time;
                    queue.offer(new Cell(c.row,c.column+1,dp[c.row][c.column+1],flag));
                }
            }

            time = 0;

            if(c.column - 1 >= 0){
                if(dp[c.row][c.column] < moveTime[c.row][c.column-1]){
                    time = moveTime[c.row][c.column-1] - dp[c.row][c.column] + val;
                }else{
                    time += val;
                }
                if(dp[c.row][c.column-1] > dp[c.row][c.column] + time){
                    dp[c.row][c.column-1] = dp[c.row][c.column] + time;
                    queue.offer(new Cell(c.row,c.column-1,dp[c.row][c.column-1],flag));
                }    
            }

            time = 0;

            if(c.row - 1 >= 0){
                if(dp[c.row][c.column] < moveTime[c.row - 1][c.column]){
                    
                    time = moveTime[c.row - 1][c.column] - dp[c.row][c.column] + val;
                }else{
                    time += val;
                }

                if(dp[c.row - 1][c.column] > dp[c.row][c.column] + time){
                    dp[c.row - 1][c.column] = dp[c.row][c.column] + time;
                    queue.offer(new Cell(c.row - 1,c.column,dp[c.row - 1][c.column],flag));
                }
            }

            time = 0;
            
            if(c.row + 1 < rowlength){
                if(dp[c.row][c.column] < moveTime[c.row + 1][c.column]){
                    
                    time = moveTime[c.row + 1][c.column] - dp[c.row][c.column] + val;
                }else{
                    time += val;
                }

                if(dp[c.row + 1][c.column] > dp[c.row][c.column] + time){
                    dp[c.row + 1][c.column] = dp[c.row][c.column] + time;
                    queue.offer(new Cell(c.row + 1,c.column,dp[c.row + 1][c.column],flag));
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