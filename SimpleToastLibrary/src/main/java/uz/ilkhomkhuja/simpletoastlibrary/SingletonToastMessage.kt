package uz.ilkhomkhuja.simpletoastlibrary

import android.content.Context
import android.widget.Toast

object SingletonToastMessage {
    fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}