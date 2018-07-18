package de.preyer.revers


import grails.rest.*
import grails.converters.*

class TravelDaysController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TravelDaysController() {
        super(TravelDays)
    }
}
