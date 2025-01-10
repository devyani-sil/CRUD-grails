package Students

class UrlMappings {
    static mappings = {

        "/api/students"(resources: 'student',formats: ['json'])


        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/api/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }


        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
