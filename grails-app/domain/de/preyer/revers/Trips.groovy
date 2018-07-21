package de.preyer.revers

import de.preyer.expenses.User
import grails.databinding.BindingFormat

class Trips {

    Date created
    boolean done
    boolean clip
    @BindingFormat('dd.MM.yyyy')
    Date beginning
    @BindingFormat('dd.MM.yyyy')
    Date ending
    String reason
    String infoText
    Float upfront
    User user
    Partners payor
    Partners costCenter
    Countries countries
    Integer exports = 0

    static hasMany = [receipts: Receipts,
                      travelDays: TravelDays]

    static belongsTo = [User]

    static mapping = {
      version false
    }

    static constraints = {
      infoText nullable: true, maxSize: 30
      upfront nullable: true
      exports nullable: false
      reason nullable: false
        payor()
        costCenter()
        countries()
        done nullable: true
        clip nullable: true
    }

  }
