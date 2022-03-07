package hn.edu.ujcv.pdm_2022_ii_i2_2018130213

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_descripsion_jugador.*


class FragmentoDescripcionJugador : Fragment() {
    private var tvdescripcion: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parentFragmentManager.setFragmentResultListener(
            "datos", this
        ) { requestKey, result ->
            val jugador = result.getString("jugador")
            val jugadorSelec: Jugadores = ListaJugadores.retornar(jugador)
            tvdescripcion.setText(jugadorSelec.getDescripcion())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_descripsion_jugador, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivjugador = view.findViewById(R.id.ivjugador)
        tvdescripcion = view.findViewById(R.id.tvdescripcion)
        tvdescripcion.setText(ListaJugadores.retornarTodos().get(0).getDescripcion())
    }
}