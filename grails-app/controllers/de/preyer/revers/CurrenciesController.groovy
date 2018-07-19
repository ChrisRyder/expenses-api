package de.preyer.revers

import grails.rest.RestfulController

class CurrenciesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CurrenciesController() {
        super(Currencies)
    }
    @Override
    def index() {
        respond Currencies.list()
    }
}
