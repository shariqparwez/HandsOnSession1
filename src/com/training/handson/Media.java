package com.training.handson;

public class Media {
	private String title;
	private String author;
	private String subject;
	private long volumeNumber;
	private int rating;
	private int lendingLength;
	
	public Media(String title, String author, String subject, long volumeNumber, int rating, int lendingLength) {
		super();
		this.title = title;
		this.author = author;
		this.subject = subject;
		this.volumeNumber = volumeNumber;
		this.rating = rating;
		this.lendingLength = lendingLength;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getSubject() {
		return subject;
	}

	public long getVolumeNumber() {
		return volumeNumber;
	}

	public int getRating() {
		return rating;
	}

	public int getLendingLength() {
		return lendingLength;
	}
	
	public void printMedia(){}
	
	/*public void sample(Media[] med,ch){
		med[0].printMedia();
	}*/
	
	
	
}
