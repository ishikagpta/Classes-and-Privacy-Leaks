/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Classes and Privacy Leaks, Bill
 * @date 10/28/20
 */

/**
 * 
 * @version 1.0 The Bill class stores and keeps track of a Bill and has the
 *          amount due, the date it is due, the date it was paid, and the
 *          originator who owed the bill
 *
 */
public class Bill {
	// this instance variable has the amount due value
	private Money amount;
	// this instance variable has the due date value
	private Date dueDate;
	// this instance variable has the paid date value
	private Date paidDate;
	// this instance variable has the originator of the bill value
	private String originator;

	/**
	 * This Money constructor takes in formal parameter amount, dueDate, originator
	 * that has arguments for instance variables amount, dueDate, originator. The
	 * instance variable amount is initialized to the argument given in formal
	 * parameter amount by creating a copy of the Money object containing the
	 * argument amount. The instance variable dueDate is initialized to the argument
	 * given in formal parameter dueDate by creating a copy of the Date object
	 * containing the argument dueDate. The instance variable paidDate is
	 * initialized to null.
	 * 
	 * @param amount
	 * @param dueDate
	 * @param originator
	 */
	public Bill(Money amount, Date dueDate, String originator) {
		this.amount = new Money(amount);
		this.dueDate = new Date(dueDate);
		this.originator = originator;
		paidDate = null;
	}

	/**
	 * This is a copy constructor that takes in a Bill formal parameter object and
	 * initializes the amount, dueDate, and originator by calling the Bill(Money
	 * amount, Date dueDate, String originator) constructor.
	 * 
	 * @param toCopy
	 */
	public Bill(Bill toCopy) {
		this(new Money(toCopy.amount), new Date(toCopy.dueDate), toCopy.originator);
	}

	/**
	 * This accessor method accesses the instance variable dueDate and returns it
	 * 
	 * @return dueDate
	 */
	public Date getDueDate() {
		return new Date(dueDate);
	}

	/**
	 * This accessor method accesses the instance variable originator and returns it
	 * 
	 * @return originator
	 */
	public String getOriginator() {
		return originator;
	}

	/**
	 * This method checks to see if the bill is paid. If paidDate is equal to null,
	 * the method returns false. Otherwise, it returns true.
	 * 
	 * @return true, false
	 */
	public boolean isPaid() {
		if (paidDate == null) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * This method does not set the bill instance variable paidDate if the datePaid
	 * formal parameter argument is before the dueDate to be the datePaid and
	 * returns false. Else, it sets the bill instance variable paidDate to be the
	 * datePaid and returns true.
	 * 
	 * @param datePaid
	 * @return true, false
	 */
	public boolean setPaid(Date datePaid) {
		if (dueDate.isAfter(datePaid)) {
			return false;
		} else {
			paidDate = new Date(datePaid);
			return true;
		}
	}

	/**
	 * This method sets the dueDate instance variable if the isPaid method is true
	 * to be a copy Date object formal parameter argument nextDate and returns true.
	 * Else, it returns false
	 * 
	 * @param nextDate
	 * @return true, false
	 */
	public boolean setDueDate(Date nextDate) {
		if (!(isPaid() == true)) {
			dueDate = new Date(nextDate);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method sets the instance variable amount if the isPaid method is not
	 * true to be a copy of the Money object formal parameter argument newAmount and
	 * returns true. Else it returns false.
	 * 
	 * @param newAmount
	 * @return true, false
	 */
	public boolean setAmount(Money newAmount) {
		if (!(isPaid() == true)) {
			amount = new Money(newAmount);
			return true;
		} else {
			return false;
		}

	}

	/**
	 * This accessor method accesses the instance variable amount and returns it
	 * 
	 * @return amount
	 */
	public Money getAmount() {
		return new Money(amount);
	}

	/**
	 * This mutator method sets the instance variable originator to the formal
	 * parameter argument newOriginator if it is not null. Else, it throws an
	 * IllegalArgumentException
	 * 
	 * @param newOriginator
	 */
	public void setOriginator(String newOriginator) {
		if (newOriginator != null) {
			originator = newOriginator;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * This method returns a string version of the bill into that gives the amount
	 * that was due, the date it was due, the originator of the bill, whether it was
	 * paid, and what date it was paid
	 */
	public String toString() {
		return "The amount that's due - " + this.getAmount() + " The Due Date -  " + this.getDueDate() + " To - "
				+ this.getOriginator() + " Whether it was paid - " + isPaid() + " Date it was paid - " + this.paidDate;
	}

	/**
	 * This equals method first checks to see if formal parameter Object toCompare
	 * argument is an instance of Bill. If it is not than it returns false. If it is
	 * then it typecasts the toCompare argument to be of type Bill and sets it equal
	 * to the Bill that object. It then checks to see if the Bill that object
	 * amount, dueDate, and paidDate values are equal to this Bill object current
	 * amount, dueDate, and paidDate values. If it is, the method returns true else
	 * it returns false.
	 * 
	 * @param toCompare
	 */
	public boolean equals(Object toCompare) {
		if (toCompare == null || !(toCompare instanceof Bill)) {
			return false;
		} else {
			Bill that = (Bill) toCompare;
			if ((this.getAmount().equals(that.getAmount())) && (this.getDueDate().equals(that.getDueDate()))
					&& (this.paidDate.equals(that.paidDate)) && (this.getOriginator().equals(that.getOriginator()))) {
				return true;
			} else {
				return false;
			}
		}
	}
}
