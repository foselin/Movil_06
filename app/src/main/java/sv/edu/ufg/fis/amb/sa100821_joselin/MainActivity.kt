package sv.edu.ufg.fis.amb.sa100821_joselin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.title="Sanchez Alvarez"
        supportActionBar?.subtitle="Universidad Francisco gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)


        val boton = findViewById<Button>(R.id.btn);
        boton.setOnClickListener {
            val intent = Intent(this,SegundaPantalla::class.java)
            startActivity(intent)
        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ufg_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.configuracion ->{
                Toast.makeText(this ,"usted ha seleccinado la opcion de configuracion ", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.perfil->{
                Toast.makeText(this ,"usted ha seleccinado la opcion de ver su perfil ", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.mapa ->{
                Toast.makeText(this ,"usted ha seleccinado la opcion PARA VER SU UBICACION  ", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nueva_cuenta ->{
                Toast.makeText(this ,"usted ha seleccinado la opcion de nueva cuenta ", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.salir ->{
                Toast.makeText(this ,"usted ha seleccinado la opcion de salir  ", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false

        }

    }


}