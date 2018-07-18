package de.preyer.revers

class Vehicles {

	Integer vhcl
	String name

	static hasMany = [travelCosts: TravelCosts]

	static mapping = {
		version false
	}

	static constraints = {
		vhcl nullable: true
		name nullable: true
	}
}
