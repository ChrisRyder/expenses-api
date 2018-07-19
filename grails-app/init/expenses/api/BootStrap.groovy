package expenses.api

class BootStrap {
    transient springSecurityService

    def init = { servletContext ->



        def outpass = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword("Objects2012") : 'Objects2012'
        println outpass
    }
    def destroy = {
    }
}
