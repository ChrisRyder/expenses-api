package de.preyer.revers

import grails.rest.RestfulController

class CountriesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CountriesController() {
        super(Countries)

    }
    @Override
    def index() {
        respond Countries.list()
    }
}
