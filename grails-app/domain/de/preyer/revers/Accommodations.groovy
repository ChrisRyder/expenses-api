package de.preyer.revers

class Accommodations {

	long id
	Float indRefund
	String infoText
	Boolean noPaying
	SettlementTypes settlementTypes
	Countries countries

	//static hasMany = [travelDays: TravelDays]
	// static belongsTo = [SettlementTypes]

	static mapping = {
		version false
	}

	static constraints = {
		indRefund nullable: true
		infoText nullable: true, maxSize: 50
		noPaying nullable: true
	}
}
