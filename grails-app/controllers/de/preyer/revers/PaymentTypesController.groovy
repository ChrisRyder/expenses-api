package de.preyer.revers


import grails.rest.*
import grails.converters.*

class PaymentTypesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PaymentTypesController() {
        super(PaymentTypes)
    }
}
