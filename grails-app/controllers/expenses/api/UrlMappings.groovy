package expenses.api

class UrlMappings {

    static mappings = {
        delete "/api/$controller/$id(.$format)?"(action:"delete")
        get "/api/$controller(.$format)?"(action:"index")
        get "/api/$controller/$id(.$format)?"(action:"show")
        post "/api/$controller(.$format)?"(action:"save")
        put "/api/$controller/$id(.$format)?"(action:"update")
        patch "/api/$controller/$id(.$format)?"(action:"patch")

        "/api/partners/findAllByPayor"(controller: 'Partners', action:"findAllByPayor")
        "/api/partners/findAllByCostCenter"(controller: 'Partners', action:"findAllByCostCenter")
        "/api/partners/findAllByClient"(controller: 'Partners', action:"findAllByClient")

         "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
