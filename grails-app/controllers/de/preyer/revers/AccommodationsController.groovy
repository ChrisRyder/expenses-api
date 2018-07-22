package de.preyer.revers

import grails.rest.RestfulController

class AccommodationsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    AccommodationsController() {
        super(Accommodations)
    }
    @Override
    def index() {
        respond Accommodations.list()
    }
}
