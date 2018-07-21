package de.preyer.revers


import grails.rest.*
import grails.converters.*

class FoodController extends RestfulController {
    static responseFormats = ['json', 'xml']
    FoodController() {
        super(Food)
    }
}
