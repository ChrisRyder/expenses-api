package de.preyer.revers


import grails.rest.*
//import grails.plugin.springsecurity.annotation.Secured

//@Secured(['ROLE_USER','ROLE_ADMIN'])

class PartnersController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PartnersController() {
        super(Partners)

    }
    def findAllByPayor() {

        respond Partners.findAllByPayorAndHidden(true,false)
    }
    def findAllByCostCenter() {

        respond Partners.findAllByCostCenterAndHidden( true, false)
    }
    def findAllByClient() {

        respond Partners.findAllByClientAndHidden(true, false)
    }

}
