package com.training.handson;

public class DVD extends Media {
	private double runningTime;

	public DVD(String title, String author, String subject, long volumeNumber, int rating, int lendingLength, double runningTime) {
		super(title, author, subject, volumeNumber, rating, lendingLength);
		// TODO Auto-generated constructor stub
		this.runningTime = runningTime;
	}

	public double getRunningTime() {
		return runningTime;
	}
	
	public void printMedia()
	{
			//System.out.println(this.getTitle() + this.getAuthor() + this.getSubject() + this.getVolumeNumber() + this.getRating() + this.getLendingLength() + this.getRunningTime());
		System.out.println("Title - " + this.getTitle() );
		System.out.println("Author - " + this.getAuthor());
		System.out.println("Subject - " + this.getSubject());
		System.out.println("Volume Number - " + this.getVolumeNumber() );
		System.out.println("Ratig - " + this.getRating() );
		System.out.println("Volume Number - " + this.getLendingLength() );
		System.out.println("Lending Length - " + this.getLendingLength() );
		System.out.println("Running Time - " + this.getRunningTime());
		System.out.println("");
	}

}
