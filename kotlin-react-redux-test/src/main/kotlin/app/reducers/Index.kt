package app.reducers

import app.entities.Todo
import app.enums.VisibilityFilter
import app.util.combineReducers
import react.RState

@JsExport
data class State(
    val msg: String = "N/A",
    val todos: Array<Todo> = emptyArray(),
    val visibilityFilter: VisibilityFilter = VisibilityFilter.SHOW_ALL
)

@JsExport
fun combinedReducers() = combineReducers(
    mapOf(
        State::todos to ::todos,
        State::visibilityFilter to ::visibilityFilter
    )
)
