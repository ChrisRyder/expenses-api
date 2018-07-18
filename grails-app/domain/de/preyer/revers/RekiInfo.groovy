package de.preyer.revers

import de.preyer.expenses.User

class RekiInfo {

	String client
	String clientName
	Integer exportNum
	Date exportDate

	static belongsTo = [User]

	static mapping = {
		version false
	}

	static constraints = {
		client maxSize: 45
		clientName nullable: true, maxSize: 45
		exportNum nullable: true
		exportDate nullable: true
	}
}
