package de.preyer.revers

import de.preyer.expenses.User
import grails.rest.*
import grails.converters.*

class TripsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    def dateService


    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    TripsController() {
        super(Trips)
    }

    def index(Integer max) {
        //params.max = Math.min(max ?: 10, 100)
        def listOfTrips = //getAuthenticatedUser().username.equalsIgnoreCase ('Admin') ?
                Trips.findAll()
                //: Trips.findAllByUser(getAuthenticatedUser())

        //println getAuthenticatedUser().username
        respond listOfTrips, model:[tripsInstanceCount: Trips.count()]
    }

    private splitIntoTravelDays(Trips trip){
        Date fromTime = trip.beginning.clone()
        Date toTime = trip.ending.clone()
        Date endDay = trip.ending.clone().clearTime()


        def days=trip.beginning..trip.ending

        days.each {day ->
            if (day.equals(trip.beginning)){
                fromTime = trip.beginning.clone()
            } else {
                fromTime = day.clone()
                fromTime.clearTime()
            }

            //day.clearTime()

            if (day.equals(endDay)){
                toTime = trip.ending.clone()
            } else {
                toTime = day.clone()
                toTime.set(hourOfDay: 23, minute: 59, second: 00)
            }

            trip.addToTravelDays(new TravelDays(fromTime:fromTime, toTime:toTime));
        }
        trip.save(flush:true, failOnError: true)
        println TravelDays.countByTrips(trip);
        println trip.travelDays.size();
    }

    private boolean isTripOverlap (Trips trip){
        def listOfTrips = Trips.findAll {//or find{} if you need the first occurance
            user == currentUser() && (
                    ((beginning <= trip.beginning) && ( ending >= trip.beginning)) ||
                            ((ending >= trip.ending) && (beginning <= trip.ending)) ||
                            ((beginning >= trip.beginning) && (ending <= trip.ending)) ||
                            ((beginning <= trip.beginning) && (ending >= trip.ending))
            )
        }

        listOfTrips.each{ t ->
            println "beginn: " + t.beginning + " ende: " + t.ending
        }
        println "Treffer: " + listOfTrips.size()

        return (listOfTrips.size() > 0)
    }

}
