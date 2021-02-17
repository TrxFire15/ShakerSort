import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

public class shakerSort {

public static int[] shakerSortNor(int vec[]){
        int li = 0;
        int ls = vec.length-1;
        while(li<=ls) {
                for(int j = li; j<ls; j++) {
                        if(vec[j]>vec[j+1]) {
                                int temp = vec[j];
                                vec[j] = vec[j+1];
                                vec[j+1] = temp;
                        }
                }
                ls--;
                for (int j= ls; j>li; j-- ) {
                        if(vec[j]<vec[j-1]) {
                                int temp  = vec[j];
                                vec[j] = vec[j-1];
                                vec[j-1] = temp;
                        }

                }
                li++;
        }

        return vec;
}
public static int[] shakerSortImp(int vec[]){
        int li = 0;
        int ls = vec.length-1;
        int band = 1;
        while(li<=ls && (band == 1)) {
                band = 0; //Improved
                for(int j = li; j<ls; j++) {
                        if(vec[j]>vec[j+1]) {
                                band = 1;
                                int temp = vec[j];
                                vec[j] = vec[j+1];
                                vec[j+1] = temp;
                        }
                }
                ls--;
                for (int j= ls; j>li; j-- ) {
                        if(vec[j]<vec[j-1]) {
                                band = 1;
                                int temp  = vec[j];
                                vec[j] = vec[j-1];
                                vec[j-1] = temp;
                        }

                }
                li++;
        }

        return vec;
}
public static int[] fill(){
        System.out.println("Enter the number of numbers to enter: ");
        int [] array = new int [sc.nextInt()];
        System.out.println("Enter the numbers: ");
        array = IntStream.range(0, array.length).map(i -> sc.nextInt()).toArray();
        return array;

}
public static void printArray(int array[]){
        System.out.println("Ordered by ShakerSort: ");
        Arrays.stream(array).forEach(System.out::println);
}
public static void main(String[] args) {

        System.out.println("1.-Normal/2.-Improved");
        switch(sc.nextInt()) {
        case 1:
                int [] array = fill();
                array = shakerSortNor(array);
                printArray(array);
                break;
        case 2:
                int [] arrayM = fill();
                arrayM = shakerSortImp(arrayM);
                printArray(arrayM);
                break;
        default:
                break;
        }
}

public static Scanner sc = new Scanner(System.in);
}
