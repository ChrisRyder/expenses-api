package de.preyer.expenses


import de.preyer.revers.*
import grails.gorm.transactions.Transactional

@Transactional
class DateService {
    static Date today = new Date();

    static Date today() {
        return today;
    }

    static Date tomorrow(){
        return today + 1;
    }

    static Date  yesterday() {
        return today - 1;
    }

    static Date dayBefore() {
        return today - 2;
    }

    def splitIntoTravelDays(Trips trip){
        Date fromTime = trip.beginning.clone()
        Date toTime = trip.ending.clone()
        Date endDay = trip.ending.clone().clearTime()
        def travelDays=[:]

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
            println "====="
            println fromTime
            println toTime
            println "-----"
            def tf=new TravelDays(trips: trip, fromTime:fromTime, toTime:toTime).save(flush:true, failOnError: true)
        }
    }


}
