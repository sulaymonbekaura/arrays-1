import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {
        // Declaration and initialization
        System.out.println("=== Array Declaration ===");
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println("Array    : " + Arrays.toString(nums));
        System.out.println("Length   : " + nums.length);
        System.out.println("First    : " + nums[0]);
        System.out.println("Last     : " + nums[nums.length - 1]);

        // Modification
        nums[2] = 99;
        System.out.println("After nums[2]=99: " + Arrays.toString(nums));

        // Iteration
        System.out.println("\n=== Iterating ===");
        for (int i = 0; i < nums.length; i++) System.out.printf("nums[%d] = %d%n", i, nums[i]);

        // 2D Array — grade matrix
        System.out.println("\n=== 2D Array: Grade Matrix ===");
        int[][] grades = {
            {85, 90, 78},
            {92, 88, 95},
            {70, 75, 80}
        };
        String[] students = {"Alice", "Bob", "Carol"};
        String[] subjects  = {"Math", "English", "Science"};

        System.out.printf("%-8s", "");
        for (String s : subjects) System.out.printf("%-10s", s);
        System.out.println();
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%-8s", students[i]);
            for (int j = 0; j < grades[i].length; j++) System.out.printf("%-10d", grades[i][j]);
            System.out.println();
        }

        // Copying arrays
        System.out.println("\n=== Array Copy ===");
        int[] original  = {1, 2, 3, 4, 5};
        int[] copy      = Arrays.copyOf(original, original.length);
        int[] partial   = Arrays.copyOfRange(original, 1, 4);
        System.out.println("Original : " + Arrays.toString(original));
        System.out.println("Full copy: " + Arrays.toString(copy));
        System.out.println("Partial  : " + Arrays.toString(partial));
    }
}
