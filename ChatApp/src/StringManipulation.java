import java.util.Arrays;
public class StringManipulation {
    public static void main(String[] args) {
        String myString = "Nick*Sean*Arefin*Tasin";
        String[] splitString = myString.split("*");

        System.out.println(Arrays.toString(splitString));



    }
}
