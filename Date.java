/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Classes and Privacy Leaks, Date
 * @date 10/28/20
 */

/**
 * 
 * @version 1.0 This Date class is a class to store and keep track of dates
 *          using month, day, and year
 *
 */
public class Date {
	// this instance variable has the month value
	private int month;
	// this instance variable has the day value
	private int day;
	// this instance variable has the year value
	private int year;

	/**
	 * This Date constructor takes in formal parameter m, d, and y that has
	 * arguments for month, day, and year. The instance variable month is
	 * initialized to the argument given in the formal parameter m if it is greater
	 * than 0 and less than or equal to 12. Else it throws IllegalArgumentException.
	 * The instance variable day is initialized to the argument given in the formal
	 * parameter d if it is greater than 0 and less than or equal to 31. Else it
	 * throws IllegalArgumentException. The instance variable year is initialized to
	 * the argument given in the formal parameter y if it is greater than or equal
	 * to 2016 and less than or equal to 2026. Else it throws
	 * IllegalArgumentException.
	 * 
	 * @param m
	 * @param d
	 * @param y
	 */
	public Date(int m, int d, int y) {
		if (m > 0 && m <= 12) {
			month = m;
		} else {
			throw new IllegalArgumentException();
		}
		if (d > 0 && d <= 31) {
			day = d;
		} else {
			throw new IllegalArgumentException();
		}
		if (y >= 2016 && y <= 2026) {
			year = y;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * This is a copy constructor that takes in a Date copy formal parameter object
	 * and initializes the month, day, and year in the constructor by calling the
	 * Date(int m, int d, int y) constructor.
	 * 
	 * @param copy
	 */
	public Date(Date copy) {
		this(copy.month, copy.day, copy.year);
	}

	/**
	 * This accessor method accesses the instance variable month and returns it
	 * 
	 * @return month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * This mutator method checks to see if the formal parameter int month argument
	 * is less than 1 or greater than 12. If it is, it throws
	 * IllegalArgumentException. Else, the instance variable month is set equal to
	 * the argument month
	 * 
	 * @param month
	 */
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException();
		}
		this.month = month;
	}

	/**
	 * This accessor method accesses the instance variable day and returns it
	 * 
	 * @return day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * This mutator method checks to see if the formal parameter int day argument is
	 * less than 1 or greater than 31. If it is, it throws IllegalArgumentException.
	 * Else, the instance variable day is set equal to the argument day
	 * 
	 * @param day
	 */
	public void setDay(int day) {
		if (day < 1 || day > 31) {
			throw new IllegalArgumentException();
		}
		this.day = day;
	}

	/**
	 * This accessor method accesses the instance variable year and returns it
	 * 
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * This mutator method checks to see if the formal parameter int year argument
	 * is less than 2016 or greater than 2026. If it is, it throws
	 * IllegalArgumentException. Else, the instance variable year is set equal to
	 * the argument year
	 * 
	 * @param year
	 */
	public void setYear(int year) {
		if (year < 2016 || year > 2026) {
			throw new IllegalArgumentException();
		}
		this.year = year;
	}

	/**
	 * This equals method first checks to see if formal parameter Object otherObject
	 * argument is an instance of Date. If it is not than it returns false. If it is
	 * then it typecasts the otherObject argument to be of type Date and sets it
	 * equal to the Date that object. It then checks to see if the Date that object
	 * month, day, and year values are equal to this Date object current month, day,
	 * and year values. If it is, the method returns true else it returns false.
	 * 
	 * @param otherObject
	 */
	public boolean equals(Object otherObject) {
		if (otherObject == null || !(otherObject instanceof Date)) {
			return false;
		} else {
			Date that = (Date) otherObject;
			if ((this.getMonth() == that.getMonth()) && (this.getDay() == that.getDay())
					&& (this.getYear() == that.getYear())) {
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * This method checks to see if the compareTo date is after this date by first
	 * checking to see that the day, month, and year values of compareTo follow the
	 * class invariant and that compareTo is not null and returns false if not. If
	 * it does, first the method checks that this date year is less than the
	 * compareTo date year and returns true if true. Else if that isnt true, it
	 * checks to see if this date month is less than the compareTo date month and
	 * returns true if true. Else if that isnt true, it checks to see if this date
	 * day is less than the compareTo date day and returns true if true. Else, it
	 * returns false.
	 * 
	 * @param compareTo
	 * @return true, false
	 */
	public boolean isAfter(Date compareTo) {
		if (compareTo == null || compareTo.day < 1 || compareTo.day > 31 || compareTo.month < 1 || compareTo.month > 12
				|| compareTo.year < 2016 || compareTo.year > 2026) {
			return false;
		}
		if (year < compareTo.year) {
			return true;
		} else if (year == compareTo.year && month < compareTo.month) {
			return true;
		} else if (year == compareTo.year && month == compareTo.month && day < compareTo.day) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * This method returns a string version of the Date showing a correctly
	 * formatted Date
	 */
	public String toString() {
		return "Date is: " + this.getMonth() + "/" + this.getDay() + "/" + this.getYear();
	}

}
