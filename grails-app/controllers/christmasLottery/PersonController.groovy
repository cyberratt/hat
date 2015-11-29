package christmasLottery

import grails.converters.JSON

class PersonController {

    def personService

    def getName() {
        println "WE ARE ALMOST GETTING YOUR NAME"
        def recipient = personService.getRecipient(params.name)

        render recipient as JSON
    }
}
