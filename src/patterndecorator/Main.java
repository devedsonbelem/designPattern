package patterndecorator;

public class Main {
	public static void main(String[] args) {
		 Book book = new Book("Stamcey", "Programando codigo Limpo", 5);
		 book.display();
        
         Video video = new Video("Spielberg", "Jaws", 23, 92);
         video.display();
    
      
         System.out.println("\nMaking video sales:");
         Sales saleVideo = new Sales(video);
         saleVideo.adicionaItem("Customer #1");
         saleVideo.adicionaItem("Customer #2");
         saleVideo.display();
		
		
	}
}
