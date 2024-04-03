import java.util.Arrays;
public class StringReverse {
    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        int left = 0;
        int right = c.length - 1;
        while(right > left){
            char temp = c[right];
            c[right--] = c[left];
            c[left++] = temp;
        }
        System.out.println(Arrays.toString(c));
    }
}
