package com.dora2000.ucspyayoq

import android.Manifest
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.karumi.dexter.Dexter
import com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener
import kotlinx.android.synthetic.main.viewer.*

class Viewer : Fragment() {

    val viewer_args: ViewerArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.viewer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var year = viewer_args.year
        var oq_year = viewer_args.oqYear
        var major = viewer_args.major
        var semester = viewer_args.semester
        if (year == 1) {
            if (semester == 1) {
                if (major.equals("myanmar")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("english")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("physics")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("maths")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("pit")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("pdf_sample.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }
            } else if (semester == 2) {
                if (major.equals("myanmar")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("english")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("physics")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("principle of computer science 1")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("adv com application tech")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("maths")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }
            }

        }
        else if (year == 2) {
            if (semester == 1) {
                if (major.equals("english")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("maths")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("java")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("digital")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("dbms")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }

                }
            } else if (semester == 2) {
                if (major.equals("english")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("java")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("maths")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("advanced data structure")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("ooad")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("js")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("se+sad")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("sad")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("digital system design")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("e-circuits 1")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }
            }
        }
        else if (year == 3) {
            if (semester == 1) {
                if (major.equals("english")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("stco")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("maths")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("dcom")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("se")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("computer_app_tech")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("adv_app_tech")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("electronic")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("linear_control_system")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("e_circuit2")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }
            } else if (semester == 2) {
                if (major.equals("english")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("operating systems")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("maths")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("networking")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("dbms")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("computer application techniques 3")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("electronic 2")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("computer architecture 1")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("microprocessor")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }
            }
        }
        else if (year == 4) {
            if (semester == 1) {
                if (major.equals("english")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("ai")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("maths")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("aa")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("dbms")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("se")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("or")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("intro_microcontrollers")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("com_archi2")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("control_sys2")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("com_network2")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }
            } else if(semester == 2){
                if(major.equals("english")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("ecommerce")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("maths")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("operating system")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("is-mis")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("uml")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("computer graphic")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("dbms")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("embedded system")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("computer architecture 2")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("cryptography")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if(major.equals("computer security")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test_pdf.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }
            }
        } else if (year == 5) {
            if (semester == 1) {
                if (major.equals("english")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("maths")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("dis_com")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("inform_sec_it_risk")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("com_app_algs")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("data_mining")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("web_eng")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                } else if (major.equals("erp")) {
                    when (oq_year) {
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if (major.equals("fuzzy")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if (major.equals("embedded")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }else if (major.equals("img processing")){
                    when(oq_year){
                        "2017" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2018" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                        "2019" -> {
                            pdf_view.fromAsset("test.pdf")
                                .password(null)
                                .defaultPage(0)
                                .enableSwipe(true)
                                .swipeHorizontal(false)
                                .enableDoubletap(true)
                                .onDraw { canvas, pageWidth, pageHeight, displayedPage ->
                                }
                                .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->
                                    //code
                                }
                                .onPageChange { page, pageCount ->
                                    //code
                                }
                                .onPageError { page, t ->
                                    Toast.makeText(
                                        context,
                                        "Error with this page",
                                        Toast.LENGTH_LONG
                                    )
                                        .show()
                                    Log.d("ERROR:>>>>>>", t.localizedMessage)
                                }
                                .onTap { false }
                                .onRender { nbPages, pageWidth, pageHeight ->
                                    pdf_view.fitToWidth()
                                }
                                .enableAnnotationRendering(true)
                                .invalidPageColor(Color.RED)
                                .load()
                        }
                    }
                }
            }
        }
    }
}
