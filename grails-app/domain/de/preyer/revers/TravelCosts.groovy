package de.preyer.revers

class TravelCosts {

	String route
	Boolean rentalCar
	Boolean train
//	Boolean passenger
	Boolean airplane
//	Boolean ship
//	Float kmDriversLog
	Integer kmTraveler
//	Integer kmPassenger
//	Float indRefund
	String infoText
	Boolean noPaying
	Vehicles vehicles

	static hasMany = [vehicles: Vehicles]
	static belongsTo = [TravelDays]

	static mapping = {
		version false
	}

	static constraints = {
		route nullable: true, maxSize: 8000
		rentalCar nullable: true
		train nullable: true
//		passenger nullable: true
		airplane nullable: true
//		ship nullable: true
//		kmDriversLog nullable: true
		kmTraveler nullable: true
//		kmPassenger nullable: true
//		indRefund nullable: true
		infoText nullable: true, maxSize: 50
		noPaying nullable: true
	}
}
