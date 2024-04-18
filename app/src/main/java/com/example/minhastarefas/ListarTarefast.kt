package com.example.minhastarefas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.minhastarefas.databinding.FragmentListarTarefastBinding

class ListarTarefast : Fragment() {

    private lateinit var binding: FragmentListarTarefastBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListarTarefastBinding.inflate(inflater)

        binding.botaoNovaTarefa.setOnClickListener {
            criarTarefa.invoke()

        }

        return binding.root
    }

        companion object {
            private var criarTarefa: () -> Unit = {}


            @JvmStatic
            fun newInstance(criarTarefa: () -> Unit = {}, param2: String) =
                ListarTarefast().apply {
                    this@Companion.criarTarefa = criarTarefa
                }
        }
    }
