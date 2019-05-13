public class Task2 {
    public int landPerimeter(String[] land){
        String[][] land1 = new String[land.length][land[0].length()];
        //Convers a single dimension array to two 2D String array
        for(int i = 0; i < land.length; i++){
            for(int j = 0; j < land[0].length(); j++){
                land1[i][j] = String.valueOf(land[i].charAt(j));
            }
        }
        int perimeter = 0;
        //Counts the neighbours by shifting the 2D String array and adds to the perimeter
        for (int i = 0; i < land1.length; i++) {
            for (int j = 0; j < land1[0].length; j++) {
                if(land1[i][j].equals("X")){
                    int neighbours = 0;
                    if (land1[Math.floorMod(i - 1, land1.length)][j].equals("X"))
                        neighbours++;
                    if (land1[i][Math.floorMod(j - 1, land1[i].length)].equals("X"))
                        neighbours++;
                    if (land1[i][Math.floorMod(j + 1, land1[i].length)].equals("X"))
                        neighbours++;
                    if (land1[Math.floorMod(i + 1, land1.length)][j].equals("X"))
                        neighbours++;

                    switch (neighbours) {
                        case 0:
                            perimeter += 4;
                            break;
                        case 1:
                            perimeter += 3;
                            break;
                        case 2:
                            perimeter += 2;
                            break;
                        case 3:
                            perimeter += 1;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return perimeter;
    }
}
