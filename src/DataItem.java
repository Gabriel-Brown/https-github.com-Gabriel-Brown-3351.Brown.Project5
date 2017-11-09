/******************************************************
‘***  Project 5 - 234Tree Word Counter
‘***  Gabriel Brown
‘******************************************************
‘*** To Demonstrate a 234Tree Data Structure
‘***
‘******************************************************
‘*** 11/07/2017
‘******************************************************
‘*****************************************************/

/**
 *
 * @author Gabe
 */
public class DataItem {
    	public String dData; //one data item
	public int count;
        
	public DataItem(String dd)
	{ 
            dData = dd;
            count = 1;
        }
	
	public String displayItem()
	{ 
            return dData + ".x" + count + ", ";
        }
}
