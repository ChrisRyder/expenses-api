package de.preyer.revers


import grails.rest.*
import grails.converters.*

class ReductionsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ReductionsController() {
        super(Reductions)
    }
}
