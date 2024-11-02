package ir.shariaty.memory_hero

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.forEach
import ir.shariaty.memory_hero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private var score = 0
    private var result : String = ""
    private var userAnwser : String = ""
    override fun onCreate(savedInstanceState: Bundle? ){
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            panel1.setOnClickListener(this@MainActivity)
            panel2.setOnClickListener(this@MainActivity)
            panel3.setOnClickListener(this@MainActivity)
            panel4.setOnClickListener(this@MainActivity)
            startGame()
        }
    }

    override fun onClick(view: View?) {
        TODO("Not yet implemented")
    }

    private fun disableButtons(){
        binding.root.forEach { view ->
            if (view is AppCompatButton){
                view.isEnabled=false
            }
        }
    }
    private fun enableButtons(){
        binding.root.forEach { view ->
            if (view is AppCompatButton){
                view.isEnabled=true
            }
        }
    }
    private fun startGame(){
        result=""
        userAnwser=""
        disableButtons()
    }
}