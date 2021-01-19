/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Classes and Privacy Leaks, BillMoneyDateDriver
 * @date 10/28/20
 */

/**
 * 
 * @version 1.0 BillMoneyDateDriver is a test driver class to test the Bill,
 *          Date, and Money classes
 *
 */
public class BillMoneyDateDriver {
	/**
	 * This main method tests the Money, Bill, and Date classes by creating objects
	 * of each class, testing their method's, and printing them
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Calls and tests the methods in the Money class

		// creates a Money object
		Money money1 = new Money(10);
		// creates a Money object
		Money money2 = new Money(money1);

		// creates a Money object
		Money money3 = new Money(0, 10);
		// creates a Money object
		Money money4 = new Money();
		// calls and tests the setMoney method of the Money class on a Money object
		money1.setMoney(33, 39);

		System.out.println("Test Money class:");
		System.out.println("Tests the Money toString method on object money1: " + money1.toString());
		System.out.println("Tests the Money toString method on object money2: " + money2.toString());
		System.out.println(
				"Tests the Money equals method on object money1 comparing it with money2: " + money1.equals(money2));
		// calls and tests the add method of the Money class on a Money object
		money1.add(10);
		System.out.println("Tests the Money getMoney method on object money1: " + money1.getMoney());
		System.out.println("Tests the Money getCents method on object money1: " + money1.getCents());
		System.out.println("Tests the Money getDollars method on object money1: " + money1.getDollars());
		System.out.println("Tests the Money toString method on object money2: " + money2.toString());
		// calls and tests the add method of the Money class on a Money object
		money1.add(money3);
		System.out.println("Tests the Money toString method on object money1: " + money1.toString());
		// calls and tests the add method of the Money class on a Money object
		money2.add(money4);
		System.out.println("Tests the Money toString method on object money2: " + money2.toString());
		// calls and tests the add method of the Money class on a Money object
		money2.add(10, 05);
		System.out.println("Tests the Money toString method on object money2: " + money2.toString());
		System.out.println("Tests the Money toString method on object money4: " + money4.toString());

		// Calls and tests the methods in the Bill class

		// creates a Money object
		Money amount = new Money(20);
		// creates a Date object
		Date dueDate = new Date(4, 30, 2020);
		// creates a Bill object
		Bill bill1 = new Bill(amount, dueDate, "The phone company");
		// calls and tests the setOriginator method of the Bill class on a Bill object
		bill1.setOriginator("Ishika");
		// calls and tests the setPaid method of the Bill class on a Bill object
		bill1.setPaid(dueDate);

		// creates Bill objects
		Bill bill2 = new Bill(bill1);
		Bill bill4 = new Bill(bill1);

		// calls and tests the setDueDate method of the Bill class on a Bill object
		bill2.setDueDate(new Date(4, 30, 2021));
		// calls and tests the setAmount method of the Bill class on a Bill object
		bill2.setAmount(new Money(22, 99));
		// calls and tests the setMoney method of the Money class on a Money object
		amount.setMoney(31, 99);
		// calls and tests the setDay method of the Date class on a Date object
		dueDate.setDay(30);
		// calls and tests the setPaid method of the Bill class on a Bill object
		bill2.setPaid(dueDate);

		// creates a Bill object
		Bill bill3 = new Bill(amount, dueDate, "The record company");
		System.out.println("\nTest Bill class:");
		System.out.println(
				"Tests the Bill equals method on object bill1 comparing it with bill2: " + bill1.equals(bill2));
		System.out.println("Tests the Bill getAmount method on object bill1: " + bill1.getAmount());
		System.out.println("Tests the Bill getDueDate method on object bill1: " + bill1.getDueDate());
		System.out.println("Tests the Bill getOriginator method on object bill1: " + bill1.getOriginator());
		System.out.println("Tests the Bill isPaid method on object bill1: " + bill1.isPaid());
		System.out.println("Tests the Bill toString method on object bill1: " + bill1.toString());
		System.out.println("Prints bill1: " + bill1);
		System.out.println("Prints bill2: " + bill2);
		System.out.println("Prints bill3: " + bill3);
		System.out.println("Prints bill4: " + bill4);

		// Calls and tests the methods in the Date class

		// creates Date class objects
		Date testDate = new Date(1, 2, 2018);
		Date testDate1 = new Date(1, 2, 2020);
		Date testDate2 = new Date(testDate);

		System.out.println("\nTest Date Class: ");
		System.out.println("Tests the Date isAfter method on object testDate with argument testDate1: "
				+ testDate.isAfter(testDate1));
		System.out.println("Tests the Date equals method on object testDate comparing it with testDate1: "
				+ testDate.equals(testDate1));
		System.out.println("Tests the Date getDay method on object testDate: " + testDate.getDay());
		System.out.println("Tests the Date getMonth method on object testDate: " + testDate.getMonth());
		System.out.println("Tests the Date getYear method on object testDate: " + testDate.getYear());
		System.out.println("Tests the Date toString method on object testDate2: " + testDate2.toString());

		// calls and tests the setDay method of the Date class on a Date object
		testDate.setDay(19);
		// calls and tests the setMonth method of the Date class on a Date object
		testDate.setMonth(7);
		// calls and tests the setYear method of the Date class on a Date object
		testDate.setYear(2022);
		System.out.println("Tests the Date toString method on object testDate: " + testDate.toString());
	}
}
