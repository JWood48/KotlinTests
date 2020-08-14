package app.reducers

import app.actions.SetVisibilityFilter
import app.enums.VisibilityFilter
import redux.RAction

fun visibilityFilter(
    state: VisibilityFilter = VisibilityFilter.SHOW_ALL,
    action: RAction
): VisibilityFilter = when (action) {
    //is SetVisibilityFilter -> action.filter
    else -> state
}