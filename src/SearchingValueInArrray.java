import java.util.Scanner;

public class SearchingValueInArrray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i=0; i<students.length; i++){
            if(students[i].equals(name)){
                System.out.println("Position of student "+ name + "is: "+(i+1));
                isExist = true;
                break;
            }
        }if(!isExist) System.out.println("Not found");
    }

}
