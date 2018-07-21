package de.preyer.revers


import grails.rest.*
import grails.converters.*

class ReceiptTypesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ReceiptTypesController() {
        super(ReceiptTypes)
    }
}
