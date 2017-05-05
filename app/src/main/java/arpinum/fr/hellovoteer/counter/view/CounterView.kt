package arpinum.fr.hellovoteer.counter.view

import android.content.Context
import android.widget.LinearLayout
import arpinum.fr.hellovoteer.applicationStore
import arpinum.fr.hellovoteer.counter.actions.DECREMENT
import arpinum.fr.hellovoteer.counter.actions.INCREMENT
import trikita.anvil.DSL.*
import trikita.anvil.RenderableView

class CounterView(c: Context) : RenderableView(c) {

    override fun view() {
        linearLayout {
            size(MATCH, MATCH)
            padding(dip(8))
            orientation(LinearLayout.VERTICAL)
            textView {
                size(MATCH, WRAP)
                text("Counter ${applicationStore.state.counter}")
            }
            button {
                size(FILL, WRAP)
                text("+")
                onClick { applicationStore.dispatch(INCREMENT) }
            }
            button {
                size(FILL, WRAP)
                text("-")
                onClick { applicationStore.dispatch(DECREMENT) }
            }
        }
    }
}