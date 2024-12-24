public class FindMinNumberFromArray {
    public static void main(String[] args) {

        int min;
        int indexMinElement;
        int[] array = new int[10];

        fillingArray(array);
        min = array[0];
        indexMinElement = 0;

        for (int i = 1; i < array.length; i++) {

            if (min > array[i]) {

                min = array[i];
                indexMinElement = i;
            }
        }

        printResult(min, indexMinElement);
    }

    private static void fillingArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100);
        }
    }

    private static void printResult(int min, int index) {

        System.out.println("Минимальное число = " + min + " его индекс = " + index);
    }

}