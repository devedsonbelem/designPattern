package patterndecorator;

public abstract class LibraryItem {
	private Integer numberCopies;
    

    public Integer getNumberCopies() {
		return numberCopies;
	}


	public void setNumberCopies(Integer numberCopies) {
		this.numberCopies = numberCopies;
	}


	public abstract void display();
}
