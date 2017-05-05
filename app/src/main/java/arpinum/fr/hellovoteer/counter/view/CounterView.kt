package arpinum.fr.hellovoteer.counter.view

import android.widget.LinearLayout
import arpinum.fr.hellovoteer.MainActivity
import arpinum.fr.hellovoteer.applicationStore
import arpinum.fr.hellovoteer.counter.actions.DECREMENT
import arpinum.fr.hellovoteer.counter.actions.INCREMENT
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.*

class CounterView : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

        linearLayout {
            lparams(width = matchParent, height = matchParent)
            padding = dip(8)
            orientation = LinearLayout.VERTICAL
            val counterValue = textView {
                lparams(width = matchParent, height = wrapContent)
                text = "Counter ${applicationStore.state.counter}"
            }
            applicationStore.subscribe { (counter) -> counterValue.text = "Counter ${counter}" }
            button {
                lparams(width = matchParent, height = wrapContent)
                text = "+"
                onClick { applicationStore.dispatch(INCREMENT) }
            }
            button {
                lparams(width = matchParent, height = wrapContent)
                text = "-"
                onClick { applicationStore.dispatch(DECREMENT) }
            }
        }
    }


}