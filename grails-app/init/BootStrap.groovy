import christmaslottery.Person

class BootStrap {

    def init = { servletContext ->
        new Person(name: "Travis", recipient: null).save()
        new Person(name: "Kimmy", recipient: null).save()
        new Person(name: "Kevin", recipient: null).save()
        new Person(name: "Mom", recipient: null).save()
        new Person(name: "Dad", recipient: null).save()
        new Person(name: "David", recipient: null).save(flush:true)
    }
    def destroy = {
    }
}
