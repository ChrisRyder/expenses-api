package de.preyer.expenses

import grails.rest.RestfulController

class UserController extends RestfulController{

    static responseFormats = ['json', 'xml']
    UserController() {
        super(User)
    }
}
