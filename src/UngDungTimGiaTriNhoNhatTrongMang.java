public class UngDungTimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("giá trị nhỏ nhất của mảng là: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        int min = array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
}