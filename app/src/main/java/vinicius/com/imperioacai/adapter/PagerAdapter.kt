package vinicius.com.imperioacai.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import vinicius.com.imperioacai.fragment.ProductsFragment
import vinicius.com.imperioacai.fragment.OptionsFragment

/**
 * Created by vinicius on 14/03/18.
 */
class PagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    val titles = arrayOf("MilkShake / Açai", "Opcionais")

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment? = null
        when (position) {
            0 -> fragment = ProductsFragment.newInstance()
            1 -> fragment = OptionsFragment.newInstance()
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