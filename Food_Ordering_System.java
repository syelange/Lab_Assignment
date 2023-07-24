package Practice;

//WAP to Create a Food Ordering System

import java.util.*;

public class Food_Ordering_System {
	static int choice,choice1,choice2,choice3,choice4;
	static char y,n,ans;
	static double total;
	static String menu_item="";
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("!!Welcome To Our Restaurant!!\n");
		
		Food_Ordering_System obj= new Food_Ordering_System();
		
		do{
			
		System.out.print("\n  Menu:");
		System.out.print("\n1:Starters\r\n"+ "2:Main Course\r\n"+ "3:Deserts\r\n"+ "4:Drinks \n");
		System.out.print("Please Select Your Option: ");
		choice=sc.nextInt();
		
			switch(choice) 
			{
			
			case 1:
				do
				{
				obj.Starters();
				System.out.println("\nDo you want to add another starter y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
				
				break;
				
			case 2:
				do
				{
				obj.MainCourse();
				System.out.println("\nDo you want to add another Main Course y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
				break;
		
			case 3:
				do
				{
				obj.Deserts();
				System.out.println("\nDo you want to add another Desert y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
				break;	
				
	        case 4:
	        	do
				{
	        	obj.Drinks();
	        	System.out.println("\nDo you want to add another Drink y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
	        	break;
	        	
			}
			
			System.out.print("\nDo want to go to Main Menu? y/n: ");
			choice=sc.next().charAt(0);
			
			
		}while(choice=='y');
		System.out.println("\nThank You for Ordering !!!");
		
		obj.Bill();//To Display The Bill
	}
	
	
	//1.Starter's Menu
	public void Starters() 
	{
		System.out.print("\n  Starters:          Price");
		System.out.print("\n1.Veg Crispy         Rs 180");
		System.out.print("\n2.Veg Kebab          Rs 180");
		System.out.print("\n3.Chicken 65         Rs 280");
		System.out.print("\n4.Chicken Crispy     Rs 280");
		System.out.print("\nSelect Your Option: ");
		choice1=sc.nextInt();
		switch(choice1)//1.Starter's Menu
		{
		
			case 1:
				System.out.print("\nVeg Crispy         Rs 180");
				menu_item+="\nVeg Crispy         Rs 180";
				total += 180;
				break;
			case 2:
				System.out.print("\nVeg Kebab          Rs 180");
				menu_item+="\nVeg Kebab         Rs 180";
				total += 180;
				break;
			case 3:
				System.out.print("\nChicken 65         Rs 280");
				menu_item+="\nChicken 65         Rs 280";
				total += 280;
				break;	
			case 4:
				System.out.print("\nChicken Crispy     Rs 280");
				menu_item+="\nChicken Crispy         Rs 280";
				total += 280;
				break;	
				
		}
		
	}
	
	//2.MainCourse Menu
	public void MainCourse() 
	{
		System.out.print("\n  Main Course          Price");
		System.out.print("\n1.Veg Kholapuri        Rs 220");
		System.out.print("\n2.Veg Mix              Rs 260");
		System.out.print("\n3.Chicken Handi        Rs 320");
		System.out.print("\n4.Chicken Bhuna        Rs 340");
		System.out.print("\nSelect Your Option: ");
		choice2=sc.nextInt();
		switch(choice2)//2.MainCourse Menu
		{
		
			case 1:
				System.out.print("\nVeg Kholapuri        Rs 220");
				menu_item+="\nVeg Kholapuri        Rs 220";
				total += 220;
				break;
			case 2:
				System.out.print("\nVeg Mix              Rs 260");
				menu_item+="\nVeg Mix              Rs 260";
				total += 260;
				break;
			case 3:
				System.out.print("\nChicken Handi        Rs 320");
				menu_item+="\nChicken Handi        Rs 320";
				total += 320;
				break;	
			case 4:
				System.out.print("\nChicken Bhuna        Rs 340");
				menu_item+="\nChicken Bhuna        Rs 340";
				total += 340;
				break;	
				
		}
	
	}
	
	
	//3.Deserts Menu
	public void Deserts() 
	{
		System.out.print("\n  Deserts:                                   Price");
		System.out.print("\n1.Khulfi (Pista,Malai,Mango,Mix)             Rs 180");
		System.out.print("\n2.Falooda (Royal,Pista,Badam,Gulkand)        Rs 180");
		System.out.print("\n3.Ice-Cream (Chocolate,Vanilla,)             Rs 180");
		System.out.print("\n4.Cake (Chocolate,Fruits,Butterscoth)        Rs 180");
		System.out.print("\nSelect Your Option: ");
		choice3=sc.nextInt();
		switch(choice3)//3.Deserts Menu
		{
		
			case 1:
				System.out.print("\nKhulfi (Pista,Malai,Mango,Mix)         Rs 180");
				menu_item+="\nKhulfi (Pista,Malai,Mango,Mix)         Rs 180";
				total += 180;
				break;
			case 2:
				System.out.print("\nFalooda (Royal,Pista,Badam,Gulkand)    Rs 180");
				menu_item+="\nFalooda (Royal,Pista,Badam,Gulkand)    Rs 180";
				total += 180;
				break;
			case 3:
				System.out.print("\nIce-Cream (Chocolate,Vanilla,)         Rs 180");
				menu_item+="\nIce-Cream (Chocolate,Vanilla,)         Rs 180";
				total += 180;
				break;	
			case 4:
				System.out.print("\nCake (Chocolate,Fruits,Butterscoth)    Rs 180");
				menu_item+="\nCake     Rs 180";
				total += 180;
				break;	
				
		}
		
	}
	
	//4.Drinks Menu
	public void Drinks() 
	{
		System.out.print("\n  Drinks:                                               Price");
		System.out.print("\n1.Cold Drink (Pepsi,Coco-Cola,Sprit,Thumbs-Up)          Rs 120");
		System.out.print("\n2.Solkadi                                               Rs 160");
		System.out.print("\n3.Ice-Cream (Chocolate,Vanilla)                         Rs 200");
		System.out.print("\n4.Smoothie (Chocolate,Fruits,Butterscoth,Stawberry)     Rs 280");
		System.out.print("\nSelect Your Option: ");
		choice4=sc.nextInt();
		switch(choice4)	//4.Drinks Menu
		{
		
			case 1:
				System.out.print("\nCold Drink (Pepsi,Coco-Cola,Sprit,Thumbs-Up)      Rs 120");
				menu_item+="\nCold Drink       Rs 120";
				total += 120;
				break;
			case 2:
				System.out.print("\nSolkadi                Rs 160");
				menu_item+="\nSolkadi                Rs 160";
				total += 160;
				break;
			case 3:
				System.out.print("\nIce-Cream (Chocolate,Vanilla)       Rs 200");
				menu_item+="\nIce-Cream       Rs 200";
				total += 200;
				break;	
			case 4:
				System.out.print("\nSmoothie (Chocolate,Fruits,Butterscoth,Stawberry)     Rs 280");
				menu_item+="\nSmoothie      Rs 280";
				total += 280;
				break;	
				
		}
	}
	
	//5.Generation of Bill
	public void Bill() 
	{
		System.out.println("\n*Your Bill*"); 
		System.out.println("\nItem You Ordered : "+menu_item);
		System.out.println("\n\nTotal Amount: Rs "+ total);//total Bill is Displayed
		System.out.println("\nThank You Visit us Again!!!!");
	}

}
