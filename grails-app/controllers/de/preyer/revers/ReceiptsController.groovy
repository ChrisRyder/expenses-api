package de.preyer.revers


import grails.rest.*
import grails.converters.*

class ReceiptsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ReceiptsController() {
        super(Receipts)
    }
}
