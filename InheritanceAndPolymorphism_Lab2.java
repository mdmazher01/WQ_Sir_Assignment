package com.mazher;

public class InheritanceAndPolymorphism_Lab2 {

	public static void main(String[] args) {
		CD cd=new CD(1,"Fearless",1000000,2000000000,"Taylor Swift","Rock");
		System.out.println(cd.getTitle());
		System.out.println(cd.getArtist());
		System.out.println(cd.getCopies());
		System.out.println(cd.getGenre());
		System.out.println(cd.getRunTime());
			
	}

}

abstract class Item{
	private int idNumber;
	private String title;
	private int numberOfCopies;
	
	public Item(int identificationNumber,String title,int numberOfCopies){
		super();
		this.idNumber=idNumber;
		this.title=title;
		this.numberOfCopies=numberOfCopies;
		}
	public int setidNum(int id){
		idNumber = id;
		return id;
		}
	public String setTitle(String str){
		title = str;
		return str;
		}
	public int setNumCopies(int n){
		numberOfCopies = n;
		return n;
		}
	public int getidNum(){
		return idNumber;
		}
	public String getTitle(){
		return title;
		}
	public int getCopies(){
		return numberOfCopies;
		}
	public void checkIn(){
		numberOfCopies = numberOfCopies + 1;
		}
	public void checkOut(){
		numberOfCopies = numberOfCopies - 1;
		}
	public void addItem(int idNumber, String str, int n){
		setidNum(idNumber);
		setTitle(str);
		setNumCopies(n);
		}
	public String toString(){
		return "ID: " +idNumber+ " Title: " +title+ " Number of Copies: " +numberOfCopies;
		}
	public void print(){
		System.out.println("Title: " +title);
		System.out.println("ID: " +idNumber);
		System.out.println("Number of copies: " +numberOfCopies);
		}
	public boolean equals(Object obj){
		if(obj == null)
		return false;
		Item otherItem = (Item) obj;
		return idNumber == otherItem.idNumber && title == otherItem.title && numberOfCopies
		== otherItem.numberOfCopies;
		}
	public void addItem(){
		numberOfCopies++;
		}
}

/////////////////////////////////////////////////////////////////////////////////////////////

abstract class WrittenItem extends Item{
	private String author;

	public String getAuthor() {
		return author;
		}

	public void setAuthor(String author) {
		this.author = author;
		}

	public WrittenItem(int identificationNumber, String title, int numberOfCopies,String author) {
		super(identificationNumber, title, numberOfCopies);
		this.author=author;
		}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////

class Book extends WrittenItem{

	public Book(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies, author);
		
		}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////

class JournalPaper extends WrittenItem{
	private int yearPublished;
	

	public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author,int yearPublished) {
		super(identificationNumber, title, numberOfCopies, author);
		this.yearPublished=yearPublished;
		}


	public int getYearPublished() {
		return yearPublished;
		}


	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
		}
}

////////////////////////////////////////////////////////////////////////////////////////////////

abstract class MediaItem extends Item{
	private int runTime;
	public MediaItem(int identificationNumber, String title, int numberOfCopies,int runTime) {
		super(identificationNumber, title, numberOfCopies);
		this.runTime=runTime;
		
		}
	public int getRunTime() {
		return runTime;
		}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
		}
	
	
}


/////////////////////////////////////////////////////////////////////////////////////////////

class Video extends MediaItem{
	private String director;
	private String genre;
	private int year;

	public Video(int identificationNumber, String title, int numberOfCopies, int runTime,String director,String genre,int year) {
		super(identificationNumber, title, numberOfCopies, runTime);
		this.director=director;
		this.genre=genre;
		this.year=year;
		}

	public String getDirector() {
		return director;
		}

	public void setDirector(String director) {
		this.director = director;
		}

	public String getGenre() {
		return genre;
		}

	public void setGenre(String genre) {
		this.genre = genre;
		}

	public int getYear() {
		return year;
		}

	public void setYear(int year) {
		this.year = year;
		}
	
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

class CD extends MediaItem{
	private String artist;
	private String genre;

	public CD(int identificationNumber, String title, int numberOfCopies, int runTime, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies, runTime);
		this.artist=artist;
		this.genre=genre;
		}

	public String getArtist() {
		return artist;
		}

	public void setArtist(String artist) {
		this.artist = artist;
		}

	public String getGenre() {
		return genre;
		}

	public void setGenre(String genre) {
		this.genre = genre;
		}
	
	
}
