package behavioural.mementopattern;

 class Book {
	   private String title;
	   private String author;

	   public Book(String title, String author) {
	      super();
	      this.title =  title;
	      this.author = author;
	   }
	   public String getTitle() {
	      return title;
	   }
	   public void setTitle(String title) {
	      this.title = title;
	   }
	   public String getAuthor() {
	      return author;
	   }
	   public void setAuthor(String author) {
	      this.author = author;
	   }

	   public BookMemento createUndo(){
	      return new BookMemento(title, author);
	   }

	   public void undo(BookMemento bm){
	      title=bm.getTitle();
	      author=bm.getAuthor();
	   }
	   @Override
	   public String toString() {
	      return "Book [title=" + title + ", author=" + author + "]";
	   }
	}

	 class BookMemento {
	   private String title;
	   private String author;

	   public BookMemento(String title, String author) {
	      super();
	      this.title = title;
	      this.author = author;
	   }
	   public String getTitle() {
	      return title;
	   }
	   public void setTitle(String title) {
	      this.title = title;
	   }
	   public String getAuthor() {
	      return author;
	   }
	   public void setAuthor(String author) {
	      this.author = author;
	   }
	}

	 class BookCaretaker {
	   private Stack<BookMemento> mementos=new Stack<>();
	   public BookMemento getMemento(){
	      return mementos.pop();
	   }
	   public void setMemento(BookMemento bm){
	      mementos.push(bm);
	   }
	}

	public class Test {

	   public static void main(String[] args) {
	      Book b=new Book("Art of Programming Vol-I", "Donald Knuth");

	      BookCaretaker bc=new BookCaretaker();
	      bc.setMemento(b.createUndo());

	      System.out.println(b.toString());

	      b.setTitle("Art of Pogramming Vol II");
	      bc.setMemento(b.createUndo());

	      System.out.println(b.toString());

	      b.setAuthor("AAA");
	      System.out.println(b.toString());

	      b.undo(bc.getMemento());
	      System.out.println(b.toString());

	      b.undo(bc.getMemento());
	      System.out.println(b.toString());

	   }

	}
	