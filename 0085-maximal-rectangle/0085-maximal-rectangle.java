class Solution {
    public int largestRectangleArea(int[] heights) {
        int length=heights.length;
        int lowerBound[]=new int[length];
        int upperBound[]=new int[length];
        for(int i=0;i<length;i++){
            upperBound[i]=length;
            lowerBound[i]=-1;
        }

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<length;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                upperBound[stack.pop()]=i;
            }
            stack.push(i);
        }
        stack.clear();

        for(int i=length-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                lowerBound[stack.pop()]=i;
            }
            stack.push(i);
        }

        // for(int i=0;i<length;i++)System.out.println(lowerBound[i]+" "+upperBound[i]);
        int max=0;
        int val=0;
        for(int i=0;i<length;i++){
            val=heights[i]*(upperBound[i]-lowerBound[i]-1);
            max = max > val ? max : val;
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int Matrix[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]== '1'){
                    Matrix[i][j]=1;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(Matrix[i][j]!=0)Matrix[i][j]+=Matrix[i-1][j];
            }
        }
        // for(int A[] : Matrix){
        //     for(int val : A){
        //         System.out.print(val);
        //     }
        //     System.out.println();
        // }

        int max=0;
        for(int i=0;i<matrix.length;i++){
            max=Math.max(largestRectangleArea(Matrix[i]),max);
        }

        return max;
    }
}