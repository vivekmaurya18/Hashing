
public class CountingFrequenciesofArrayElements {
    public static void countElements(int[] arr){

        int n=arr.length;

        int[] hash=new int[13];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(
                    "Element: " + i + ", Frequency: " + hash[i]
                );
            }
        }
        int[] queries = {1, 4, 2, 3, 12};

        for (int number : queries) {
            System.out.println(
                "Element: " + number +
                ", Frequency: " + hash[number]
            );
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2};
        countElements(arr);
    }
}
