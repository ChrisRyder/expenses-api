package de.preyer.revers
import grails.databinding.BindingFormat

class Receipts {

	Float amontQc
	Float ccyRate
    @BindingFormat('dd.MM.yyyy')
	Date rcptDate
	String rcptText
	Boolean rcptF
	String infoText
//	Boolean twoHouseholds
//	Float domesticQuota
//	Float serviceCostsWithdraw
    @BindingFormat('dd.MM.yyyy')
	Date dayCheckIn
    @BindingFormat('dd.MM.yyyy')
	Date dayCheckOut
	Trips trips
	Partners payor
	Partners costCenter
	InputTaxTypes inputTaxType
//	InputTaxTypes inputTaxTypeF
	ReceiptTypes receiptTypes
	PaymentTypes paymentTypes
	Currencies currencies

	static hasMany = [reductions: Reductions]
  // static belongsTo = [Currencies, InputTaxTypes, Partners, PaymentTypes, ReceiptTypes, Trips]

	static mapping = {
		version false
	}

	static constraints = {
		ccyRate nullable: true, scale: 6
    rcptDate nullable:false, max: new Date()
		rcptText nullable: true, maxSize: 30
		rcptF nullable: true
		infoText nullable: true, maxSize: 30
//		twoHouseholds nullable: true
//		domesticQuota nullable: true
//		serviceCostsWithdraw nullable: true
		dayCheckIn nullable: true
		dayCheckOut nullable: true
    reductions nullable: true
	}
}
