package de.preyer.revers


import grails.rest.*
import grails.converters.*

class ReductionTypesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ReductionTypesController() {
        super(ReductionTypes)
    }
}
