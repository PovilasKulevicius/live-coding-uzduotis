import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Task1
        ArrayList<String> list= new ArrayList<>();
        list.add("3:1");
        list.add("2:2");
        list.add("1:3");
        Task1 task1 = new Task1();
        int score = task1.countScore(list);
        System.out.println("The score is: " + score);

        //Task2
        String[] land = {
                "XOOXO",
                "XOOXO",
                "OOOXO",
                "XXOXO",
                "OXOOO"};
        Task2 task2 = new Task2();
        int perimeter = task2.landPerimeter(land);
        System.out.println("Total land perimeter: " + perimeter);

        //Task3
        Task3 task3 = new Task3();
        int cowNumber = task3.countCows(10);
        System.out.println("Total number of cows: " + cowNumber);
    }

}
