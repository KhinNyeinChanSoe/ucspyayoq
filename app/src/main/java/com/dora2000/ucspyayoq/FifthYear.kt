package com.dora2000.ucspyayoq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fifth_year.*

class FifthYear : Fragment() {
    var english_double_tap = false
    var maths_double_tap = false
    var dis_com_double_tap = false
    var info_it_risk_double_tap = false
    var com_apl_algs_double_tap = false
    var data_mining_double_tap = false
    var web_eng_double_tap = false
    var erp_double_tap = false
    var fuzzy_double_tap = false
    var embedded_double_tap = false
    var img_processing_double_tap = false

    lateinit var major: String
    val year: Int = 5
    lateinit var oq_year: String
    val first_sem = 1
    var first_semester_double_tap = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fifth_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_fifth_year_first_sem.setOnClickListener {
            if (first_semester_double_tap) {
                layout_fifth_year_first_sem.visibility = View.GONE
                first_semester_double_tap = false
            } else {
                layout_fifth_year_first_sem.visibility = View.VISIBLE
                first_semester_double_tap = true
            }
        }
        btn_5th_first_sem_english.setOnClickListener {
            if (english_double_tap) {
                eng_sub_layout_5th_aca_year.visibility = View.GONE
                english_double_tap = false
            } else {
                eng_sub_layout_5th_aca_year.visibility = View.VISIBLE
                english_double_tap = true
            }
        }
        btn_5th_first_sem_01.setOnClickListener {
            if (maths_double_tap) {
                maths_sub_layout_5th_aca_year.visibility = View.GONE
                maths_double_tap = false
            } else {
                maths_sub_layout_5th_aca_year.visibility = View.VISIBLE
                maths_double_tap = true
            }
        }
        btn_5th_first_sem_02.setOnClickListener {
            if (dis_com_double_tap) {
                dis_com_adv_net_sub_layout_5th_aca_year.visibility = View.GONE
                dis_com_double_tap = false
            } else {
                dis_com_adv_net_sub_layout_5th_aca_year.visibility = View.VISIBLE
                dis_com_double_tap = true
            }
        }
        btn_5th_first_sem_03_cs.setOnClickListener {
            if (info_it_risk_double_tap) {
                inform_sec_it_risk_sub_layout_5th_aca_year.visibility = View.GONE
                info_it_risk_double_tap = false
            } else {
                inform_sec_it_risk_sub_layout_5th_aca_year.visibility = View.VISIBLE
                info_it_risk_double_tap = true
            }
        }
        btn_5th_first_sem_04_cs.setOnClickListener {
            if (com_apl_algs_double_tap) {
                com_app_algs_sub_layout_5th_aca_year.visibility = View.GONE
                com_apl_algs_double_tap = false
            } else {
                com_app_algs_sub_layout_5th_aca_year.visibility = View.VISIBLE
                com_apl_algs_double_tap = true
            }
        }
        btn_5th_first_sem_05_c1_cs.setOnClickListener {
            if (data_mining_double_tap) {
                data_mining_sub_layout_5th_aca_year.visibility = View.GONE
                data_mining_double_tap = false
            } else {
                data_mining_sub_layout_5th_aca_year.visibility = View.VISIBLE
                data_mining_double_tap = true
            }
        }
        btn_5th_first_sem_05_c2_cs.setOnClickListener {
            if (web_eng_double_tap) {
                web_eng_sub_layout_5th_aca_year.visibility = View.GONE
                web_eng_double_tap = false
            } else {
                web_eng_sub_layout_5th_aca_year.visibility = View.VISIBLE
                web_eng_double_tap = true
            }
        }
        btn_5th_first_sem_05_c3_cs.setOnClickListener {
            if (erp_double_tap) {
                en_res_plan_sub_layout_5th_aca_year.visibility = View.GONE
                erp_double_tap = false
            } else {
                en_res_plan_sub_layout_5th_aca_year.visibility = View.VISIBLE
                erp_double_tap = true
            }
        }
        btn_eng_5th_firstsem_2017.setOnClickListener {
            major = "english"
            oq_year = "2017"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_eng_5th_firstsem_2018.setOnClickListener {
            major = "english"
            oq_year = "2018"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_eng_5th_firstsem_2019.setOnClickListener {
            major = "english"
            oq_year = "2019"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_maths_5th_firstsem_2017.setOnClickListener {
            major = "maths"
            oq_year = "2017"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_maths_5th_firstsem_2018.setOnClickListener {
            major = "maths"
            oq_year = "2018"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_maths_5th_firstsem_2019.setOnClickListener {
            major = "maths"
            oq_year = "2019"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_dis_com_adv_net_5th_firstsem_2017.setOnClickListener {
            major = "dis_com"
            oq_year = "2017"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_dis_com_adv_net_5th_firstsem_2018.setOnClickListener {
            major = "dis_com"
            oq_year = "2018"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_dis_com_adv_net_5th_firstsem_2019.setOnClickListener {
            major = "dis_com"
            oq_year = "2019"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_inform_sec_it_risk_5th_firstsem_2017.setOnClickListener {
            major = "inform_sec_it_risk"
            oq_year = "2017"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_inform_sec_it_risk_5th_firstsem_2018.setOnClickListener {
            major = "inform_sec_it_risk"
            oq_year = "2018"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_inform_sec_it_risk_5th_firstsem_2019.setOnClickListener {
            major = "inform_sec_it_risk"
            oq_year = "2019"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_app_algs_5th_firstsem_2017.setOnClickListener {
            major = "com_app_algs"
            oq_year = "2017"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_app_algs_5th_firstsem_2018.setOnClickListener {
            major = "com_app_algs"
            oq_year = "2018"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_com_app_algs_5th_firstsem_2019.setOnClickListener {
            major = "com_app_algs"
            oq_year = "2019"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_data_mining_5th_firstsem_2017.setOnClickListener {
            major = "data_mining"
            oq_year = "2017"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_data_mining_5th_firstsem_2018.setOnClickListener {
            major = "data_mining"
            oq_year = "2018"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_data_mining_5th_firstsem_2019.setOnClickListener {
            major = "data_mining"
            oq_year = "2019"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_web_eng_5th_firstsem_2017.setOnClickListener {
            major = "web_eng"
            oq_year = "2017"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_web_eng_5th_firstsem_2018.setOnClickListener {
            major = "web_eng"
            oq_year = "2018"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_web_eng_5th_firstsem_2019.setOnClickListener {
            major = "web_eng"
            oq_year = "2019"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_en_res_plan_5th_firstsem_2017.setOnClickListener {
            major = "erp"
            oq_year = "2017"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_en_res_plan_5th_firstsem_2018.setOnClickListener {
            major = "erp"
            oq_year = "2018"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_en_res_plan_5th_firstsem_2019.setOnClickListener {
            major = "erp"
            oq_year = "2019"
            var action =
                FifthYearDirections.actionFifthYearToViewer(year, major, oq_year, first_sem)
            findNavController().navigate(action)
        }
        btn_5th_first_sem_03_ct.setOnClickListener {
           if (fuzzy_double_tap){
               fuzzy_sub_layout_5th_aca_year.visibility = View.GONE
               fuzzy_double_tap = false
           }else{
               fuzzy_sub_layout_5th_aca_year.visibility = View.VISIBLE
               fuzzy_double_tap = true
           }
        }
        btn_5th_first_sem_04_ct.setOnClickListener {
            if (embedded_double_tap){
                embedded_sub_layout_5th_aca_year.visibility = View.GONE
                embedded_double_tap = false
            }else{
                embedded_sub_layout_5th_aca_year.visibility = View.VISIBLE
                embedded_double_tap = true
            }
        }
        btn_5th_first_sem_05_ct.setOnClickListener {
            if (img_processing_double_tap){
                img_process_com_vision_sub_layout_5th_aca_year.visibility = View.GONE
                img_processing_double_tap = false
            }else{
                img_process_com_vision_sub_layout_5th_aca_year.visibility = View.VISIBLE
                img_processing_double_tap = true
            }
        }
        btn_fuzzy_5th_firstsem_2017.setOnClickListener {
            major = "fuzzy"
            oq_year = "2017"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_fuzzy_5th_firstsem_2018.setOnClickListener {
            major = "fuzzy"
            oq_year = "2018"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_fuzzy_5th_firstsem_2019.setOnClickListener {
            major = "fuzzy"
            oq_year = "2019"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_embedded_5th_firstsem_2017.setOnClickListener {
            major = "embedded"
            oq_year = "2017"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_embedded_5th_firstsem_2018.setOnClickListener {
            major = "embedded"
            oq_year = "2018"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_embedded_5th_firstsem_2018.setOnClickListener {
            major = "embedded"
            oq_year = "2019"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_img_process_com_vision_5th_firstsem_2017.setOnClickListener {
            major = "img processing"
            oq_year = "2017"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_img_process_com_vision_5th_firstsem_2018.setOnClickListener {
            major = "img processing"
            oq_year = "2018"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
        btn_img_process_com_vision_5th_firstsem_2019.setOnClickListener {
            major = "img processing"
            oq_year = "2019"
            var action = FifthYearDirections.actionFifthYearToViewer(year,major,oq_year,first_sem)
            findNavController().navigate(action)
        }
    }
}