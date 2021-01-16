package com.dora2000.ucspyayoq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.second_year.*

class SecondYear : Fragment() {
    var eng_double_tap = false
    var maths_double_tap = false
    var java_double_tap = false
    var digital_double_tap = false
    var dbms_double_tap = false
    var first_semester_double_tap = false
    var second_semester_double_tap = false
    lateinit var major: String
    val year: Int = 2
    lateinit var oq_year: String
    val first_sem = 1
    val second_sem = 2
    var eng_2nd_double_tap = false
    var java_2nd_double_tap = false
    var maths_2nd_double_tap = false
    var adv_data_strc_2nd_double_tap = false
    var ooad_2nd_double_tap = false
    var js_2nd_double_tap = false
    var se_sad_2nd_double_tap = false
    var sad_2nd_double_tap = false
    var dig_sys_des_2nd_double_tap = false
    var e_circuit1_2nd_double_tap = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        btn_second_year_first_sem.setOnClickListener {

            if (first_semester_double_tap) {
                layout_second_year_first_sem.visibility = View.GONE
                first_semester_double_tap = false
            } else {
                layout_second_year_first_sem.visibility = View.VISIBLE
                first_semester_double_tap = true
            }
        }
        btn_second_year_second_sem.setOnClickListener {
            if (second_semester_double_tap) {
                layout_second_year_second_sem.visibility = View.GONE
                second_semester_double_tap = false
            } else {
                layout_second_year_second_sem.visibility = View.VISIBLE
                second_semester_double_tap = true
            }
        }
        btn_2nd_first_sem_english.setOnClickListener {
            if (eng_double_tap) {
                eng_sub_layout_2nd_aca_year.visibility = View.GONE
                eng_double_tap = false
            } else {
                eng_sub_layout_2nd_aca_year.visibility = View.VISIBLE
                eng_double_tap = true
            }
        }
        btn_2nd_first_sem_01.setOnClickListener {
            if (maths_double_tap) {
                maths_sub_layout_2nd_aca_year.visibility = View.GONE
                maths_double_tap = false
            } else {
                maths_sub_layout_2nd_aca_year.visibility = View.VISIBLE
                maths_double_tap = true
            }

        }
        btn_2nd_first_sem_02.setOnClickListener {
            if (java_double_tap) {
                java_sub_layout_2nd_aca_year.visibility = View.GONE
                java_double_tap = false
            } else {
                java_sub_layout_2nd_aca_year.visibility = View.VISIBLE
                java_double_tap = true
            }
        }
        btn_2nd_first_sem_03.setOnClickListener {
            if (digital_double_tap) {
                digital_sub_layout_2nd_aca_year.visibility = View.GONE
                digital_double_tap = false
            } else {
                digital_sub_layout_2nd_aca_year.visibility = View.VISIBLE
                digital_double_tap = true
            }
        }
        btn_2nd_first_sem_04.setOnClickListener {
            if (dbms_double_tap) {
                dbms_sub_layout_2nd_aca_year.visibility = View.GONE
                dbms_double_tap = false
            } else {
                dbms_sub_layout_2nd_aca_year.visibility = View.VISIBLE
                dbms_double_tap = true
            }
        }
        btn_eng_2nd_firstsem_2017.setOnClickListener {
            major = "english"
            oq_year = "2017"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_eng_2nd_firstsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_eng_2nd_firstsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_maths_2nd_firstsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_maths_2nd_firstsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_maths_2nd_firstsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_java_2nd_firstsem_2017.setOnClickListener {
            major = "java"
            oq_year = "2017"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_java_2nd_firstsem_2018.setOnClickListener {
            major = "java"
            oq_year = "2018"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_java_2nd_firstsem_2019.setOnClickListener {
            major = "java"
            oq_year = "2019"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_digital_2nd_firstsem_2017.setOnClickListener {
            major = "digital"
            oq_year = "2017"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_digital_2nd_firstsem_2018.setOnClickListener {
            major = "digital"
            oq_year = "2018"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_digital_2nd_firstsem_2019.setOnClickListener {
            major = "digital"
            oq_year = "2019"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_dbms_2nd_firstsem_2017.setOnClickListener {
            major = "dbms"
            oq_year = "2017"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_dbms_2nd_firstsem_2018.setOnClickListener {
            major = "dbms"
            oq_year = "2018"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_dbms_2nd_firstsem_2019.setOnClickListener {
            major = "dbms"
            oq_year = "2019"
            val action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_2nd_second_sem_english.setOnClickListener {
            if (eng_2nd_double_tap) {
                eng_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                eng_2nd_double_tap = false
            } else {
                eng_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                eng_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_01.setOnClickListener {
            if (java_2nd_double_tap) {
                java_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                java_2nd_double_tap = false
            } else {
                java_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                java_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_02.setOnClickListener {
            if (maths_2nd_double_tap) {
                maths_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                maths_2nd_double_tap = false
            } else {
                maths_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                maths_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_03.setOnClickListener {
            if (adv_data_strc_2nd_double_tap) {
                adv_data_strc_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                adv_data_strc_2nd_double_tap = false
            } else {
                adv_data_strc_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                adv_data_strc_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_04.setOnClickListener {
            if (ooad_2nd_double_tap) {
                ooad_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                ooad_2nd_double_tap = false
            } else {
                ooad_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                ooad_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_05.setOnClickListener {
            if (js_2nd_double_tap) {
                js_com_app_tech_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                js_2nd_double_tap = false
            } else {
                js_com_app_tech_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                js_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_06.setOnClickListener {
            if (se_sad_2nd_double_tap) {
                se_sad_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                se_sad_2nd_double_tap = false
            } else {
                se_sad_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                se_sad_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_04_ct.setOnClickListener {
            if (sad_2nd_double_tap) {
                sad_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                sad_2nd_double_tap = false
            } else {
                sad_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                sad_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_05_ct.setOnClickListener {
            if (dig_sys_des_2nd_double_tap) {
                dig_sys_des_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                dig_sys_des_2nd_double_tap = false
            } else {
                dig_sys_des_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                dig_sys_des_2nd_double_tap = true
            }
        }
        btn_2nd_second_sem_06_ct.setOnClickListener {
            if (e_circuit1_2nd_double_tap) {
                e_circuit1_sub_layout_2nd_aca_year_second_sem.visibility = View.GONE
                e_circuit1_2nd_double_tap = false
            } else {
                e_circuit1_sub_layout_2nd_aca_year_second_sem.visibility = View.VISIBLE
                e_circuit1_2nd_double_tap = true
            }
        }
        btn_eng_2nd_secondsem_2017.setOnClickListener {
            major = "english"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_eng_2nd_secondsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_eng_2nd_secondsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_java_2nd_secondsem_2017.setOnClickListener {
            major = "java"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_java_2nd_secondsem_2018.setOnClickListener {
            major = "java"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_java_2nd_secondsem_2019.setOnClickListener {
            major = "java"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_maths_2nd_secondsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_maths_2nd_secondsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_maths_2nd_secondsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_adv_data_strc_2nd_secondsem_2017.setOnClickListener {
            major = "advanced data structure"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_adv_data_strc_2nd_secondsem_2018.setOnClickListener {
            major = "advanced data structure"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_adv_data_strc_2nd_secondsem_2019.setOnClickListener {
            major = "advanced data structure"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_ooad_2nd_secondsem_2017.setOnClickListener {
            major = "ooad"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_ooad_2nd_secondsem_2018.setOnClickListener {
            major = "ooad"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_ooad_2nd_secondsem_2019.setOnClickListener {
            major = "ooad"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_js_com_app_tech_2nd_secondsem_2017.setOnClickListener {
            major = "js"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_js_com_app_tech_2nd_secondsem_2018.setOnClickListener {
            major = "js"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_js_com_app_tech_2nd_secondsem_2019.setOnClickListener {
            major = "js"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_se_sad_2nd_secondsem_2017.setOnClickListener {
            major = "se+sad"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_se_sad_2nd_secondsem_2018.setOnClickListener {
            major = "se+sad"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_se_sad_2nd_secondsem_2019.setOnClickListener {
            major = "se+sad"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_sad_2nd_secondsem_2017.setOnClickListener {
            major = "sad"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_sad_2nd_secondsem_2018.setOnClickListener {
            major = "sad"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_sad_2nd_secondsem_2019.setOnClickListener {
            major = "sad"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_dig_sys_des_2nd_secondsem_2017.setOnClickListener {
            major = "digital system design"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_dig_sys_des_2nd_secondsem_2018.setOnClickListener {
            major = "digital system design"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_dig_sys_des_2nd_secondsem_2019.setOnClickListener {
            major = "digital system design"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_e_circuit1_2nd_secondsem_2017.setOnClickListener {
            major = "e-circuits 1"
            oq_year = "2017"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_e_circuit1_2nd_secondsem_2018.setOnClickListener {
            major = "e-circuits 1"
            oq_year = "2018"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
        btn_e_circuit1_2nd_secondsem_2019.setOnClickListener {
            major = "e-circuits 1"
            oq_year = "2019"
            var action =
                SecondYearDirections.actionSecondYearToViewer(year, major, oq_year, second_sem)
            findNavController().navigate(action)
        }
    }
}