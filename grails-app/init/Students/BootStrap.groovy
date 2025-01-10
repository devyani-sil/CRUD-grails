package Students

import com.baeldung.grails.Student

class BootStrap {

    def init = { servletContext ->
        new Student(firstName:"hello",lastName:"hii").save()
        new Student(firstName:"Devyani",lastName:"Sil").save()
        new Student(firstName:"Vardhani",lastName:"Trivedi").save()
    }
    def destroy = {
    }
}