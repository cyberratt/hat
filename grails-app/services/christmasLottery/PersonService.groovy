package christmasLottery

import christmaslottery.Person
import grails.transaction.Transactional

@Transactional
class PersonService {

    def getRecipient(def name) {

        Person giver = Person.findByName(name)
        Person recipient = null

        if (!giver?.recipient) {
            def validRecipient = false

            def numberOfPeople = Person.count
            def idToGet
            def loops = 0
            while (!validRecipient) {
                loops++
                idToGet = Math.abs(new Random().nextInt() % numberOfPeople) + 1
                recipient = Person.get(idToGet)
                println "TRYING TO GET RECIPIENT: $recipient"
                validRecipient = idToGet != giver.id || loops > 10 || !peopleAreKimmyAndDavid(giver, recipient)
            }
            giver.recipient = recipient
            recipient.isAlreadyPicked = true
        } else {
            recipient = giver.recipient
        }

        return recipient
    }

    def peopleAreKimmyAndDavid(Person giver, Person recipient) {
        return ((giver.name == "David" && recipient.name == "Kimmy") || (giver.name == "Kimmy" && recipient.name == "David"))
    }
}
