class UrlMappings {

	static mappings = {
        "/task/listByProperty/$propertyName?(.$format)/$propertyValue?(.$format)"{
            constraints{
                //propertyName(matches: /^\w$/)
            }
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
