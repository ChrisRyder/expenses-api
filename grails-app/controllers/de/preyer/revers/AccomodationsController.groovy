package de.preyer.revers


import grails.rest.*
import grails.converters.*

class AccomodationsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    AccomodationsController() {
        super(Accomodations)
    }
}
