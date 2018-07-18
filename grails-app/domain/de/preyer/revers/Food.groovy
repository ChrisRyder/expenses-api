package de.preyer.revers

class Food {

	Float indRefund
	String infoText
	Boolean noPaying
	Countries countries

	static hasMany = [travelDays: TravelDays]

	static mapping = {
		version false
	}

	static constraints = {
		indRefund nullable: true
		infoText nullable: true, maxSize: 50
		noPaying nullable: true
	}
}
