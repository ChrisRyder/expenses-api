package de.preyer.revers

class Countries {

	String cty
	String name

//	static hasMany = [accommodations: Accommodations,
//	                  foods: Food,
//	                  trips: Trips]

//  static belongsTo = [Food, Trips, Accommodations]
  static belongsTo = [Food, Accommodations]
    
	static mapping = {
		version true
	}

	static constraints = {
		cty maxSize: 10
		name nullable: true, maxSize: 100
	}
}
