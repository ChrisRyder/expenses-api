package de.preyer.revers

class SettlementTypes {

	Integer stlmt
	String name

//	static hasMany = [accommodations: Accommodations]

	static mapping = {
		version false
	}

	static constraints = {
		stlmt nullable: true
		name nullable: true
	}
}
