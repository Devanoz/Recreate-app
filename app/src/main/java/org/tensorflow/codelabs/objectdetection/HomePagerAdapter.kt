package org.tensorflow.codelabs.objectdetection

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import org.tensorflow.codelabs.objectdetection.ui.home.HomeFragment
import org.tensorflow.codelabs.objectdetection.ui.profile.ProfileFragment

class HomePagerAdapter(fm: FragmentManager, lf: Lifecycle): FragmentStateAdapter(fm,lf) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position) {
            0 -> {
                fragment = HomeFragment()
            }
            1 -> {
                fragment = ProfileFragment()
            }
        }
        return fragment as Fragment
    }

}