package de.preyer.revers


import grails.rest.*
import grails.converters.*

class TravelCostsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TravelCostsController() {
        super(TravelCosts)
    }
}
