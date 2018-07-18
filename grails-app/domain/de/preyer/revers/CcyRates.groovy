package de.preyer.revers

class CcyRates {

    Currencies cur1
    Currencies cur2
    Float rate
    String name
    String comment
    
//	static belongsTo = [receipts: Receipts]

	static mapping = {
		version false
	}

	static constraints = {
		rate nullable: true, scale: 6
		cur1 nullable: true, maxSize: 8
		cur2 nullable: true, maxSize: 8
		name nullable: true
		comment nullable: true
	}
}
