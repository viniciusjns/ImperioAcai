package vinicius.com.imperioacai.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import vinicius.com.imperioacai.R

/**
 * Created by vinicius on 14/03/18.
 */
class FragmentTwo : Fragment() {

    companion object {
        fun newInstance() : Fragment {
            return FragmentTwo()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_two, container, false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}