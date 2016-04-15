import java.util.*;
import java.io.*;
/**
 * Stores data from disk
 *
 * @author Tsegaw Shibeshi Tatek
 * @version 12, 04, 2016
 */
public class Load implements Disk
{
    //Object varaibles
    private String names;
    
    //Creates a new record
    public Load(String name){
        this.names=names;
    }
    
    
    //Returns 10 cards for the user
    public String tenTenRandomCardsForUserAndComputer(){
        for (int i=0; i<9; i++){
            String user;
            Random rand = new Random();
            user = names [rand.nextInt(names.length)];
            return user;
        }
        
        for (int i=9; i<19; i++){
            String computer;
            Random rand = new Random();
            computer = names [rand.nextInt(names.length)];
            return computer;
        }
    }
                
   
    