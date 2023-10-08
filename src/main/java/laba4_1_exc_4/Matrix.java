package laba4_1_exc_4;

public class Matrix {
    private double[][] data;
    private long rows;
    private long cols;

    public Matrix sum(Matrix other) {
        Matrix res = new Matrix();
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                res.data[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return res;
    }

    public void multiplyByValue(int value) {
        Matrix res = new Matrix();
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                data[i][j] *= value;
            }
        }
    }
}
