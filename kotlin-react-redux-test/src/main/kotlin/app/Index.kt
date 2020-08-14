package app

import app.actions.AddTodo
import app.actions.SetVisibilityFilter
import app.components.App
import app.components.app
import app.entities.Todo
import app.reducers.State
import app.reducers.combinedReducers
import app.reducers.todos
import react.dom.render
import react.redux.provider
import kotlinx.browser.document
import redux.*


val store = createStore(
    //::myReducer,
    combinedReducers(),
    State() // initial state
    , rEnhancer()
)

fun main() {

    console.log("STARTING...")

    val rootDiv = document.getElementById("root")
    render(rootDiv) {
        provider(store) {
            app()
            //child(App::class) {}
        }
    }
}