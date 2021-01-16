package com.dora2000.ucspyayoq.ui.home

import android.Manifest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.dora2000.ucspyayoq.R
import com.karumi.dexter.Dexter
import com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Dexter.withContext(this.context)
            .withPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.CALL_PHONE)
            .withListener(object : BaseMultiplePermissionsListener(){})
        btn_home_fourth.setOnClickListener {
            val action_to_fourth = HomeFragmentDirections.actionNavHomeToFourthYear()
            findNavController().navigate(action_to_fourth)
        }
        btn_home_first.setOnClickListener {
            val action_to_first = HomeFragmentDirections.actionNavHomeToFIrstYearFragment()
            findNavController().navigate(action_to_first)
        }
        btn_home_second.setOnClickListener {
            val action_to_second = HomeFragmentDirections.actionNavHomeToSecondYear()
            findNavController().navigate(action_to_second)
        }
        btn_home_third.setOnClickListener {
            val action_to_third = HomeFragmentDirections.actionNavHomeToThirdYear2()
            findNavController().navigate(action_to_third)
        }
        btn_home_fifth.setOnClickListener {
            val action_to_fifth = HomeFragmentDirections.actionNavHomeToFifthYear()
            findNavController().navigate(action_to_fifth)
        }
    }
}