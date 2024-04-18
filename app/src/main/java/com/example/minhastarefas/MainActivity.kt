package com.example.minhastarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.minhastarefas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        abrirListaTarefas()
    }

    private fun abrirListaTarefas (){
        val fragmentListaTarefas = ListarTarefast.newInstance({

        }, "")

        supportFragmentManager.beginTransaction().replace(
            binding.frameLayout.id,
            fragmentListaTarefas
        ).commit()

        }

    private fun abrirCriarTarefa() {
        val fragmentCriarTarefast = CriarTarefaFragment.newInstance("", "")

        supportFragmentManager.beginTransaction().replace(
            binding.frameLayout.id,
            fragmentCriarTarefast
        ).commit()


    }

}