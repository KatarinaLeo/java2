package java2lesson2;

public class Homework2 {

    public static void main(String[] args) {

        String TwoDimArray[][] = new String[][]{
                {"2", "3", "1", "y"},
                {"2", "1", "3", "4"},
                {"4", "1", "7", "6"},
                {"4", "1", "7", "6"},
        };
        try {
            massive(TwoDimArray);
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void massive(String[][]TwoDimArray)throws MyArrayDataException, MyArraySizeException {
        if (TwoDimArray.length != 4)
            throw new MyArraySizeException("Array first dimension size is invalid");
        int sum = 0;
        for (int i = 0; i < TwoDimArray.length; i++) {
            if (TwoDimArray[i].length != 4) {
                throw new MyArraySizeException("Array second dimension size is invalid for index " + i);
            }
            for (int j = 0; j < TwoDimArray[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(TwoDimArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Invalid data it cell for index: " + i + " " + j);
                }
            }
        }
        System.out.println(sum);
    }
}
