/*
 * Pritpal Singh Grewal
 * 300961555
 * Name of program is Singers
 * Date: 2022-09-28
 * Description: The Singers program contain instance variables, constructors, getters
 * setters and Display function. This is a blueprint of class object Singers. It is instantiated in 
 * Driver program for test to see if it works correctly or not.
 * 
 */



package PritpalGrewal_Lab_1;

public class Singers 
{
	//5 instance variables storing singer data
	private int id;
	private String name;
	private String address;
	private String dateOfBirth;
	private int numOfAlbum;
	
	//constructor with no arguments
	public Singers()
	{
		
	}
	
	//constructor with 5 arguments
	public Singers(int id, String name,String address,String dateOfBirth,int numOfAlbum)
	{
		this.id = id;
		this.name=name;
		this.address=address;
		this.dateOfBirth=dateOfBirth;
		this.numOfAlbum=numOfAlbum;
	}
	
	//setters of all instance variables of singer
	public void setId(int id) 	
	{
		this.id=id;
	} 
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public void setAddress(String address) 
	{
		this.address=address;
	}
	
	public void setDob(String dateOfBirth) 
	{
		this.dateOfBirth=dateOfBirth;
	}
	
	public void setNumOfAlbum(int numOfAlbum) 
	{
		this.numOfAlbum=numOfAlbum;
	}
	
	//setter setting all the values of instance variables
	public void setAll(int id, String name,String address,String dateOfBirth,int numOfAlbum)
	{
		this.id = id;
		this.name=name;
		this.address=address;
		this.dateOfBirth=dateOfBirth;
		this.numOfAlbum=numOfAlbum;
	}
	
	//getters for all the instance variables of class Singer
	public int getId() 
	{
		return id;
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	
	public String getAddress() 
	{
		return address;
	}
	
	
	public String getDob()	
	{
		return dateOfBirth;
	}
	
	
	public int getNumOfAlbum() 
	{
		return numOfAlbum;
	}
	
	//Display function 
	public void Display(Singers singer)
	{
		System.out.printf("Singer Id:%d %nSinger Name: %s%nSinger address: %s%nSinger Date of Birth:%s %nNumber of Album:%d%n",singer.getId(),singer.getName(),singer.getAddress(),singer.getDob(),singer.getNumOfAlbum());
	}
	
	
	
}
