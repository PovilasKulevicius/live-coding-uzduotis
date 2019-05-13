import java.util.ArrayList;

public class Task3 {
    public Integer countCows(int years){
        if(years < 0)
            return null;
        int cowNumber = 1;
        ArrayList<Integer> cowsAge = new ArrayList<>();
        cowsAge.add(0);
        for(int i = 0; i <= years; i++){
            for(int j = 0; j < cowsAge.size(); j++) {
                cowsAge.set(j, cowsAge.get(j) + 1);
                if(cowsAge.get(j) > 3){
                    cowNumber++;
                    cowsAge.add(0);
                }
            }
        }
        return cowNumber;
    }
}
