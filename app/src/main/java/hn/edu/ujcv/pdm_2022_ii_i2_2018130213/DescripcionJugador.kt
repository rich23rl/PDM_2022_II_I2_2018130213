package hn.edu.ujcv.pdm_2022_ii_i2_2018130213

import android.content.Intent.getIntent
import android.content.res.Configuration
import android.os.Bundle

class DescripcionJugador  extends AppCompatActivity {
    var listaJugadores: ListaJugadores? = null
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descripcion_jugador)
        listaJugadores = ListaJugadores()
        val datos: Bundle = getIntent().getExtras()
        getSupportFragmentManager().setFragmentResult("datos", datos)
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) finish()
    }
}