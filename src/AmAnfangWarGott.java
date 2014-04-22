
/**
 * Write a description of class AmAnfangWarGott here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmAnfangWarGott
{   
    private int [] [] seatPlan = new int[5][10];

    public AmAnfangWarGott()
    {
        int [] [] seatPlan ={
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
        };
    }
    
    public void reserveSeat(int a, int b){
        int row = a;
        int seat = b;
        
        seatPlan[row][seat] = 1;
        
    }
    
    public void printPlan(){
        System.out.print('\u000C');
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                System.out.print(seatPlan[i][j]);
            }
            System.out.println();
        }
    }    
    
    public void clearConsole(){
        System.out.print('\u000C');
    }
}
