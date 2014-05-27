package at.jaco.helloworld;
/*
 $Author: $
 $Date: $
 $Revision: $
 */

/**
 * <b>TODO class<b> component class.
 *
 * @author mib
 * @version $Revision: $ $Date: $
 * @since 2.0
 */
public class Simple {
	public static void main(String[] args) {

		System.out.println("=== RunnableTest ===");
		// Anonymous Runnable

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello world two!");

		// Run em!
		r1.run();
		r2.run();

	}
}
