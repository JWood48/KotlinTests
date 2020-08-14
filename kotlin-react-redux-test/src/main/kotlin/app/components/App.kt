package app.components

import app.containers.addTodo
import app.containers.visibleTodoList
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.b
import react.dom.br
import react.dom.div
import react.dom.h1
import react.router.dom.*
import react.router.dom.navLink

private const val TODO_LIST_PATH = "/todolist"

external interface AppState : RState {
    var msg: String

}




class App : RComponent<RProps, AppState>() {
    override fun AppState.init() {
        msg = "HELLO48"

        val mainScope = MainScope()
        mainScope.launch {
            //val videos = fetchVideos()
            setState {
                msg = "45"
            }
        }
    }

    override fun RBuilder.render() {

        div {
            h1 {+state.msg }
            b { +"OTHER" }
        }

        browserRouter {
            switch {
                route("/", exact = true) {
                    div {
                        h1 {
                            +"Kotlin React + React-Dom + Redux + React-Redux + React-Router Example"
                        }
                        routeLink(TODO_LIST_PATH) {
                            +"Go to todo list"
                        }
                    }
                }
                route(TODO_LIST_PATH) {
                    div {
                        addTodo {}
                        visibleTodoList {}
                        footer()
                        br {}
                        routeLink("/") {
                            +"Go back"
                        }
                    }
                }
            }
        }

    }
}



fun RBuilder.app() =
    browserRouter {
        switch {
            route("/", exact = true) {
                div {
                    h1 {
                        +"Kotlin React + React-Dom + Redux + React-Redux + React-Router Example"
                    }
                    routeLink(TODO_LIST_PATH) {
                        +"Go to todo list"
                    }
                }
            }
            route(TODO_LIST_PATH) {
                div {
                    addTodo {}
                    visibleTodoList {}
                    footer()
                    br {}
                    routeLink("/") {
                        +"Go back"
                    }
                }
            }
        }
    }