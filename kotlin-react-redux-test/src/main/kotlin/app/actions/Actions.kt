package app.actions

import app.enums.VisibilityFilter
import redux.Action
import redux.RAction

class SetVisibilityFilter(val filter: VisibilityFilter) : Action {
    override val type : String = this::class.simpleName!!
}

class AddTodo(val text: String): RAction {
    private companion object {
      var nextTodoId = 1
    }
    val id = nextTodoId++
}

class ToggleTodo(val id: Int): RAction

