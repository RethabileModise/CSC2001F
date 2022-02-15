import java.util.*;
import java.io.*;

public class LSBSTApp{
	//instance variables
	private BinarySearchTree<LS> BinarySearchTree;	
	
	//The constructor creates the BinarySearchTree object 
	public LSBSTApp(){
		BinarySearchTree = new BinarySearchTree<LS>();
		}

	//thie method adds to the tree every element in the LS file 
	public void addToTree(LS element){
		BinarySearchTree.insert(element);
		}
  // this method prints out the Areas that are found when the correct stage,day and time are given.
	public void printAreas(String stage, String day, String startTime){
		System.out.println(Arrays.toString((BinarySearchTree.find(new LS(stage,day,startTime)).getData()).getZones()));// check for not found
		}
	// this method prints out all the areas that are found when noarguments are given.
	public void printAllAreas(){
		BinarySearchTree.preOrder();
		}
		
	

	//The main method reads in a file  and add everyline to the tree
	public static void main(String[] args){
		LSBSTApp ls = new LSBSTApp();
		try{
			Scanner readIn = new Scanner(new File("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"));
		
			while(readIn.hasNextLine()){
				ls.addToTree(new LS(readIn.nextLine()));
				}
			}

		catch (Exception e){
			System.out.println("File not found");
			}
         
        if(args.length==0)
         { 
         ls.printAllAreas();
         }
         else{
          String s1=args[0],s2=args[1],s3=args[2];
         ls.printAreas(s1,s2,s3);}

		

		}

	}