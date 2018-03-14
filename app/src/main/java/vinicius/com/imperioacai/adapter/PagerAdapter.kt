package vinicius.com.imperioacai.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import vinicius.com.imperioacai.fragment.FragmentOne
import vinicius.com.imperioacai.fragment.FragmentTwo

/**
 * Created by vinicius on 14/03/18.
 */
class PagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    val titles = arrayOf("One", "Two")

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment? = null
        when (position) {
            0 -> fragment = FragmentOne.newInstance()
            1 -> fragment = FragmentTwo.newInstance()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return titles.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }
}