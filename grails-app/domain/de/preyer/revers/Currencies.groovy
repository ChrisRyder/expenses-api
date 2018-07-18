package de.preyer.revers

class Currencies {

	String cur
	String name
  Countries country

//	static belongsTo = [receipts: Receipts]

	static mapping = {
		version false
	}

	static constraints = {
		cur nullable: true, maxSize: 8
		name nullable: true
	}
}
