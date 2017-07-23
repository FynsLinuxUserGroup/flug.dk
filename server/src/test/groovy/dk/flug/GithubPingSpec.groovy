package dk.flug

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class GithubPingSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "testing"() {
        when:
        //def user = new User(firstname: "john", lastname: "doe")
//        user.save()
        //user.insert()
        def f = User.get("745ef439-29c7-49e3-ba16-a03f40eb72e3")
        println "-------------------------------"
        println f

        then:
        1 == 1
        //user.size() == 2
        //user.firstname == "john"
    }

//    void "a github ping event is successfully persisted"() {
//        when:
//        def testing = new GithubPing(hookType: "test", hookEvents: ['event1', 'event2'], sender: "test_sender", repoName: "test_repo").save();
//        println testing
//        def pingEvents = GithubPing.list([max: 10])
//
//        then:
//        pingEvents.size() > 0
//        //1 == 1
//    }
}
