package de.preyer.revers

class ReceiptTypes {

	String rcpt
	String name

	//static hasMany = [receipts: Receipts]

	static mapping = {
		version false
	}

	static constraints = {
		rcpt nullable: true, maxSize: 10
		name nullable: true
	}
}
