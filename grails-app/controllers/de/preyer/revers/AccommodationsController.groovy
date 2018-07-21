package de.preyer.revers

import grails.rest.RestfulController

class AccommodationsController extends RestfulController {
    static responseFormats = ['json', 'xml']

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    AccommodationsController() {

        super(Accommodations)
    }
}
