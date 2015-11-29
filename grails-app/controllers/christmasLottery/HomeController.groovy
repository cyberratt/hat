package christmasLottery

import christmaslottery.Person

class HomeController {

    def index() {
        [people: Person.findAll()]
    }
}
