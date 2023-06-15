import java.util.HashSet;
import java.util.Set;

class SnakeGame {


    public static void main(String[] args) {
        SnakeGame sg = new SnakeGame(3, 2, new int[][]{{1,2},{0,1}});
        sg.printBoard(sg.matrix);

        sg.move("R");
        sg.printBoard(sg.matrix);

        sg.move("D");
        sg.printBoard(sg.matrix);


         sg.move("R");
        sg.printBoard(sg.matrix);


        //sg.move("U");
        //sg.move("L");
        //sg.move("L");

    }

    private int width;
    private int height;
    private int[][] food;
    private int matrix [][];
    private int score = 0;
    private int foodIndex = 0;
    private int headRow = 0;
    private int headCol = 0;


    public SnakeGame(int width, int height, int[][] food) {
        this.width = width;
        this.height = height;
        this.food = food;

        matrix = new int [height][width];

        matrix [0][0] =1;

        foodIndex =  placeFood(matrix, food, foodIndex);

        //printBoard(matrix);

    }

    public int move(String direction) {

        if(!canMove(direction)){
            return -1;
        }
        //food
        if(matrix[headRow][headCol] ==-1){

            score++;
            matrix[headRow] [headCol] = score;

            if(foodIndex < food.length){
                foodIndex = placeFood(matrix,  food, foodIndex);
            }
        }else {
            matrix[headRow][headCol] = score + 2;
            this.dfs(matrix, headRow, headCol, new HashSet<>());

        }


        return score;

    }

    void dfs(int[][] matrix, int startRow, int startCol, Set<String> visited ){
        if(startRow >= matrix.length || startRow <0){
            return;
        }
        if(startCol >= matrix[0].length || startCol <0){
            return ;
        }
        if(matrix[startRow][startCol] == 0){
            return ;
        }
        if(visited.contains(startRow+"_"+ startCol)){
            return ;
        }

        if(matrix[startRow][startCol] <0){
            return ;
        }
        visited.add(startRow+"_"+ startCol);
        matrix[startRow][startCol] = matrix[startRow][startCol]-1;
        dfs(matrix, startRow-1,  startCol, visited );
        dfs(matrix, startRow+1,  startCol , visited);
        dfs(matrix, startRow,  startCol-1 ,visited);
        dfs(matrix, startRow,  startCol+1 , visited);

    }

    int placeFood(int matrix[][], int [][] food, int index ){
        int [] currentFood =  food[index];
        matrix[currentFood[0]][currentFood[1]] = -1;
        return index +1;
    }

    boolean canMove(String direction){

        if("U".equals(direction)){
            headRow = headRow-1;
            if(headRow < 0){
                return false;
            }

        } else if( "D".equals(direction)){
            headRow = headRow +1;
            if(headRow >= matrix.length){
                return false;
            }
        }else if("L".equals(direction)){
            headCol = headCol-1;
            if(headCol < 0){
                return false;
            }

        }else if("R".equals(direction)){
            headCol = headCol+1;
            if(headCol >= matrix[0].length){
                return false;
            }
        }



        return true;
    }

    void printBoard(int matrix[][]){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("---");
    }
}

