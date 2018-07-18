package de.preyer.revers

class TravelDays {

	String trDay
	Date fromTime
	Date toTime
	String reason
	String infoText
	Boolean interrupt
	Boolean breakfast = false
	Boolean lunch = false
	Boolean dinner = false
	//Integer travelCostsId
	Accommodations accommodations
	Trips trips
	Food food

	static hasMany = [travelCosts: TravelCosts]
	static belongsTo = [Accommodations, Food, Trips]

	static mapping = {
		version false
	}

	static constraints = {
		trDay nullable: true,maxSize: 45
		infoText nullable: true, maxSize: 30
		interrupt nullable: true
		breakfast nullable: true
		lunch nullable: true
		dinner nullable: true
        accommodations nullable: true
        food nullable: true
        trips nullable: true
        travelCosts nullable: true
        reason nullable: true
	}
  
}
