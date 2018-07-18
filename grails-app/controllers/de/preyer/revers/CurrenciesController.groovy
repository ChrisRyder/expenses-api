package de.preyer.revers


import grails.rest.*
import grails.converters.*

class CurrenciesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CurrenciesController() {
        super(Currencies)
    }
}
