package uz.ilkhomkhuja.simpletoastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import uz.ilkhomkhuja.simpletoastlibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }


}