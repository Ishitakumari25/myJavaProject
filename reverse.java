import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sentence?? : ");
        String sentence = sc.nextLine();
        String []words = sentence.split("");
        String reverse = "";
        for (int i= words.length-1; i>=0;i--){
            reverse +=words[i];
            if (i!=0){
                reverse+= " ";

            }
        }
        System.out.println(reverse);


    }
}


 