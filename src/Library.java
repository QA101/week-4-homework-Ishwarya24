
import java.util.Comparator;
import java.util.LinkedList;

public class Library {

	static LinkedList<Book> Books = new LinkedList<Book>();
	
	public static void main(String[] args) {
		Library lib = new Library();
		lib.SortLibrary();
		System.out.println(lib);
		for(Book b : Books) {
			System.out.println(b.Details());
		}
	}
	
	public Library() {
		Books.add(new Book("Dune", 500, "Fiction", "Set on the desert planet Arrakis, Dune is the story of the boy Paul Atreides, "
				+ "who would become the mysterious man known as Muad'Dib. He would avenge the traitorous plot against his noble family—and "
				+ "would bring to fruition humankind’s most ancient and unattainable dream.\r\n" + 
				"\r\n" + 
				"A stunning blend of adventure and mysticism, environmentalism and politics, Dune won the first Nebula Award, shared the "
				+ "Hugo Award, and formed the basis of what is undoubtedly the grandest epic in science fiction."));
		
		Books.add(new Book("The Wretched of Muirwood (Legends of Muirwood Book 1)", 300, "Fantasy", "In the ancient and mystical land of Muirwood, "
				+ "Lia has known only a life of servitude. Labeled a “wretched,” an outcast unwanted and unworthy of respect, Lia is forbidden to "
				+ "realize her dream to read or write. All but doomed, her days are spent toiling away as a kitchen slave under the charge of the "
				+ "Aldermaston, the Abbey’s watchful overseer. But when an injured squire named Colvin is abandoned at the kitchen’s doorstep, "
				+ "an opportunity arises. The nefarious Sheriff Almaguer soon starts a manhunt for Colvin, and Lia conspires to hide Colvin and "
				+ "change her fate. In the midst of a land torn by a treacherous war between a ruthless king and a rebel army, Lia finds herself "
				+ "on an ominous journey that will push her to wonder if her own hidden magic is enough to set things right. At once captivating, "
				+ "mysterious, and magic-infused, The Wretched of Muirwood takes the classic fantasy adventure and paints it with a story "
				+ "instantly epic, and yet, all its own."));
		
		Books.add(new Book("The Blight of Muirwood (Legends of Muirwood Book 2)", 466, "Fantasy", "In The Blight of Muirwood, "
				+ "the second book in the Muirwood Trilogy, Lia finds herself filled with inner turmoil after the great battle of "
				+ "Winterrowd that led to the death of the wicked king and her closest ally. Despite her reservations, Lia is called to "
				+ "be an official protector of Muirwood Abbey and is charged to employ her magic to defend Ellowyn Demont, the lost heir of "
				+ "the fallen kingdom of Pry-Ree. Her duties are put to the test when the Queen Dowager arrives in Muirwood accusing the Aldermaston, "
				+ "the abbey’s overseer, for the king’s death. Amidst the turmoil, battle ensues, and Lia learns of a terrible plague that threatens to"
				+ " cover the land in darkness and death. Atop it all, the magic of the world begins to fail. In a quest to undo the devastation, Lia’s "
				+ "path brings her to a startling revelation that will change her life forever."));
		
		Books.add(new Book("Dune Messiah", 340, "Science Fiction", "Dune Messiah continues the story of Paul Atreides, "
				+ "better known—and feared—as the man christened Muad’Dib. As Emperor of the Known Universe, he possesses "
				+ "more power than a single man was ever meant to wield. Worshipped as a religious icon by the fanatical Fremens, "
				+ "Paul faces the enmity of the political houses he displaced when he assumed the throne—and a conspiracy conducted "
				+ "within his own sphere of influence.\r\n" + 
				" \r\n" + 
				"And even as House Atreides begins to crumble around him from the machinations of his enemies, the true threat to "
				+ "Paul comes to his lover, Chani, and the unborn heir to his family’s dynasty..."));
		
		Books.add(new Book("Children of Dune", 420, "Science Fiction",  "Nine years ago Emperor Paul Muad'Dib disappeared into the "
				+ "desert wastelands of Arrakis. Now, his twin children—Leto and Ghanima Atreides—are being groomed to become Messiahs. "
				+ "Like their father, the twins possess supernormal abilities, making them valuable to their manipulative aunt Alia, "
				+ "who rules the Empire in the name of House Atreides. \r\n" + 
				" \r\n" + 
				"Facing treason and rebellion on two fronts, Alia’s rule is not absolute. The displaced House Corrino is plotting to "
				+ "regain the throne while the fanatical Fremens are being provoked into open revolt by the enigmatic figure known only"
				+ " as The Preacher. By obtaining the secrets of the twins’ prophetic visions, Alia believes she can maintain control over"
				+ " her dynasty. \r\n" + 
				" \r\n" + 
				"But Leto and Ghanima have their own plans for their visions—and their destiny..."));
	}
	
	/*
	 * Sorting based on title
	 * Creating a new comparator for using the title of the book for comparison
	 */
	public static void SortLibrary() {
		Books.sort(new Comparator<Book>(){
			@Override
			public int compare(Book b1, Book b2) {
				return (b1.title).compareTo(b2.title);
			}
		});
	}
	
	public String toString() {
		String returnString = "";
		for( Book b : Books) {
			returnString += b + "\n";
		}
		return returnString;
	}
}
