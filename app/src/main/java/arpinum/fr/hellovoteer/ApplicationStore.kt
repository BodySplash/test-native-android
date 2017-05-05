package arpinum.fr.hellovoteer

import arpinum.fr.hellovoteer.counter.reducers.counterReducer
import com.brianegan.bansa.BaseStore

val applicationStore = BaseStore(ApplicationState(), counterReducer)
