
/**
 * JUnit tests for Date, Money, and Bill classes
 * @author Ishika Gupta, Lesley Kalmin
 * @class CSS 143 A
 * @assignment Classes and Privacy Leaks, DateMoneyBillJUnit
 * @date 10/28/20
 */

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @version 1.0 DateMoneyBillJUnit class tests asserts on Date, Money, and Bill
 *          classes using JUnit
 *
 */

public class DateMoneyBillJUnit {

	@Test
	public void ConstructMoneyTest() {
		Money money1 = new Money(10);

		assertEquals(10, money1.getDollars());
	}

	@Test
	public void SetMoneyTest() {
		Money money1 = new Money();

		money1.setMoney(30, 50);
		assertEquals(30, money1.getDollars());
		assertEquals(50, money1.getCents());
	}

	@Test
	public void ConstructMoneyCopyTest() {
		Money money1 = new Money();
		money1.setMoney(10, 40);

		Money money2 = new Money(money1);

		assertEquals(10, money1.getDollars());
		assertEquals(40, money2.getCents());
	}

	@Test
	public void PrintMoneyTest() {
		Money money1 = new Money(10);

		money1.setMoney(30, 50);
		assertEquals("$30.50", money1.toString());

	}

	@Test
	public void ConstructDateTest() {
		Date date1 = new Date(5, 30, 2020);

		assertEquals(5, date1.getMonth());
	}

	@Test
	public void ConstructBillTest() {
		Bill bill1 = new Bill(new Money(15), new Date(7, 30, 2020), "Steven");

		assertEquals(new Money(15), bill1.getAmount());
	}

	@Test
	public void SetOriginatorBillTest() {
		Bill bill2 = new Bill(new Money(15), new Date(7, 30, 2020), "Steven");
		bill2.setOriginator("Alex");

		assertEquals("Alex", bill2.getOriginator());

	}

}
