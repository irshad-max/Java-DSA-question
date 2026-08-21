class FindMissingValues {
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 10};
        int expected = 1;

        for (int i = 0; i < arr.length; i++) {
            while (expected < arr[i]) {
                System.out.println(expected);
                expected++;
            }
            expected = arr[i] + 1;
        }
    }
}