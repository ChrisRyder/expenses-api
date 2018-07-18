package de.preyer.revers
import grails.rest.*

@Resource(uri='/api/partners')
class Partners {

	String par
	String name
	Boolean client
	Boolean costCenter
	Boolean payor
	Boolean hidden

//	static hasMany = [receiptsCostCenter: Receipts,
//	                  receiptsPayor: Receipts,
//	                  tripsCostCenter: Trips,
//	                  tripsPayor: Trips]

	// TODO you have multiple hasMany references for class(es) [Trips, Receipts] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
//	static mappedBy = [receiptsCostCenter: "costCenter",
//	                   receiptsPayor: "payor",
//	                   tripsCostCenter: 'costCenter',
//	                   tripsPayor: 'payor']

	static mapping = {
		version false
	}

	static constraints = {
		par maxSize: 10
		name nullable: true
		client nullable: true
		costCenter nullable: true
		payor nullable: true
		hidden nullable: true
	}
}
