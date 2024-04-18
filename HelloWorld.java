import java.time.LocalDateTime;
// import java.util.Calendar;

// import javax.xml.crypto.Data;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Data
        // Calendar

        System.out.println(LocalDateTime.now());

        int n = 345;
        double d = 5.45;
        String s = "Hello!";
        char c = 'g';
        boolean b = true;

        System.out.println(n);
        System.out.println(d);
        System.out.println(s);
        System.out.println(c);
        System.out.println(b);

        int[] array = new int[5];
        int[] array1 = new int[] {5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 4, 5};
        int array3[] = {1, 2, 3, 4, 5};

        while (b) {

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        for (int elem : array1) {
            System.out.println(elem + " ");
        }

        if(true){

        } else if (false){

        } else{
            
        }
    }
}
