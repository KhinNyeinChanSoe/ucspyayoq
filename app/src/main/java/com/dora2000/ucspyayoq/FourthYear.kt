package com.dora2000.ucspyayoq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fourth_year.*


class FourthYear : Fragment() {
    var eng_double_tap = false
    var ai_double_tap = false
    var maths_double_tap = false
    var aa_double_tap = false
    var dbms_double_tap = false
    var se_double_tap = false
    var or_double_tap = false
    var intro_microcontroller_double_tap = false
    var com_archi2_double_tap = false
    var control_sys2_double_tap = false
    var com_network2_double_tap = false
    var eng_second_double_tap = false
    var ecommerce_second_double_tap = false
    var maths_second_double_tap = false
    var os_second_double_tap = false
    var is_mis_second_double_tap = false
    var uml_second_double_tap = false
    var com_graphic_second_double_tap = false
    var dbms_second_double_tap = false
    var em_second_double_tap = false
    var com_archi2_second_double_tap = false
    var crypto_second_double_tap = false
    var com_security_second_double_tap = false
    lateinit var major: String
    val year: Int = 4
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
        return inflater.inflate(R.layout.fourth_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_fourth_year_first_sem.setOnClickListener {
            if (first_semester_double_tap) {
                layout_fourth_year_first_sem.visibility = View.GONE
                first_semester_double_tap = false
            } else {
                layout_fourth_year_first_sem.visibility = View.VISIBLE
                first_semester_double_tap = true
            }
        }
        btn_fourth_year_second_sem.setOnClickListener {
            if (second_semester_double_tap) {
                layout_fourth_year_second_sem.visibility = View.GONE
                second_semester_double_tap = false
            } else {
                layout_fourth_year_second_sem.visibility = View.VISIBLE
                second_semester_double_tap = true
            }
        }

        btn_4th_first_sem_english.setOnClickListener {
            if (eng_double_tap) {
                eng_sub_layout_4th_aca_year.visibility = View.GONE
                eng_double_tap = false
            } else {
                eng_sub_layout_4th_aca_year.visibility = View.VISIBLE
                eng_double_tap = true
            }
        }
        btn_4th_first_sem_01.setOnClickListener {
            if (ai_double_tap) {
                ai_sub_layout_4th_aca_year.visibility = View.GONE
                ai_double_tap = false
            } else {
                ai_sub_layout_4th_aca_year.visibility = View.VISIBLE
                ai_double_tap = true
            }
        }
        btn_4th_first_sem_02.setOnClickListener {
            if (maths_double_tap) {
                maths_sub_layout_4th_aca_year.visibility = View.GONE
                maths_double_tap = false
            } else {
                maths_sub_layout_4th_aca_year.visibility = View.VISIBLE
                maths_double_tap = true
            }
        }
        btn_4th_first_sem_03.setOnClickListener {
            if (aa_double_tap) {
                aa_sub_layout_4th_aca_year.visibility = View.GONE
                aa_double_tap = false
            } else {
                aa_sub_layout_4th_aca_year.visibility = View.VISIBLE
                aa_double_tap = true
            }
        }
        btn_4th_first_sem_04.setOnClickListener {
            if (dbms_double_tap) {
                dbms_sub_layout_4th_aca_year.visibility = View.GONE
                dbms_double_tap = false
            } else {
                dbms_sub_layout_4th_aca_year.visibility = View.VISIBLE
                dbms_double_tap = true
            }
        }
        btn_4th_first_sem_05.setOnClickListener {
            if (se_double_tap) {
                se_sub_layout_4th_aca_year.visibility = View.GONE
                se_double_tap = false
            } else {
                se_sub_layout_4th_aca_year.visibility = View.VISIBLE
                se_double_tap = true
            }

        }
        btn_4th_first_sem_06.setOnClickListener {
            if (or_double_tap) {
                or_sub_layout_4th_aca_year.visibility = View.GONE
                or_double_tap = false
            } else {
                or_sub_layout_4th_aca_year.visibility = View.VISIBLE
                or_double_tap = true
            }

        }
        btn_4th_first_sem_ct_03.setOnClickListener {
            if (intro_microcontroller_double_tap) {
                intro_microcontroller_sub_layout_4th_aca_year.visibility = View.GONE
                intro_microcontroller_double_tap = false
            } else {
                intro_microcontroller_sub_layout_4th_aca_year.visibility = View.VISIBLE
                intro_microcontroller_double_tap = true
            }
        }
        btn_4th_first_sem_ct_04.setOnClickListener {
            if (com_archi2_double_tap) {
                com_arch2_sub_layout_4th_aca_year.visibility = View.GONE
                com_archi2_double_tap = false
            } else {
                com_arch2_sub_layout_4th_aca_year.visibility = View.VISIBLE
                com_archi2_double_tap = true
            }
        }
        btn_4th_first_sem_ct_05.setOnClickListener {
            if (control_sys2_double_tap) {
                control_sys2_sub_layout_4th_aca_year.visibility = View.GONE
                control_sys2_double_tap = false
            } else {
                control_sys2_sub_layout_4th_aca_year.visibility = View.VISIBLE
                control_sys2_double_tap = true
            }
        }
        btn_4th_first_sem_ct_06.setOnClickListener {
            if (com_network2_double_tap) {
                com_network2_sub_layout_4th_aca_year.visibility = View.GONE
                com_network2_double_tap = false
            } else {
                com_network2_sub_layout_4th_aca_year.visibility = View.VISIBLE
                com_network2_double_tap = true
            }
        }
        //English
        //fourth year first semester English 2017
        btn_eng_4th_firstsem_2017.setOnClickListener {

            major = "english"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //fourth year first semester English 2018
        btn_eng_4th_firstsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //fourth year first semester English 2019
        btn_eng_4th_firstsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Artificial Intelligence
        //fourth year first semester AI 2017
        btn_ai_4th_firstsem_2017.setOnClickListener {
            major = "ai"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //fourth year first semester AI 2018
        btn_ai_4th_firstsem_2018.setOnClickListener {
            major = "ai"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //fourth year first semester AI 2019
        btn_ai_4th_firstsem_2019.setOnClickListener {
            major = "ai"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Mathematics
        //Fourth year first semester Mathematics 2017
        btn_maths_4th_firstsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester Mathematics 2018
        btn_maths_4th_firstsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester Mathematics 2019
        btn_maths_4th_firstsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Analysis of Algorithms
        //Fourth year first semester AA 2017
        btn_aa_4th_firstsem_2017.setOnClickListener {
            major = "aa"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester AA 2018
        btn_aa_4th_firstsem_2018.setOnClickListener {
            major = "aa"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester AA 2019
        btn_aa_4th_firstsem_2019.setOnClickListener {
            major = "aa"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }

        //Database Management System
        //Fourth year first semester DBMS 2017
        btn_dbms_4th_firstsem_2017.setOnClickListener {
            major = "dbms"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester DBMS 2018
        btn_dbms_4th_firstsem_2018.setOnClickListener {
            oq_year = "2018"
            major = "dbms"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester DBMS 2019
        btn_dbms_4th_firstsem_2019.setOnClickListener {
            major = "dbms"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }


        //Software Engineering
        //Fourth year first semester SE 2017
        btn_se_4th_firstsem_2017.setOnClickListener {
            major = "se"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester SE 2018
        btn_se_4th_firstsem_2018.setOnClickListener {
            major = "se"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester SE 2019
        btn_se_4th_firstsem_2019.setOnClickListener {
            major = "se"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }

        //Operation Research
        //Fourth year first semester OR 2017
        btn_or_4th_firstsem_2017.setOnClickListener {
            major = "or"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester OR 2018
        btn_or_4th_firstsem_2018.setOnClickListener {
            major = "or"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        //Fourth year first semester OR 2019
        btn_or_4th_firstsem_2019.setOnClickListener {
            major = "or"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_intro_microcontroller_4th_firstsem_2017.setOnClickListener {
            major = "intro_microcontrollers"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_intro_microcontroller_4th_firstsem_2018.setOnClickListener {
            major = "intro_microcontrollers"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_intro_microcontroller_4th_firstsem_2019.setOnClickListener {
            major = "intro_microcontrollers"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_arch2_4th_firstsem_2017.setOnClickListener {
            major = "com_archi2"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_arch2_4th_firstsem_2018.setOnClickListener {
            major = "com_archi2"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_arch2_4th_firstsem_2019.setOnClickListener {
            major = "com_archi2"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_control_sys2_4th_firstsem_2017.setOnClickListener {
            major = "control_sys2"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_control_sys2_4th_firstsem_2018.setOnClickListener {
            major = "control_sys2"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_control_sys2_4th_firstsem_2019.setOnClickListener {
            major = "control_sys2"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_network2_4th_firstsem_2017.setOnClickListener {
            major = "com_network2"
            oq_year = "2017"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_network2_4th_firstsem_2018.setOnClickListener {
            major = "com_network2"
            oq_year = "2018"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_network2_4th_firstsem_2019.setOnClickListener {
            major = "com_network2"
            oq_year = "2019"
            val action =
                FourthYearDirections.actionFourthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_4th_second_sem_english.setOnClickListener {
            if (eng_second_double_tap) {
                eng_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                eng_second_double_tap = false
            } else {
                eng_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                eng_second_double_tap = true
            }
        }
        btn_4th_second_sem_01.setOnClickListener {
            if (ecommerce_second_double_tap) {
                ecommerce_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                ecommerce_second_double_tap = false
            } else {
                ecommerce_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                ecommerce_second_double_tap = true
            }
        }
        btn_4th_second_sem_02.setOnClickListener {
            if (maths_second_double_tap) {
                maths_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                maths_second_double_tap = false
            } else {
                maths_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                maths_second_double_tap = true
            }
        }
        btn_4th_second_sem_03.setOnClickListener {
            if (os_second_double_tap) {
                os_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                os_second_double_tap = false
            } else {
                os_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                os_second_double_tap = true
            }
        }
        btn_4th_second_sem_04.setOnClickListener {
            if (is_mis_second_double_tap) {
                is_mis_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                is_mis_second_double_tap = false
            } else {
                is_mis_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                is_mis_second_double_tap = true
            }
        }
        btn_4th_second_sem_05.setOnClickListener {
            if (uml_second_double_tap) {
                uml_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                uml_second_double_tap = false
            } else {
                uml_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                uml_second_double_tap = true
            }
        }
        btn_4th_second_sem_06.setOnClickListener {
            if (com_graphic_second_double_tap) {
                com_graphic_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                com_graphic_second_double_tap = false
            } else {
                com_graphic_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                com_graphic_second_double_tap = true
            }
        }
        btn_4th_second_sem_ct_01.setOnClickListener {
            if (dbms_second_double_tap) {
                dbms_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                dbms_second_double_tap = false
            } else {
                dbms_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                dbms_second_double_tap = true
            }
        }
        btn_4th_ct_03_second_sem.setOnClickListener {
            if (em_second_double_tap) {
                embedded_sys_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                em_second_double_tap = false
            } else {
                embedded_sys_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                em_second_double_tap = true
            }
        }
        btn_4th_second_sem_ct_04.setOnClickListener {
            if (com_archi2_second_double_tap) {
                com_arch2_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                com_archi2_second_double_tap = false
            } else {
                com_arch2_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                com_archi2_second_double_tap = true
            }
        }
        btn_4th_second_sem_ct_05.setOnClickListener {
            if (crypto_second_double_tap) {
                crypto_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                crypto_second_double_tap = false
            } else {
                crypto_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                crypto_second_double_tap = true
            }
        }
        btn_4th_second_sem_ct_06.setOnClickListener {
            if (com_security_second_double_tap) {
                com_security_sub_layout_4th_aca_year_second_sem.visibility = View.GONE
                com_security_second_double_tap = false
            } else {
                com_security_sub_layout_4th_aca_year_second_sem.visibility = View.VISIBLE
                com_security_second_double_tap = true
            }
        }
        btn_eng_4th_secondsem_2017.setOnClickListener {
            major = "english"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_eng_4th_secondsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_eng_4th_secondsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_ecommerce_4th_secondsem_2017.setOnClickListener {
            major = "ecommerce"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_ecommerce_4th_secondsem_2018.setOnClickListener {
            major = "ecommerce"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_ecommerce_4th_secondsem_2019.setOnClickListener {
            major = "ecommerce"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_maths_4th_secondsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_maths_4th_secondsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_maths_4th_secondsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_os_4th_secondsem_2017.setOnClickListener {
            major = "operating system"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_os_4th_secondsem_2018.setOnClickListener {
            major = "operating system"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_os_4th_secondsem_2019.setOnClickListener {
            major = "operating system"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_is_mis_4th_secondsem_2017.setOnClickListener {
            major = "is-mis"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_is_mis_4th_secondsem_2018.setOnClickListener {
            major = "is-mis"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_is_mis_4th_secondsem_2019.setOnClickListener {
            major = "is-mis"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_uml_4th_secondsem_2017.setOnClickListener {
            major = "uml"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_uml_4th_secondsem_2018.setOnClickListener {
            major = "uml"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_uml_4th_secondsem_2019.setOnClickListener {
            major = "uml"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_graphic_4th_secondsem_2017.setOnClickListener {
            major = "computer graphic"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_graphic_4th_secondsem_2018.setOnClickListener {
            major = "computer graphic"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_graphic_4th_secondsem_2019.setOnClickListener {
            major = "computer graphic"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_dbms_4th_secondsem_2017.setOnClickListener {
            major = "dbms"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_dbms_4th_secondsem_2018.setOnClickListener {
            major = "dbms"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_dbms_4th_secondsem_2019.setOnClickListener {
            major = "dbms"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_embedded_sys_4th_secondsem_2017.setOnClickListener {
            major = "embedded system"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_embedded_sys_4th_secondsem_2018.setOnClickListener {
            major = "embedded system"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_embedded_sys_4th_secondsem_2019.setOnClickListener {
            major = "embedded system"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_arch2_4th_secondsem_2017.setOnClickListener {
            major = "computer architecture 2"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_arch2_4th_secondsem_2018.setOnClickListener {
            major = "computer architecture 2"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_arch2_4th_secondsem_2019.setOnClickListener {
            major = "computer architecture 2"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_crypto_4th_secondsem_2017.setOnClickListener {
            major = "cryptography"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_crypto_4th_secondsem_2018.setOnClickListener {
            major = "cryptography"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_crypto_4th_secondsem_2019.setOnClickListener {
            major = "cryptography"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_security_4th_secondsem_2017.setOnClickListener {
            major = "computer security"
            oq_year = "2017"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_security_4th_secondsem_2018.setOnClickListener {
            major = "computer security"
            oq_year = "2018"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
        btn_com_security_4th_secondsem_2019.setOnClickListener {
            major = "computer security"
            oq_year = "2019"
            var action = FourthYearDirections.actionFourthYearToViewer(year,major,oq_year,second_sem)
            findNavController().navigate(action)
        }
    }

}