package dk.flug

import com.sun.jndi.cosnaming.ExceptionMapper
import grails.rest.*
import grails.converters.*

class ErrorController {
	static responseFormats = ['json']
	
    def index() {
        def initialController = request.exception?.className
        def exception = request.exception
        def message = exception?.cause?.targetException.message

        render exception as JSON
    }
}
