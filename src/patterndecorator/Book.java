package patterndecorator;

public class Book extends LibraryItem {
	   
	        private String author;
	        private String title;
	   
	        public Book(String author, String title, Integer numCopies){
	            this.author = author;
	            this.title = title;
	            super.setNumberCopies(numCopies);
	        }
	        
	        public  void display(){
	            System.out.println("\nBook ------ ");
	            System.out.println(" Author: "+ author);
	            System.out.println(" Title: "+ title);
	            System.out.println(" # Copies: "+ super.getNumberCopies());
	        }
	    
}
