package PRACTICE01;

public class length {
    public static int lengthOfString(String str) {
        int size = 0;
        for(int i=1; i<=str.length(); i++) {
                size++;
        }
        return size;
    }
    public static void main(String[] args) {
        String str = "Nandubodra";
        System.out.println(lengthOfString(str));
    }
}
