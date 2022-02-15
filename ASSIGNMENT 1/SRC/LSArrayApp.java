// Rethabile Modise 
// 25/02/2020
/* progrm to read in a textfile and store the data items within a traditional array and also instrument 
how long it takes to fine an element in the array 
*/


import java.util.*;
import java.io.*;
public class LSArrayApp{ 

//instance variables 
      int OperCount=0;
      String[] file = new String[2976];
      
   public static void main(String args[])
   { 
   /* the main method prints out the whole dataset if no arguments are given and search is made and prints 
   out the areas affected by the loadshedding when the available stage,day and time are given. */ 
   
   LSArrayApp ls = new LSArrayApp();     
   if(args.length==0)
   { 
   ls.printAllAreas();
   }
   else{
    String s1=args[0],s2=args[1],s3=args[2];
   ls.printAreas(s1,s2,s3);}
   }
   // the constructor calls in the readFile method     
   public LSArrayApp() {
   readFile();
   }
        
   
   public void printAreas(String stage, String day, String startTime)
   {
      String key = stage+"_"+day+"_"+startTime;
      int OperCount=0;
    // OperCount to count the number of comparisons 
   
 /* initially we have nt found the element we looking for and we want to iterate over the array to 
 look for the element, this also counts how many comparisons are done before getting to the searched arguments*/
      
      boolean elementFound = false;
      for (int j = 0; j<file.length; j++){
         OperCount++;
         if (file[j].contains(key)){
            
        System.out.println(file[j]);
         elementFound = true;
         break;
         }
         
         }
         if (!elementFound){
            System.out.println("Areas not found");
         }
           System.out.println(OperCount);

         
      }
      
   
   // this method iterates through the file and print the data inside. 
   public void printAllAreas()
      {
      for (int i =0; i<file.length; i++){
         System.out.println(file[i]);
      }
   }

// this method read in the file and stores the elements in the array.
   public void readFile()
      {
      try 
            {
            File readIn = new File("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
            Scanner scnr= new Scanner(readIn);
            
               for(int i=0; i<2976; i++)
                  {
                  file[i] = scnr.nextLine();
                  }                 
               
               scnr.close(); 
           }
          catch(FileNotFoundException e)
            {
            System.out.println("File not found");
            }
      
      }

}
