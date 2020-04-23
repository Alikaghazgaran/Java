public class Location {
    public static int row, column;
    public static double maxValue;
    public static Location locateLargest(double[][] a) {
        int r = row;
        int c = column;
        for (int i=0; i<r; i++)
            for (int j=0; j<c; j++)
                if (a[i][j]>maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
        return new Location();
    }
}