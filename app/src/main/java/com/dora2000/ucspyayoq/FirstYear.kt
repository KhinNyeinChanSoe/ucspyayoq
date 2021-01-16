package com.dora2000.ucspyayoq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.first_year.*

class FIrstYear_Fragment : Fragment() {
    var first_semester_double_tap = false
    var second_semester_double_tap = false
    var myanmar_double_tap = false
    var english_double_tap = false
    var physics_double_tap = false
    var maths_double_tap = false
    var pit_double_tap = false

    var secondsem_myanmar_double_tap = false
    var secondsem_eng_double_tap = false
    var secondsem_phy_double_tap = false
    var secondsem_cst101_double_tap = false
    var secondsem_itms102_double_tap = false
    var secondsem_cm121_double_tap = false

    lateinit var major: String
    val year: Int = 1
    lateinit var oq_year: String
    val first_sem = 1
    val second_sem = 2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.first_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_first_year_first_sem.setOnClickListener {
            if (first_semester_double_tap) {
                layout_first_year_first_sem.visibility = View.GONE
                first_semester_double_tap = false
            } else {
                layout_first_year_first_sem.visibility = View.VISIBLE
                first_semester_double_tap = true
            }
        }
        btn_first_year_second_sem.setOnClickListener {
            if (second_semester_double_tap) {
                layout_first_year_second_sem.visibility = View.GONE
                second_semester_double_tap = false
            } else {
                layout_first_year_second_sem.visibility = View.VISIBLE
                second_semester_double_tap = true
            }
        }
        btn_1st_first_sem_myanmar.setOnClickListener {
            if (myanmar_double_tap) {
                myan_sub_layout_1st_aca_year.visibility = View.GONE
                myanmar_double_tap = false
            } else {
                myan_sub_layout_1st_aca_year.visibility = View.VISIBLE
                myanmar_double_tap = true
            }
        }
        btn_1st_first_sem_01.setOnClickListener {
            if (english_double_tap) {
                eng_sub_layout_1st_aca_year.visibility = View.GONE
                english_double_tap = false
            } else {
                eng_sub_layout_1st_aca_year.visibility = View.VISIBLE
                english_double_tap = true
            }
        }
        btn_1st_first_sem_02.setOnClickListener {
            if (physics_double_tap) {
                physics_sub_layout_1st_aca_year.visibility = View.GONE
                physics_double_tap = false
            } else {
                physics_sub_layout_1st_aca_year.visibility = View.VISIBLE
                physics_double_tap = true
            }
        }
        btn_1st_first_sem_03.setOnClickListener {
            if (maths_double_tap) {
                maths_sub_layout_1st_aca_year.visibility = View.GONE
                maths_double_tap = false
            } else {
                maths_sub_layout_1st_aca_year.visibility = View.VISIBLE
                maths_double_tap = true
            }
        }
        btn_1st_first_sem_04.setOnClickListener {
            if (pit_double_tap) {
                pit_sub_layout_1st_aca_year.visibility = View.GONE
                pit_double_tap = false
            } else {
                pit_sub_layout_1st_aca_year.visibility = View.VISIBLE
                pit_double_tap = true
            }
        }


        btn_myan_1st_firstsem_2017.setOnClickListener {
            major = "myanmar"
            oq_year = "2017"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_myan_1st_firstsem_2018.setOnClickListener {
            major = "myanmar"
            oq_year = "2018"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_myan_1st_firstsem_2019.setOnClickListener {
            major = "myanmar"
            oq_year = "2019"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_eng_1st_firstsem_2017.setOnClickListener {
            major = "english"
            oq_year = "2017"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_eng_1st_firstsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_eng_1st_firstsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_physics_1st_firstsem_2017.setOnClickListener {
            major = "physics"
            oq_year = "2017"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_physics_1st_firstsem_2018.setOnClickListener {
            major = "physics"
            oq_year = "2018"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_physics_1st_firstsem_2019.setOnClickListener {
            major = "physics"
            oq_year = "2019"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_maths_1st_firstsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_maths_1st_firstsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_maths_1st_firstsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_pit_first_firstsem_2017.setOnClickListener {
            major = "pit"
            oq_year = "2017"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_pit_first_firstsem_2018.setOnClickListener {
            major = "pit"
            oq_year = "2018"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_pit_first_firstsem_2019.setOnClickListener {
            major = "pit"
            oq_year = "2019"
            val action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                first_sem
            )
            findNavController().navigate(action)
        }
        btn_1st_second_sem_myanmar.setOnClickListener {
            if (secondsem_myanmar_double_tap) {
                myan_sub_layout_1st_aca_year_second_sem.visibility = View.GONE
                secondsem_myanmar_double_tap = false
            } else {
                myan_sub_layout_1st_aca_year_second_sem.visibility = View.VISIBLE
                secondsem_myanmar_double_tap = true
            }
        }
        btn_1st_second_sem_01.setOnClickListener {
            if (secondsem_eng_double_tap) {
                eng_sub_layout_1st_aca_year_secondsem.visibility = View.GONE
                secondsem_eng_double_tap = false
            } else {
                eng_sub_layout_1st_aca_year_secondsem.visibility = View.VISIBLE
                secondsem_eng_double_tap = true
            }
        }
        btn_1st_second_sem_02.setOnClickListener {
            if (secondsem_phy_double_tap) {
                physics_sub_layout_1st_aca_year_secondsem.visibility = View.GONE
                secondsem_phy_double_tap = false
            } else {
                physics_sub_layout_1st_aca_year_secondsem.visibility = View.VISIBLE
                secondsem_phy_double_tap = true
            }
        }
        btn_1st_second_sem_03.setOnClickListener {
            if (secondsem_cst101_double_tap) {
                principle_cs_sub_layout_1st_aca_year.visibility = View.GONE
                secondsem_cst101_double_tap = false
            } else {
                principle_cs_sub_layout_1st_aca_year.visibility = View.VISIBLE
                secondsem_cst101_double_tap = true
            }
        }
        btn_1st_second_sem_04.setOnClickListener {
            if (secondsem_itms102_double_tap) {
                itsm102_sub_layout_1st_aca_year.visibility = View.GONE
                secondsem_itms102_double_tap = false
            } else {
                itsm102_sub_layout_1st_aca_year.visibility = View.VISIBLE
                secondsem_itms102_double_tap = true
            }
        }
        btn_1st_second_sem_05.setOnClickListener {
            if (secondsem_cm121_double_tap) {
                cm121_sub_layout_1st_aca_year.visibility = View.GONE
                secondsem_cm121_double_tap = false
            } else {
                cm121_sub_layout_1st_aca_year.visibility = View.VISIBLE
                secondsem_cm121_double_tap = true
            }
        }

        btn_myan_1st_secondsem_2017.setOnClickListener {
            major = "myanmar"
            oq_year = "2017"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_myan_1st_secondsem_2018.setOnClickListener {
            major = "myanmar"
            oq_year = "8"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_myan_1st_secondsem_2019.setOnClickListener {
            major = "myanmar"
            oq_year = "2019"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_eng_1st_secondsem_2017.setOnClickListener {
            major = "english"
            oq_year = "2017"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_eng_1st_secondsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_eng_1st_secondsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_physics_1st_secondsem_2017.setOnClickListener {
            major = "physics"
            oq_year = "2017"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_physics_1st_secondsem_2018.setOnClickListener {
            major = "physics"
            oq_year = "2018"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_physics_1st_secondsem_2019.setOnClickListener {
            major = "physics"
            oq_year = "2019"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_cst101_1st_secondsem_2017.setOnClickListener {
            major = "principle of computer science 1"
            oq_year = "2017"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_cst101_1st_secondsem_2018.setOnClickListener {
            major = "principle of computer science 1"
            oq_year = "2018"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_cst101_1st_secondsem_2019.setOnClickListener {
            major = "principle of computer science 1"
            oq_year = "2019"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_itsm102_first_secondsem_2017.setOnClickListener {
            major = "adv com application tech"
            oq_year = "2017"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_itsm102_first_secondsem_2018.setOnClickListener {
            major = "adv com application tech"
            oq_year = "2019"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_itsm102_first_secondsem_2019.setOnClickListener {
            major = "adv com application tech"
            oq_year = "2019"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_cm121_first_secondsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_cm121_first_secondsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
        btn_cm121_first_secondsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            var action = FIrstYear_FragmentDirections.actionFIrstYearFragmentToViewer(
                year,
                major,
                oq_year,
                second_sem
            )
            findNavController().navigate(action)
        }
    }
//
//    override fun onResume() {
//        super.onResume()
//        load_original()
//    }

}