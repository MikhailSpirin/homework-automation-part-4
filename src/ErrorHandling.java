import java.util.Arrays;

/**
 * Created by mikhails on 28.09.2016
 */
public class ErrorHandling {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(formatStrArrToIntArr(new String[]{"5", "3", "8"})));
        System.out.println(Arrays.toString(formatStrArrToIntArr(new String[]{"5", "8", "5", "8"})));
        System.out.println(Arrays.toString(formatStrArrToIntArr(new String[]{"5", "8"})));
        System.out.println(Arrays.toString(formatStrArrToIntArr(new String[]{"a", "s", "8"})));
        System.out.println(Arrays.toString(formatStrArrToIntArr(null)));

    }
    public static int[] formatStrArrToIntArr(String[] strArray){
        int intArray[] = new int[3];
        try {
            if (strArray.length != 3) throw new IndexOutOfBoundsException();
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error! Wrong input data: source array has less or more than 3 elements");
        } catch (NumberFormatException e) {
            System.out.println("Error! Wrong input data: source array has elements with non-convertible data");
        } catch (NullPointerException e) {
            System.out.println("Error! Wrong input data: source array is null");
        }
        return null;
    }
}
