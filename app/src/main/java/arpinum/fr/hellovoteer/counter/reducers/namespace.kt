package arpinum.fr.hellovoteer.counter.reducers

import arpinum.fr.hellovoteer.ApplicationState
import arpinum.fr.hellovoteer.counter.actions.DECREMENT
import arpinum.fr.hellovoteer.counter.actions.INCREMENT
import arpinum.fr.hellovoteer.counter.actions.INIT
import com.brianegan.bansa.Reducer

val counterReducer = Reducer<ApplicationState> { state, action ->
    when (action) {
        is INIT -> ApplicationState()
        is INCREMENT -> state.copy(counter = state.counter + 1)
        is DECREMENT -> state.copy(counter = state.counter - 1)
        else -> state
    }
}
