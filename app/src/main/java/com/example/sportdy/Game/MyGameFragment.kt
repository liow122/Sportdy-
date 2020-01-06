package com.example.sportdy.Game


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.sportdy.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_my_game.*


/**
 * A simple [Fragment] subclass.
 */
class MyGameFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fabHostGame.setOnClickListener(){

        }
    }
    override fun onCreateView (
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_game, container, false)


    }

}

