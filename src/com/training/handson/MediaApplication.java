package com.training.handson;

import java.util.*;

public class MediaApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int ch = 0;
		//Books[] book = new Books[2];
		Media[] book = new Books[2];
		//DVD[] dvd = new DVD[2];
		Media[] dvd = new DVD[2];
		//Periodicals[] periodical = new Periodicals[2];
		Media[] periodical = new Periodicals[2];
		book[0] = new Books("C Programming ","Y Kanetkar ", "ComputerScience ", 1,5,14,2345678);
		book[1] = new Books("Psychology","A Warren", "Science", 3,5,14,2345876);
		dvd[0] = new DVD("Motivational Speech", "Bill Gates", "Inspirational", 4, 7, 10, 60.00);
		dvd[1] = new DVD("Creativity", "Steve Jobs", "Inspirational", 4, 7, 20, 120.00);
		periodical[0] = new Periodicals("DigitMagazine", "IndiaTimes", "InformationTechnology",50,5,14,"Monthly");
		periodical[1] = new Periodicals("PCMagazine", "FastTrackPublications", "InformationTechnology",100,3,14,"Weekly");
		while(flag)
		{
		System.out.println("SELECT MEDIA TYPE - ");
		System.out.println("1.Books");
		System.out.println("2.DVD");
		System.out.println("3.Periodicals");
		System.out.println("4.Exit");
		System.out.println("ENTER YOUR CHOICE - ");
		ch = sc.nextInt();


			
		switch(ch){
		case 1:
			for(Media bk:book){
				bk.printMedia();
			}
			break;
		case 2:
			for(Media dvds:dvd){
				dvds.printMedia();
			}
			break;
		case 3:
			for(Media prd:periodical){
				prd.printMedia();
			}
			break;
		case 4:
			flag = false;
			break;
		}
		
	}
}
}

	
