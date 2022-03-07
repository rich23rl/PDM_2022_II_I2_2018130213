package hn.edu.ujcv.pdm_2022_ii_i2_2018130213

import java.util.*

class ListaJugadores {
    private val lista: List<Jugadores> = ArrayList<Jugadores>(
        Arrays.asList<Any>(
            Jugadores(
                "David Beckham",
                " es un exfutbolista inglés, cuya carrera profesional cubrió algo más de veinte años (1992-2013). Asimismo, es una celebridad más allá del ámbito deportivo, con una lucrativa actividad publicitaria que sigue a día de hoy. Fue condecorado con la Orden del Imperio Británico, recibiendo el tratamiento de sir."
            ),
            Jugadores(
                "Cristiano Ronaldo",
                "más conocido como Cristiano Ronaldo o CR7, es un futbolista portugués que juega como delantero en el Manchester United Football Club de la Premier League de Inglaterra y en la selección de Portugal, de la cual es su capitán y máximo goleador histórico. "
            ),
            Jugadores(
                "kaka",
                "conocido deportivamente como Kaká, es un exfutbolista brasileño que jugaba como centrocampista. Fue considerado como uno de los mejores futbolistas del mundo desde mediados hasta finales de los años 2000, principalmente en su primera etapa con el A. C. Milan."
            ),
            Jugadores(
                "Fernando Torres",
                "también conocido como El Niño Torres, es un exfutbolista español que jugaba como delantero. Es considerado una leyenda en el Atlético de Madrid y la selección de fútbol de España. En la actualidad es entrenador de las secciones formativas del Atlético de Madrid"
            ),
            Jugadores(
                "Zindedine Zidane",
                "también conocido como Zizou (pronunciación en francés: zizu), es un exfutbolista y entrenador franco-argelino. "
            ),
        )
    )

    fun retornarTodos(): List<Jugadores>? {
        return lista
    }

    fun retornar(jugador: String): Jugadores? {
        for (f in lista.indices) if (jugador.equals(
                lista[f].getJugador(),
                ignoreCase = true
            )
        ) return lista[f]
        return null
    }
}