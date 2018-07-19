package de.preyer.expenses

import de.preyer.revers.Partners
import de.preyer.revers.RekiInfo
import de.preyer.revers.Trips

class User {

	transient springSecurityService

    long id
	long version
    boolean accountExpired = false
    boolean accountLocked = false
    Partners client
    String consultantNumber
    String displayName
    String email
    boolean enabled = true
    String firstName
    String lastName
    String password
    boolean passwordExpired = false
    String personNumber
    String username
    Partners costCenter

    static hasMany = [rekiInfos: RekiInfo,
	                  trips: Trips]
    
	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true
		password blank: false
        personNumber blank: true
        consultantNumber blank: true
        enabled()
        accountExpired()
        accountLocked()
        passwordExpired()
        firstName nullable: true, blank: true
        lastName nullable: true, blank: true
        displayName nullable: true, blank: true
        client nullable: true, blank: true
        costCenter  nullable: true, blank: true
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
        println password
	}
}
