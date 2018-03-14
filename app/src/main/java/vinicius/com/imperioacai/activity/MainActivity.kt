package vinicius.com.imperioacai.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import vinicius.com.imperioacai.R
import vinicius.com.imperioacai.adapter.PagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var vpPages : ViewPager
    lateinit var tbPages : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpPages = findViewById(R.id.vpPages)
        tbPages = findViewById(R.id.tbPages)

        setupViewPager()
    }

    fun setupViewPager() {
        var adapter = PagerAdapter(supportFragmentManager)
        vpPages.adapter = adapter
        tbPages.setupWithViewPager(vpPages)
    }
}
