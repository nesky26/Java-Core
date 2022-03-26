package HW2;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String[][] correct = {
                {"12", "36", "-123", "18"},
                {"21", "87", "139", "654"},
                {"3", "0", "-11", "34"},
                {"55", "7", "87", "101"}
        };
        String[][] incorrect = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect2 = {
                {"1", "2", "3"},
                {"1", "2", "4"},
                {"1", "2", "3"},
                {"1", "2", "3"}
        };
        String[][] incorrect1 = {
                {"12", "21", "121", "1"},
                {"11", "100", "34", "56"},
                {"13", "13", "90", "13"},
                {"13", "ert", "13", "13"}
        };

        try {
            main.stringExceptionSize(correct);
            //    main.stringExceptionSize(incorrect);
            main.stringExceptionSize(incorrect2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов массива = " + sumArray(correct));
            System.out.println(sumArray(incorrect1));
        } catch (MyArrayDataException ex){
            ex.printStackTrace();
        }
    }

    private static int sumArray(String[][] table) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                try {
                    sum += Integer.parseInt(table[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public void stringExceptionSize(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Неверное количество столбцов ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int row, int col) {
        super(String.format("Неверный элемент %d строка, %d столбец", row+1, col+1));
    }
}
