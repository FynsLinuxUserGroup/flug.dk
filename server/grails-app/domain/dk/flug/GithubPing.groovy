package dk.flug

class GithubPing {
    static mapWith = "cassandra"

    String hookType
    List<String> hookEvents
    String sender
    String repoName
    Date created = new Date()
//    UUID timeuuid

//    static mapping = {
//        timeuuid type:"timeuuid"
//    }

    static constraints = {
    }
}
