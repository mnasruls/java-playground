
public class Array {

    public static void main(String[] args) {
        Integer[] arrayInt = {1, 2, 3, 4, 5};// non primitive type
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("arrayInt[" + i + "] = " + arrayInt[i]);
        }

        int[] arrayInt2;// primitive type
        arrayInt2 = new int[5];
        arrayInt2[0] = 1;
        arrayInt2[1] = 2;
        arrayInt2[2] = 3;
        arrayInt2[3] = 4;
        arrayInt2[4] = 5;
        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.println("arrayInt2[" + i + "] = " + arrayInt2[i]);
        }

        String[] arrayString = {"Hello", "World", "Nasrul"};
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("arrayString[" + i + "] = " + arrayString[i]);
        }

        String[][] arrayString2 = new String[2][2];
        arrayString2[0][0] = "Hello";
        arrayString2[0][1] = "World";
        arrayString2[1][0] = "Nasrul";
        arrayString2[1][1] = "Hakim";
        for (int i = 0; i < arrayString2.length; i++) {
            for (int j = 0; j < arrayString2[i].length; j++) {
                System.out.println("arrayString2[" + i + "][" + j + "] = " + arrayString2[i][j]);
            }
        }

    }
}
