package de.preyer.expenses

import de.preyer.revers.RekiInfo
import de.preyer.revers.Trips

class User {

	transient springSecurityService

	String username
	String password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	String personNumber
	String consultantNumber
    
	static hasMany = [rekiInfos: RekiInfo,
	                  trips: Trips]
    
	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true
		password blank: false
    personNumber blank: true
    consultantNumber blank: true
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role }
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}
}
