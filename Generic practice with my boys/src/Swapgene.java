public class Swapgene {
    public static <T> void swap(T[] array, int indx1, int indx2){
        T temp = array[indx1];
        array[indx1] = array[indx2];
        array[indx2] = temp;
    }
}
