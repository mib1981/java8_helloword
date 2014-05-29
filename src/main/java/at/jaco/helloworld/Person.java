/*
 $Author: $
 $Date: $
 $Revision: $
 */
package at.jaco.helloworld;

import java.time.LocalDate;

/**
 * <b>TODO class<b> component class.
 *
 * @author mib
 * @version $Revision: $ $Date: $
 * @since 2.0
 */
public class Person {
	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public Person(String name) {
		this.name = name;
	}

	public void printPerson() {
		// ... test
	}

	public enum Sex {
		MALE, FEMALE
	}


	/* Getters & Setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
