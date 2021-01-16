package com.dora2000.ucspyayoq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.third_year.*


class ThirdYear : Fragment() {
    var eng_double_tap = false
    var stco_double_tap = false
    var maths_double_tap = false
    var dcom_double_tap = false
    var se_double_tap = false
    var com_app_tech_double_tap = false
    var adv_app_tech_double_tap = false
    var electronic_1_double_tap = false
    var linear_control_sys_double_tap = false
    var e_circuit_2_double_tap = false
    var eng_second_double_tap = false
    var os_second_double_tap = false
    var maths_second_double_tap = false
    var networking_second_double_tap = false
    var dbms_second_double_tap = false
    var com_app_tech3_second_double_tap = false
    var electronic2_second_double_tap = false
    var com_archi1_second_double_tap = false
    var microprocessor_second_double_tap = false

    val year: Int = 3
    lateinit var major: String
    lateinit var oq_year: String
    val first_sem = 1
    val second_sem = 2
    var first_semester_double_tap = false
    var second_semester_double_tap = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.third_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_third_year_first_sem.setOnClickListener {
            if (first_semester_double_tap) {
                layout_third_year_first_sem.visibility = View.GONE
                first_semester_double_tap = false
            } else {
                layout_third_year_first_sem.visibility = View.VISIBLE
                first_semester_double_tap = true
            }
        }
        btn_third_year_second_sem.setOnClickListener {
            if(second_semester_double_tap){
                layout_third_year_second_sem.visibility = View.GONE
                second_semester_double_tap = false
            }else{
                layout_third_year_second_sem.visibility = View.VISIBLE
                second_semester_double_tap = true
            }
        }
        btn_3rd_first_sem_eng.setOnClickListener {
            if (eng_double_tap) {
                eng_sub_layout_3rd_aca_year.visibility = View.GONE
                eng_double_tap = false
            } else {
                eng_sub_layout_3rd_aca_year.visibility = View.VISIBLE
                eng_double_tap = true
            }
        }
        btn_3rd_first_sem_01.setOnClickListener {
            if (stco_double_tap) {
                stco_sub_layout_3rd_aca_year.visibility = View.GONE
                stco_double_tap = false
            } else {
                stco_sub_layout_3rd_aca_year.visibility = View.VISIBLE
                stco_double_tap = true
            }
        }
        btn_3rd_first_sem_02.setOnClickListener {
            if (maths_double_tap) {
                maths_sub_layout_3rd_aca_year.visibility = View.GONE
                maths_double_tap = false
            } else {
                maths_sub_layout_3rd_aca_year.visibility = View.VISIBLE
                maths_double_tap = true
            }
        }
        btn_3rd_first_sem_03.setOnClickListener {
            if (dcom_double_tap) {
                dcom_sub_layout_3rd_aca_year.visibility = View.GONE
                dcom_double_tap = false
            } else {
                dcom_sub_layout_3rd_aca_year.visibility = View.VISIBLE
                dcom_double_tap = true
            }
        }
        btn_3rd_first_sem_04.setOnClickListener {
            if (se_double_tap) {
                se_sub_layout_3rd_aca_year.visibility = View.GONE
                se_double_tap = false
            } else {
                se_sub_layout_3rd_aca_year.visibility = View.VISIBLE
                se_double_tap = true
            }
        }
        btn_3rd_first_sem_05.setOnClickListener {
            if (com_app_tech_double_tap) {
                computer_app_tech_sub_layout_3rd_aca_year.visibility = View.GONE
                com_app_tech_double_tap = false
            } else {
                computer_app_tech_sub_layout_3rd_aca_year.visibility = View.VISIBLE
                com_app_tech_double_tap = true
            }
        }
        btn_3rd_first_sem_06.setOnClickListener {
            if (adv_app_tech_double_tap) {
                adv_app_tech_sub_layout_3rd_aca_year.visibility = View.GONE
                adv_app_tech_double_tap = false
            } else {
                adv_app_tech_sub_layout_3rd_aca_year.visibility = View.VISIBLE
                adv_app_tech_double_tap = true
            }
        }

        //English
        //third year first semester english 2017
        btn_eng_3rd_firstsem_2017.setOnClickListener {
            major = "english"
            oq_year = "2017"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester english 2018
        btn_eng_3rd_firstsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester english 2019
        btn_eng_3rd_firstsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Stco
        //third year first semester stco 2017
        btn_stco_3rd_firstsem_2017.setOnClickListener {
            major = "stco"
            oq_year = "2017"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester stco 2018
        btn_stco_3rd_firstsem_2018.setOnClickListener {
            major = "stco"
            oq_year = "2018"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester stco 2019
        btn_stco_3rd_firstsem_2019.setOnClickListener {
            major = "stco"
            oq_year = "2019"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Maths
        //third year first semester maths 2017
        btn_maths_3rd_firstsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester maths 2018
        btn_maths_3rd_firstsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester maths 2019
        btn_maths_3rd_firstsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Data Communication
        //third year first semester data com 2017
        btn_dcom_3rd_firstsem_2017.setOnClickListener {
            major = "dcom"
            oq_year = "2017"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester data com 2018
        btn_dcom_3rd_firstsem_2018.setOnClickListener {
            major = "dcom"
            oq_year = "2018"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester data com 2019
        btn_dcom_3rd_firstsem_2019.setOnClickListener {
            major = "dcom"
            oq_year = "2019"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Software Engineering
        //third year first semester software engineering 2017
        btn_se_3rd_firstsem_2017.setOnClickListener {
            major = "se"
            oq_year = "2017"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester software engineering 2018
        btn_se_3rd_firstsem_2018.setOnClickListener {
            major = "se"
            oq_year = "2018"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester software engineering 2019
        btn_se_3rd_firstsem_2019.setOnClickListener {
            major = "se"
            oq_year = "2019"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Computer Application Techniques
        //third year first semester computer application techniques 2017
        btn_computer_app_tech_3rd_firstsem_2017.setOnClickListener {
            major = "computer_app_tech"
            oq_year = "2017"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester computer application techniques 2018
        btn_computer_app_tech_3rd_firstsem_2018.setOnClickListener {
            major = "computer_app_tech"
            oq_year = "2018"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester computer application techniques 2019
        btn_computer_app_tech_3rd_firstsem_2019.setOnClickListener {
            major = "computer_app_tech"
            oq_year = "2019"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Advance Programming Techniques
        //third year first semester advance programming techniques 2017
        btn_adv_app_tech_3rd_firstsem_2017.setOnClickListener {
            major = "adv_app_tech"
            oq_year = "2017"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester advance programming techniques 2018
        btn_adv_app_tech_3rd_firstsem_2018.setOnClickListener {
            major = "adv_app_tech"
            oq_year = "2018"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //third year first semester advance programming techniques 2019
        btn_adv_app_tech_3rd_firstsem_2019.setOnClickListener {
            major = "adv_app_tech"
            oq_year = "2019"
            val action =
                ThirdYearDirections.actionThirdYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_electronic_3rd_firstsem_2017.setOnClickListener {
            major = "electronic"
            oq_year = "2017"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_electronic_3rd_firstsem_2018.setOnClickListener {
            major = "electronic"
            oq_year = "2018"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_electronic_3rd_firstsem_2019.setOnClickListener {
            major = "electronic"
            oq_year = "2019"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_linear_control_system_3rd_firstsem_2017.setOnClickListener {
            major = "linear_control_system"
            oq_year = "2017"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_linear_control_system_3rd_firstsem_2018.setOnClickListener {
            major = "linear_control_system"
            oq_year = "2018"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_linear_control_system_3rd_firstsem_2019.setOnClickListener {
            major = "linear_control_system"
            oq_year = "2019"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_e_circuits2_3rd_firstsem_2017.setOnClickListener {
            major = "e_circuit2"
            oq_year = "2017"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_e_circuits2_3rd_firstsem_2018.setOnClickListener {
            major = "e_circuit2"
            oq_year = "2018"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_e_circuits2_3rd_firstsem_2019.setOnClickListener {
            major = "e_circuit2"
            oq_year = "2019"
            val action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_3rd_second_sem_eng.setOnClickListener {
            if (eng_second_double_tap){
                eng_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                eng_second_double_tap = false
            }else{
                eng_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                eng_second_double_tap = true
            }
        }
        btn_3rd_second_sem_01.setOnClickListener {
            if (os_second_double_tap){
                os_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                os_second_double_tap = false
            }else{
                os_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                os_second_double_tap = true
            }
        }
        btn_3rd_second_sem_02.setOnClickListener {
            if (maths_second_double_tap){
                maths_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                maths_second_double_tap = false
            }else {
                maths_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                maths_second_double_tap = true
            }
        }
        btn_3rd_second_sem_03.setOnClickListener {
            if (networking_second_double_tap){
                networking_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                networking_second_double_tap = false
            }else{
                networking_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                networking_second_double_tap = true
            }
        }
        btn_3rd_second_sem_04.setOnClickListener {
            if (dbms_second_double_tap){
                dbms_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                dbms_second_double_tap = false
            }else{
                dbms_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                dbms_second_double_tap = true
            }
        }
        btn_3rd_second_sem_05.setOnClickListener {
            if (com_app_tech3_second_double_tap){
                computer_app_tech3_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                com_app_tech3_second_double_tap = false
            }else{
                computer_app_tech3_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                com_app_tech3_second_double_tap = true
            }
        }
        btn_3rd_second_sem_04_ct.setOnClickListener {
            if (electronic2_second_double_tap){
                electronic2_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                electronic2_second_double_tap = false
            }else{
                electronic2_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                electronic2_second_double_tap = true
            }
        }
        btn_3rd_second_sem_ct_05.setOnClickListener {
            if (com_archi1_second_double_tap){
                com_archi1_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                com_archi1_second_double_tap = false
            }else{
                com_archi1_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                com_archi1_second_double_tap = true
            }
        }
        btn_3rd_second_sem_ct_06.setOnClickListener {
            if (microprocessor_second_double_tap){
                microprocessor_sub_layout_3rd_aca_year_second_sem.visibility = View.GONE
                microprocessor_second_double_tap = false
            }else{
                microprocessor_sub_layout_3rd_aca_year_second_sem.visibility = View.VISIBLE
                microprocessor_second_double_tap = true
            }
        }
        btn_eng_3rd_secondsem_2017.setOnClickListener {
            major = "english"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_eng_3rd_secondsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_eng_3rd_secondsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_os_3rd_secondsem_2017.setOnClickListener {
            major = "operating systems"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_os_3rd_secondsem_2018.setOnClickListener {
            major = "operating systems"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_os_3rd_secondsem_2019.setOnClickListener {
            major = "operating systems"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_maths_3rd_secondsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_maths_3rd_secondsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_maths_3rd_secondsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_networking_3rd_secondsem_2017.setOnClickListener {
            major = "networking"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_networking_3rd_secondsem_2018.setOnClickListener {
            major = "networking"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_networking_3rd_secondsem_2019.setOnClickListener {
            major = "networking"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_dbms_3rd_secondsem_2017.setOnClickListener {
            major = "dbms"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_dbms_3rd_secondsem_2018.setOnClickListener {
            major = "dbms"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_dbms_3rd_secondsem_2019.setOnClickListener {
            major = "dbms"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_computer_app_tech3_3rd_secondsem_2017.setOnClickListener {
            major = "computer application techniques 3"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_computer_app_tech3_3rd_secondsem_2018.setOnClickListener {
            major = "computer application techniques 3"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_computer_app_tech3_3rd_secondsem_2019.setOnClickListener {
            major = "computer application techniques 3"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_electronic2_3rd_secondsem_2017.setOnClickListener {
            major = "electronic 2"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_electronic2_3rd_secondsem_2018.setOnClickListener {
            major = "electronic 2"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_electronic2_3rd_secondsem_2019.setOnClickListener {
            major = "electronic 2"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_archi1_3rd_secondsem_2017.setOnClickListener {
            major = "computer architecture 1"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_archi1_3rd_secondsem_2018.setOnClickListener {
            major = "computer architecture 1"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_archi1_3rd_secondsem_2019.setOnClickListener {
            major = "computer architecture 1"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_microprocessor_3rd_secondsem_2017.setOnClickListener {
            major = "microprocessor"
            oq_year = "2017"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_microprocessor_3rd_secondsem_2018.setOnClickListener {
            major = "microprocessor"
            oq_year = "2018"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_microprocessor_3rd_secondsem_2019.setOnClickListener {
            major = "microprocessor"
            oq_year = "2019"
            var action = ThirdYearDirections.actionThirdYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
    }
}