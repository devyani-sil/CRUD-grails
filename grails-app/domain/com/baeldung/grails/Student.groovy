package com.baeldung.grails
import grails.rest.*

//@Resource(uri='/api/student')
class Student {

        String firstName
        String lastName

    static constraints = {
    }
}