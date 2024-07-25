package Medium;

public class LC0221_Maximal_Square {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int squareLength = m > n ? n : m;
       
        while (squareLength > 0) {
            boolean isSquare = true;
            for (int i = 0; i <= m - squareLength; i++) {
                for (int j = 0; j <= n - squareLength; j++) {
                    for (int k = i; k < i + squareLength; k++) {
                        for (int l = j; l < j + squareLength; l++) {
                            if (squareLength == 1) {
                                if (matrix[k][l]=='1') {
                                    return squareLength * squareLength;
                                }
                            }
                            if (matrix[k][l]=='0') {
                                isSquare = false;
                                break;
                            }
                        }
                        if (!isSquare) {
                            break;
                        }
                    }
                    if (isSquare) {
                        return squareLength * squareLength;
                    } else {
                        isSquare = true;
                    }
                }
            }
            squareLength--;
        }
        return squareLength * squareLength;
    }
}
