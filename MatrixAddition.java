import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lựa chọn nhập ma trận hoặc dùng ma trận hằng số
        System.out.print("Bạn có muốn nhập ma trận thủ công không? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int rows, cols;
        int[][] matrix1, matrix2, sumMatrix;

        if (choice.equals("yes")) {
            // Nhập kích thước ma trận
            System.out.print("Nhập số hàng của ma trận: ");
            rows = scanner.nextInt();
            System.out.print("Nhập số cột của ma trận: ");
            cols = scanner.nextInt();

            // Khởi tạo ma trận
            matrix1 = new int[rows][cols];
            matrix2 = new int[rows][cols];
            sumMatrix = new int[rows][cols];

            // Nhập ma trận 1
            System.out.println("Nhập các phần tử của ma trận 1:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            // Nhập ma trận 2
            System.out.println("Nhập các phần tử của ma trận 2:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        } else {
            // Dùng ma trận hằng số
            matrix1 = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            matrix2 = new int[][] {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };

            rows = matrix1.length;
            cols = matrix1[0].length;
            sumMatrix = new int[rows][cols];

            System.out.println("Dùng ma trận hằng số.");
        }

        // Cộng hai ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // In kết quả
        System.out.println("Kết quả của phép cộng hai ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
