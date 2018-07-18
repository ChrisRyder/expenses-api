package de.preyer.revers

class ReductionTypes {

	String rdn
	String name

	static hasMany = [reductions: Reductions]

	static mapping = {
		version false
	}

	static constraints = {
		rdn nullable: true, maxSize: 100
		name nullable: true, maxSize: 100
	}
}
