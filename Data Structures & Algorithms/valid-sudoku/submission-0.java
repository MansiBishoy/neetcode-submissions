class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen=new HashSet<>();
        int len=board.length;
        if(len!=9||board==null){
            return false;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                char currentVal=board[i][j];
                if(currentVal=='.'){
                    continue;
                }
                String rowkey=currentVal+" in the row "+i;
                String colkey=currentVal+" in the col "+j;
                String boxkey=currentVal+" in the box "+(i/3)+"-"+(j/3);
                if(!seen.add(rowkey)||!seen.add(colkey)||!seen.add(boxkey)){
                return false;

            }
            
            }
        }
        return true;
    }
}
