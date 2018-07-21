package de.preyer.revers


import grails.rest.*
import grails.converters.*

class VehiclesController extends RestfulController {
    static responseFormats = ['json', 'xml']
    VehiclesController() {
        super(Vehicles)
    }
}
