package com.yds.api.web.param;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Nikhil Prajapati
 * @since: Oct 2, 2018
 */
public class User implements Serializable  {
	
	private static final long serialVersionUID = 5074025098854990855L;
	
	private String firstName;
	private String lastName;
	private String email;
	private String phNumber;
	private String mandal;
	private Date lastUpdatedOn;
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phNumber
	 */
	public String getPhNumber() {
		return phNumber;
	}
	/**
	 * @param phNumber the phNumber to set
	 */
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	/**
	 * @return the mandal
	 */
	public String getMandal() {
		return mandal;
	}
	/**
	 * @param mandal the mandal to set
	 */
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	/**
	 * @return the lastUpdatedOn
	 */
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	/**
	 * @param lastUpdatedOn
	 *            the lastUpdatedOn to set
	 */
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phNumber="
				+ phNumber + ", mandal=" + mandal + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}
}
