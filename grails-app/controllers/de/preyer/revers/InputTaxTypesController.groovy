package de.preyer.revers


import grails.rest.*
import grails.converters.*

class InputTaxTypesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    InputTaxTypesController() {
        super(InputTaxTypes)
    }
}
