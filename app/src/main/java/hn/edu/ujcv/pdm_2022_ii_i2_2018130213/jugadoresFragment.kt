package hn.edu.ujcv.pdm_2022_ii_i2_2018130213

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class jugadoresFragment : Fragment() {
    private var rvjugador: RecyclerView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jugadores, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvjugador = view.findViewById(R.id.rvjugador)
        rvjugador.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        val linearLayoutManager = LinearLayoutManager(context)
        rvjugador.setLayoutManager(linearLayoutManager)
        rvjugador.setAdapter(AdaptadorJugador())
    }

    internal inner class AdaptadorJugador :
        RecyclerView.Adapter<AdaptadorJugador.AdaptadorJugadorHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorJugadorHolder {
            return AdaptadorJugadorHolder(layoutInflater.inflate(R.layout.itemjugador, parent, false))
        }

        override fun onBindViewHolder(holder: AdaptadorJugadorHolder, position: Int) {
            holder.imprimir(position)
        }

        override fun getItemCount(): Int {
            return ListaJugadores.retornarTodos().size()
        }

        inner class AdaptadorJugadorHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView), View.OnClickListener {
            private val tv1: TextView
            fun imprimir(position: Int) {
                tv1.setText(ListaJugadores.retornarTodos().get(position).getNombre())
            }

            override fun onClick(v: View) {
                if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
                    val intento = Intent(context, DescripcionJugador::class.java)
                    intento.putExtra(
                        "Jugador",
                        ListaJugadores.retornarTodos().get(layoutPosition).getJugador()
                    )
                    startActivity(intento)
                } else {
                    val bundle = Bundle()
                    bundle.putString(
                        "Jugador",
                        ListaJugadores.retornarTodos().get(layoutPosition).getJugador()
                    )
                    parentFragmentManager.setFragmentResult("datos", bundle)
                }
            }

            init {
                tv1 = itemView.findViewById(R.id.txvJugador)
                itemView.setOnClickListener(this)
            }
        }
    }
}
