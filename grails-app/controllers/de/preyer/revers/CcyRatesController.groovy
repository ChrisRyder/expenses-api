package de.preyer.revers

import grails.rest.RestfulController

class CcyRatesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CcyRatesController() {
        super(CcyRates)
    }
    @Override
    def index() {
        respond CcyRates.list()
    }
}
