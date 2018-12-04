/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.validation.and.testing.data;
import java.util.Scanner; 

/**
 *
 * @author aemal4075
 */
public class DataValidationAndTestingData {
    
    public static void Stage1 (String input1)
    {
     boolean valid = false; 
     while(valid == false)
        
        {
            try
            {
                if(input1.length () > 6)
                valid = true;  
            }
            catch (Exception e)
            {
                System.out.println("Sorry Your input is not valid");
                System.out.println("");
            }
            
        }   
    }
    
    public static void Stage2 (String input2)
    {
     boolean valid = false; 
     while(valid == false)
        
        {
            try
            {
                if(input2.contains ("a"))
                valid = true;  
            }
            catch (Exception e)
            {
                System.out.println("Sorry Your input is not valid");
                System.out.println("");
            }
            
        }    
    }
    
    public static void Stage3 (String input3)
    {
     boolean valid = false; 
     while(valid == false)
        
        {
            try
            {
                if(input3.contains ("z") && input3.length ()<5 && input3.length() >15)
                valid = true;  
            }
            catch (Exception e)
            {
                System.out.println("Sorry Your input is not valid");
                System.out.println("");
            }
            
        }   
    }
    
     public static void Stage4 (int input4)
    {
     boolean valid = false; 
     while(valid == false)
        
        {
            try
            {
                if(input4 > 5 && input4 <500)
                valid = true;  
            }
            catch (Exception e)
            {
                System.out.println("Sorry Your input is not valid");
                System.out.println("");
            }
            
        }   
    }
     
     public static void Stage5 (int input5)
    {
     boolean valid = false; 
     while(valid == false)
        
        {
            try
            {
                if(input5 <0)
                valid = true;  
            }
            catch (Exception e)
            {
                System.out.println("Sorry Your input is not valid");
                System.out.println("");
            }
            
        }   
    }
     
     public static void Stage6 (int input6)
    {
     boolean valid = false; 
     while(valid == false)
        
        {
            try
            {
                if(input6 > 0 &&6 % 2 == 1)
                valid = true;  
            }
            catch (Exception e)
            {
                System.out.println("Sorry Your input is not valid");
                System.out.println("");
            }
            
        }   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); 
        
        String input1, input2, input3;
        int input4, input5, input6; 
        
        System.out.println("Enter a string that is more than 6 charater long: ");
        input1 = keyedInput.nextLine();
        System.out.println("");
        
        System.out.println("Enter a string that atleast contain one lowercase 'a' : ");
        input2 = keyedInput.nextLine();
        System.out.println("");
        
        System.out.println("Enter a string that is 5 and 15 character long, and does not contain any 'z': ");
        input3 = keyedInput.nextLine();
        System.out.println("");
        
        System.out.println("Enter an integer between 5 to 500: ");
        input4 = keyedInput.nextInt();
        System.out.println("");
        
        System.out.println("Enter a negative integer: ");
        input5 = keyedInput.nextInt();
        System.out.println("");
        
        System.out.println("Enter a positive, odd integer: ");
        input6 = keyedInput.nextInt();
        System.out.println("");
        
        Stage1(input1);
        Stage2(input2);
        Stage3(input3);
        Stage4(input4);
        Stage5(input5);
        Stage6(input6);
          
    }
    
}
