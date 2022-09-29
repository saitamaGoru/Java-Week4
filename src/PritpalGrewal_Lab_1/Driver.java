/*
 * Pritpal Singh Grewal
 * 300961555
 * Name of program is Driver
 * Date: 2022-09-28
 * Description: The Driver program runs the Singers program and tests if it
 * works correctly or not. 
 */


package PritpalGrewal_Lab_1;

public class Driver {

	public static void main(String[] args)
	{
		//Instantiating Singers
		Singers singer1 = new Singers();
		
		//setting instance variables by using setters
		singer1.setId(001);
		singer1.setName("Harr Styles");
		singer1.setAddress("8 Clappison blvd,Toronto,On");
		singer1.setDob("1991-01-01");
		singer1.setNumOfAlbum(3);
		
		
		//Calling display function
		singer1.Display(singer1);
	}

}
