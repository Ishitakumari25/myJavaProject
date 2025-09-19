import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        
        System.out.print("Enter the size of the first ArrayList: ");
        int size1 = sc.nextInt();

       
        System.out.println("Enter the elements of the first ArrayList:");
        for (int i = 0; i < size1; i++) {
            list1.add(sc.next());
        }

        
        System.out.print("Enter the size of the second ArrayList: ");
        int size2 = sc.nextInt();

        
        System.out.println("Enter the elements of the second ArrayList:");
        for (int i = 0; i < size2; i++) {
            list2.add(sc.next());
        }

        
        List<String> commonElements = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println("Common elements: " + commonElements);
    }
}