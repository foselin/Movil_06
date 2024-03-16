package sv.edu.ufg.fis.amb.sa100821_joselin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.title="Sanchez Alvarez"
        supportActionBar?.subtitle="Universidad Francisco gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)


    }

    override fun onSupportNavigateUp(): Boolean {

        finish()
        return super.onSupportNavigateUp()
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
                Toast.makeText(this ,"usted ha seleccinado la opcion de ver ubicacion  ", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nueva_cuenta ->{
                Toast.makeText(this ,"usted ha seleccinado la opcion de nueva cuenta ", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.salir ->{
                Toast.makeText(this ,"usted ha seleccinado la opcion de salir   ", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false

        }

    }
}