package de.preyer.revers

class PaymentTypes {

	String pmnt
	String name

	// static hasMany = [receipts: Receipts]

	static mapping = {
		version false
	}

	static constraints = {
		pmnt maxSize: 10
		name nullable: true
	}
}
