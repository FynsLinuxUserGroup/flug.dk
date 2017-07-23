package dk.flug.git

import dk.flug.GithubPing
import dk.flug.User
import dk.flug.error.GeneralError
import org.springframework.http.HttpStatus

class PayloadController {
	static responseFormats = ['json']

    PingService pingService
	
    def process() {
//        println request.JSON
//        println request.getHeader("X-GitHub-Event")
//        println request.getHeaderNames().toList()

        def gitEventType = request.getHeader("X-GitHub-Event")

//        if (!(gitEventType in ['ping'])) {
//            def error = new GeneralError(status: HttpStatus.BAD_REQUEST, message: "Missing Git specific header")
//            render(view: '/error/general', model: [error: error])
//            return
//        }

        try {
            gitEventType = 'ping'
            def json = request.JSON
            if (gitEventType == 'ping') {
                def id = pingService.registerPing(
                        json.hook.type,
                        json.hook.events,
                        json.sender.login,
                        json.repository.full_name
                )
                respond "sdfsdfsf"
                return
            }

        } catch (e) {
            def error = new GeneralError(status: HttpStatus.INTERNAL_SERVER_ERROR, message: "Error processing request")
            render(view: '/error/general', model: [error: error])
            return
        }
        render "bah"
    }

    def inserting() {
        def t = new GithubPing(hookType: "type", hookEvents: ['one','two'], sender: "me", repoName: "name").save()
        pingService.registerPing("type", ['one','two'], "me2", "name")
        render "hello"
    }

    def index() {
        render User.get("745ef439-29c7-49e3-ba16-a03f40eb72e3").firstname
    }
}
