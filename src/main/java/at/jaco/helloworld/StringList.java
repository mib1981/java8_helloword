package at.jaco.helloworld;
/*
 $Author: $
 $Date: $
 $Revision: $
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * <b>StringList<b> Java 8 Demo
 *
 * @author mib
 * @version $Revision: $ $Date: $
 * @since 2.0
 */
public class StringList {
	public static void main(String[] args) {

		List<String> myList = Arrays.asList("element1", "element2", "element3");
		List<Person> pList = Arrays.asList(new Person("Zahn"), new Person("Ohr"), new Person("Arm"));

		/*
		for (String element : myList) {
			System.out.println (element);
		}

		myList.forEach(new Consumer<String>() {
			public void accept(String element) {
				System.out.println(element);
			}
		});
		*/

		myList.forEach(e -> System.out.println(e));

		long countLongStrings = myList.stream().filter(element -> element.length() > 4).count();
		Collections.sort(pList, (Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));
		pList.forEach(p -> System.out.println(p.getName()));



	}
}
