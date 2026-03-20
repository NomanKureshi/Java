import java.util.Arrays;

class SortStrings {
    public static void main(String[] args) {

        Arrays.sort(args);

        System.out.println("Sorted strings:");
        for(String s : args)
            System.out.println(s);
    }
}
