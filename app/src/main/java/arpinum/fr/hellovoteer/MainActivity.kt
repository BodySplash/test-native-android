package arpinum.fr.hellovoteer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import arpinum.fr.hellovoteer.counter.view.CounterView
import trikita.anvil.Anvil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("MainActivity", "Start")
        setContentView(CounterView(this))
        applicationStore.subscribe { Anvil.render() }
    }
}