package de.preyer.revers

class Reductions {

	Date rdnDate
	Boolean breakfast
	Boolean lunch
	Boolean dinner
	Receipts receipts
	ReductionTypes reductionTypes

	static belongsTo = [Receipts, ReductionTypes]

	static mapping = {
		version false
	}

	static constraints = {
		breakfast nullable: true
		lunch nullable: true
		dinner nullable: true
	}
}
