package patterndecorator;

public abstract  class Decorator extends LibraryItem{
	
	protected LibraryItem libraryItem;
	
	public Decorator(LibraryItem libraryItem) {
		this.libraryItem = libraryItem;
	}

	public LibraryItem getLibraryItem() {
		return libraryItem;
	}

 
	
	public void setLibraryItem(LibraryItem libraryItem) {
		this.libraryItem = libraryItem;
	}

	public void display() {
	  libraryItem.display();	
	}
	

}
