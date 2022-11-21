import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Brown_Marshall_Q1a {

    public static void main(String[] args) {
        ArrayList<String> boys = new ArrayList<String>();
        ArrayList<String> girls = new ArrayList<String>();
        ArrayList<String> entire = new ArrayList<String>();

        //getting the input file from the user
//        Scanner kb = new Scanner(System.in);
//        String path;
//        System.out.println("Please input the path of the file you wish to read from:");
//        path = kb.nextLine();
//        File inFile = new File(path);

        File boyFile = new File("/home/brownm6/Desktop/Marshall");
        File girlFile = new File("/home/brownm6/Desktop/Marshall");
        File inFile = new File("/home/brownm6/Desktop/Marshall/CPSC100 Assignments/Brown_Marshall_230158096_CPSC100_Assignment5/babynames.txt");

        Scanner sc = new Scanner("inFile");

//        while(sc.hasNext()){
//            entire.add(sc.nextLine());

        while(sc.hasNext()){
            for(int i = 0; i < 3; i++){
                System.out.println(sc.next());
            }
        }




    }
}
