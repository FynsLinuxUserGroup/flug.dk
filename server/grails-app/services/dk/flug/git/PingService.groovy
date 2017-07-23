package dk.flug.git

import dk.flug.GithubPing
import grails.transaction.Transactional

@Transactional
class PingService {

    def registerPing(def hookType, List<String> hookEvents, def sender, def repoName) {
        def id = new GithubPing(hookType: hookType, hookEvents: hookEvents, sender: sender, repoName: repoName).save()
        return id
    }
}
