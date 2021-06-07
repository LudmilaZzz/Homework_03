import java.util.Random;
import java.util.Scanner;

public class SortArray2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet masīva izmēru robežās no 10 līdz 20: ");
        int size = sc.nextInt();

        Random rnd = new Random();

        int[] array = new int[size];
        int size2 = rnd.nextInt(40) + 10;
        int[] array2 = new int[size2];

        String result = " ";
        String result2 = " ";

        if (size < 10 || size > 20) {
            System.out.println("Kļūda! Jūsu masīva izmērs nav robežās no 10 līdz 20!");
            return;
        } else if (size > 9 || size < 21) {
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(899) + 100;
                String fArray = formatArrayToString(array);
                result = fArray;
            }
            for (int j = 0; j < array2.length; j++) {
                array2[j] = rnd.nextInt(899) + 100;
                String fArray2 = formatArrayToString2(array2);
                result2 = fArray2;
            }

            System.out.print("Jūsu masīvs: " + result);
            System.out.println();
            System.out.print("Otrais masīvs: " + result2);
            System.out.println();
        }
        Sorting(array);
        String fArray = formatArrayToString(array);
        result = fArray;
        System.out.print("Sakārtots Jūsu masīvs: " + result);
        System.out.println();
        Sorting2(array2);
        String fArray2 = formatArrayToString2(array2);
        result2 = fArray2;
        System.out.print("Sakārtots otrais masīvs: " + result2);

        double average1 = 0;
        double average2 = 0;
        for (int i = 0; i < size; i++) {
            average1 += array[i];
            average2 += array2[i];
        }
        average1 /= size;
        average2 /= size;
        System.out.println();
        System.out.print("Vidējā vērtība Jūsu massīvam: " + average1);
        System.out.println();
        System.out.print("Vidējā vērtība otrajam massīvam: " + average2);
        System.out.println();

        if (average1 > average2) {
            System.out.println("Masīvs ar vislielāko vidējo vērtību (Jūsu massīvs): " + fArray);
        } else if (average2 > average1) {
            System.out.println("Masīvs ar vislielāko vidējo vērtību (Otrais massīvs): " + fArray2);
        }
        sc.close();
    }

    private static String formatArrayToString(int[] array) {
        String result = "";
        for (int i : array) {
            result = result + i + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }

    private static void Sorting(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void Sorting2(int[] array2) {
        for (int i = array2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array2[j] < array2[j + 1]) {
                    int temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }
    }

    private static String formatArrayToString2(int[] array2) {
        String result2 = "";
        for (int j : array2) {
            result2 = result2 + j + ", ";
        }
        result2 = result2.substring(0, result2.length() - 2);
        return result2;
    }
}
