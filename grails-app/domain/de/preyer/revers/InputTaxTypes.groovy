package de.preyer.revers

class InputTaxTypes {

	String tax
	String name
	Boolean domestic

	static hasMany = [receiptsInputTaxType: Receipts
            //  ,receiptsInputTaxTypeF: Receipts
                ]

	// TODO you have multiple hasMany references for class(es) [Receipts] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
//	static mappedBy = [receiptsInputTaxType: "inputTaxType"
	               //    ,receiptsInputTaxTypeF: "inputTaxTypeF"
//                 ]

	static mapping = {
		version false
	}

	static constraints = {
		tax maxSize: 10
		name nullable: true
		domestic nullable: true
	}
}
