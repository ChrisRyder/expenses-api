package de.preyer.revers


import grails.rest.*
import grails.converters.*

class AccommodationsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    AccommodationsController() {
        super(Accommodations)
    }
}
