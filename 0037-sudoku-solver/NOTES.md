}
​
}
return false;
}
public  boolean isvalid(char[][] board,int x,int y,int k){
for (int i = 0; i <board[0].length; i++) {
if(board[x][i]==(char)(k+'0'))
return false;
}
for (int i = 0; i <board.length; i++) {
if(board[i][y]==(char)(k+'0'))
return false;
}
int a=(x/3)*3;
int b=(y/3)*3;
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
if(board[a+i][b+j]==(char)(k+'0'))
return false;
}
}
return true;
}
}
``