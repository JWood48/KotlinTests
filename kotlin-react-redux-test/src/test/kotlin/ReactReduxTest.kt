import redux.RAction
import redux.createStore
import redux.rEnhancer
import kotlin.test.Test

class ReactReduxTest {

    @Test
    fun reduxTest() {

        data class TestState(val msg: String)

        class TestAction : RAction

        fun testReducer(state: TestState, action: RAction) : TestState = when (action) {
            is TestAction -> state.copy(msg = state.msg+"1")
            else -> state
        }

        val store = createStore(::testReducer, TestState("TEST_"), rEnhancer())

    }



}