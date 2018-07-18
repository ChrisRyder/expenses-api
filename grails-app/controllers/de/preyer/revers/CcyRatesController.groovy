package de.preyer.revers


import grails.rest.*
import grails.converters.*

class CcyRatesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CcyRatesController() {
        super(CcyRates)
    }
}
