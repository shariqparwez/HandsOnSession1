package com.training.handson;

public class Periodicals extends Media {
	private String period;

	public Periodicals(String title, String author, String subject, long volumeNumber, int rating, int lendingLength, String period) {
		super(title, author, subject, volumeNumber, rating, lendingLength);
		// TODO Auto-generated constructor stub
		this.period = period;
	}

	public String getPeriod() {
		return period;
	}
	
	public void printMedia()
	{
			//System.out.println(this.getTitle() + this.getAuthor() + this.getSubject() + this.getVolumeNumber() + this.getRating() + this.getLendingLength() + this.getPeriod());
		System.out.println("Title - " + this.getTitle() );
		System.out.println("Author - " + this.getAuthor());
		System.out.println("Subject - " + this.getSubject());
		System.out.println("Volume Number - " + this.getVolumeNumber() );
		System.out.println("Ratig - " + this.getRating() );
		System.out.println("Volume Number - " + this.getLendingLength() );
		System.out.println("Lending Length - " + this.getLendingLength() );
		System.out.println("Period - " + this.getPeriod());
		System.out.println("");
	}

}
