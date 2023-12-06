public class loto {
    public static void main(String[] args){
        int[][] lotocard = { {20, 15, 7},
                             {8, 7, 19},
                             {7, 13, 47} 
                        };
        System.out.println(lotocard[0][0]);
        System.out.println("---------------");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.err.println(lotocard[i][j]);
            }
            
        }

    }
    
}
