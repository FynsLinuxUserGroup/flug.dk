package dk.flug

import grails.rest.Resource

@Resource(uri = '/users')
class User {

    static mapWith = "cassandra"

    String firstname
    String lastname

    static constraints = {
    }
}
