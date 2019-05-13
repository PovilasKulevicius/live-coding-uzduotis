import java.util.ArrayList;

public class Task1 {
    public Integer countScore(ArrayList<String> list){
        //Checks if there are no more than 10 matches
        if(list.size() > 10){
            System.out.println("Wrong number of matches!");
            return null;
        }
        int score = 0;
        int x, y;
        for(int i = 0; i < list.size(); i++){
            x = Character.getNumericValue(list.get(i).charAt(0));
            y = Character.getNumericValue(list.get(i).charAt(2));
            //Checks the score condition
            if(x > 4 || x <  0 || y > 4 || y < 0){
                return null;
            }
            //Gives scores
            if(x > y){
                score += 3;
            } else if(x == y) {
                score += 1;
            }
        }
        return score;
    }
}
