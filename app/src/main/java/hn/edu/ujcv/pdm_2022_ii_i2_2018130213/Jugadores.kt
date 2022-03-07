package hn.edu.ujcv.pdm_2022_ii_i2_2018130213

public class Jugadores {
    private var jugador: String? = null
    private var equipo: String? = null
    private var descripcion: String? = null

    fun Jugador(jugador: String?, equipo: String?, descripcion: String?) {
        this.jugador = jugador
        this.equipo = equipo
        this.descripcion = descripcion
    }


    fun getEquipo(): String? {
        return equipo
    }

    fun getDescripcion(): String? {
        return descripcion
    }

    fun getJugador(): String? {
        return jugador
    }
}