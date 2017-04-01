import java.util.ArrayList;
import java.util.Iterator;

public class ReadArrayListUsingIterator {

	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<Student>();
		std.add(new Student(1, "Nidhi", "Accounts"));
		std.add(new Student(2, "Poonam", "Chemistry"));
		System.out.println("Reading all elements from ArrayList using Iterator");
		Iterator<Student> stdItr = std.iterator();
		while (stdItr.hasNext()) {
			System.out.println(stdItr.next().toString());
		}
	}

}
