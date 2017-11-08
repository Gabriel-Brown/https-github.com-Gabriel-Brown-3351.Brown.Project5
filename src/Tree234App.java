
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabe
 */
public class Tree234App {

	public static void main(String[] args) throws IOException
	{
		String value;
		Tree234 theTree = new Tree234();

                
                theTree.insert("A");
                theTree.insert("B");
		theTree.insert("C");
		theTree.insert("D");
		theTree.insert("D");
		theTree.insert("E");
                theTree.insert("F");
		theTree.insert("G");
		theTree.insert("H");
		theTree.insert("I");
		theTree.insert("J");
		theTree.insert("K");
                theTree.insert("L");
                theTree.insert("M");
                theTree.insert("N");
		
		
			//System.out.print("Enter first letter of ");
			//System.out.print("show, insert, minimum, traverse, order, or find: ");
			//char choice = getChar();


				theTree.displayTree();
				

			
		
	}//end main()
	
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static char getChar() throws IOException
	{
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}
}
