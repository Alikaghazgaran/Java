public class TicTacToe {
    public enum e {X, O, Empty};
    private e[][] arr = new e[3][3];
    public TicTacToe () {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                arr[i][j] = e.Empty;
            }
        }
    }
    public void print() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (arr[i][j]==e.X)
                    System.out.print(e.X + "     ");
                else if (arr[i][j]==e.O)
                    System.out.print(e.O + "     ");
                else
                    System.out.print(e.Empty + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void move(char m, int x, int y) {
        if (arr[y-1][x-1]==e.Empty) {
            if (m=='X')
                arr[y-1][x-1] = e.X;
            else if (m=='O')
                arr[y-1][x-1] = e.O;
        }
        else {
            System.out.println("Taken!");
        }
    }
    public void win() {
        if ( (arr[0][0]==arr[1][0] && arr[1][0]==arr[2][0] && arr[0][0]!=e.Empty) ||
             (arr[0][1]==arr[1][1] && arr[1][1]==arr[2][1] && arr[0][1]!=e.Empty) ||
             (arr[0][2]==arr[1][2] && arr[1][2]==arr[2][2] && arr[0][2]!=e.Empty) ||
             (arr[0][0]==arr[0][1] && arr[0][1]==arr[0][2] && arr[0][0]!=e.Empty) ||
             (arr[1][0]==arr[1][1] && arr[1][1]==arr[1][2] && arr[1][0]!=e.Empty) ||
             (arr[2][0]==arr[2][1] && arr[2][1]==arr[2][2] && arr[2][0]!=e.Empty) ||
             (arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2] && arr[0][0]!=e.Empty) ||
             (arr[2][0]==arr[1][1] && arr[1][1]==arr[0][2] && arr[2][0]!=e.Empty)  ) {
            System.out.println("Game Over!");
            System.exit(0);
        }
        else {
            for (int i=0; i<3; i++) {
                for (int j=0; j<3; j++) {
                    if (arr[i][j]==e.Empty) {
                        return;
                    }
                }
            }
            System.out.println("Draw!");
            System.exit(0);
        }
    }
}