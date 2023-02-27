package patterndecorator;

public class Video extends LibraryItem{
        private String director;
        private String title;
        private Integer playTime;
       
        public Video(String director, String title, Integer numCopies, Integer playTime)
        {
            this.director = director;
            this.title = title;
            setNumberCopies(numCopies);
            this.playTime = playTime;
        }
        public void display()
        {
        	System.out.println("\nVideo ----- ");
        	System.out.println(" Director:  " + director);
        	System.out.println(" Title: " + title);
        	System.out.println(" # Copies: " + getNumberCopies());
        	System.out.println(" Playtime: \n" + playTime);
        }
    }
 
