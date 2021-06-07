import java.util.Random;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet masīva izmēru robežās no 20 līdz 40: ");
        int size = sc.nextInt();

        Random rnd = new Random();

        int[] array = new int[size];

        String result = " ";

        if (size < 20 || size > 40) {
            System.out.println("Kļūda! Jūsu masīva izmērs nav robežās no 20 līdz 40!");
            return;
        } else if (size > 19 || size < 41) {
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(90) + 10;
                String fArray = formatArrayToString(array);
                result = fArray;
            }
        }

        System.out.print("Jūsu masīvs: " + result);
        System.out.println();
        Sorting(array);
        String fArray = formatArrayToString(array);
        result = fArray;
        System.out.print("Sakārtots Jūsu masīvs: " + result);
        sc.close();
    }

    private static String formatArrayToString(int[] arr) {
        String result = "";
        for (int i : arr) {
            result = result + i + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }

    private static void Sorting(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

    
    
       
