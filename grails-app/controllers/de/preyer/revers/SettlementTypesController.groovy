package de.preyer.revers


import grails.rest.*
import grails.converters.*

class SettlementTypesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    SettlementTypesController() {
        super(SettlementTypes)
    }
}
