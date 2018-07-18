package de.preyer.revers


import grails.rest.*
import grails.converters.*

class CountriesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CountriesController() {
        super(Countries)

    }
}
