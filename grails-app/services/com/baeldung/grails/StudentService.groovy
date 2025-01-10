package com.baeldung.grails
import grails.gorm.transactions.*
//
//import groovy.transform.CompileStatic
//
//@CompileStatic
//class StudentService {
//
//    def doSomething() {
//
//    }
//}

@Transactional
class StudentService {

    def get(id){
        Student.get(id)
    }

    def list() {
        Student.list()
    }

    def save(student){
        student.save()
    }

    def delete(id){
        Student.get(id).delete()
    }
}