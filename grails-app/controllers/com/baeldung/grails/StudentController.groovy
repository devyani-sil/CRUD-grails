package com.baeldung.grails

import com.baeldung.grails.Student
import grails.rest.RestfulController

class StudentController extends RestfulController {
    static responseFormats = ['json', 'xml']
//    def studentService
    StudentService studentService

    StudentController() {
        super(Student)
    }

    def index() {
        respond studentService.list()
    }

    def show(Long id) {
        respond studentService.get(id)
    }

    def create() {
        respond new Student(params)
    }

    def save(Student student) {
        studentService.save(student)
        redirect action:"index", method:"GET"
    }

    def delete(Long id) {
        studentService.delete(id)
        redirect action:"index", method:"GET"
    }
}