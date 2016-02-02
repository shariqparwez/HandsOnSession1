package com.training.handson;

public class Books extends Media {
	private long ISBN;

	public Books(String title, String author, String subject, long volumeNumber, int rating, int lendingLength, long ISBN) {
		super(title, author, subject, volumeNumber, rating, lendingLength);
		this.ISBN = ISBN;
		// TODO Auto-generated constructor stub
	}
	
	public long getISBN() {
		return ISBN;
	}

	public void printMedia()
	{
			//System.out.println(this.getTitle() + this.getAuthor() + this.getSubject() + this.getVolumeNumber() + this.getRating() + this.getLendingLength() + this.getISBN());
			System.out.println("Title - " + this.getTitle() );
			System.out.println("Author - " + this.getAuthor());
			System.out.println("Subject - " + this.getSubject());
			System.out.println("Volume Number - " + this.getVolumeNumber() );
			System.out.println("Ratig - " + this.getRating() );
			System.out.println("Volume Number - " + this.getLendingLength() );
			System.out.println("Lending Length - " + this.getLendingLength() );
			System.out.println("ISBN - " + this.getISBN() );
			System.out.println("");
			
			
	}

}
