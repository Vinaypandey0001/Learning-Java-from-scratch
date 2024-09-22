public class RevStrUsingCharArr {
    public static void main(String[] args) {
        String s = "prepinsta";
        char[] arr = s.toCharArray();
        int l = arr.length;
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
