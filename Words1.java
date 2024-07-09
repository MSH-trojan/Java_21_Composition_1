package words_1;
public class Words1 {
	 
	   public static void main(String[] args) {
	      Dictionary webster = new Dictionary();
	      System.out.println("Number of pages: " + webster.getPages());
	      System.out.println("Number of definitions: " +  webster.getDefinitions());
	      System.out.println("Definitions per page: " +   webster.computeRatio());
	   }
	}

	class Book {                                                    
	   private int pages = 1900;
	   public void setPages(int numPages) {
	      pages = numPages;
	   }
	   public int getPages() {
	      return pages;
	   }
	}

	class Dictionary {
	   private Book bk; 
	   private int definitions = 52500;
	   public Dictionary(){
	     bk = new Book();
	   }
	   public double computeRatio() {
	      return (double) definitions/bk.getPages();
	   } 
	   public void setDefinitions(int numDefinitions)   {
	      definitions = numDefinitions;
	   } 
	   public int getDefinitions()   { return definitions;  }
	   public int getPages()   { return bk.getPages();  }
	} 
