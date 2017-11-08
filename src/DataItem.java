/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
