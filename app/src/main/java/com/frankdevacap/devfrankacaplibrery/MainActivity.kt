package com.frankdevacap.devfrankacaplibrery


import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.frankdevacap.mylibrary.interfaces.ToolBarActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : ToolBarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toolbarToLoad(toolbar as Toolbar)
    }
}