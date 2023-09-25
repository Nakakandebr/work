package com.project.finalprojectsakigake.ui

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.ActivityEditAssignmentBinding
import java.util.Calendar
import java.util.Locale

class EditAssignment : AppCompatActivity() {
    lateinit var binding: ActivityEditAssignmentBinding
    private lateinit var editTextDate: EditText
    private val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditAssignmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        editTextDate = binding.editTextDate
    }

    override fun onResume() {
        super.onResume()
        binding.btnPostAssignment.setOnClickListener {
            val intent = Intent(this, ShopsActivity::class.java)
            startActivity(intent)
        }
        binding.ivcancel.setOnClickListener {
            val intent = Intent(this, SubjectChoosenAssignments::class.java)
            startActivity(intent)
        }
    }

    fun showDatePickerDialog(view: View) {
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDay ->
                editTextDate.setText(
                    String.format(
                        Locale.getDefault(),
                        "%02d/%02d/%04d",
                        selectedDay,
                        selectedMonth + 1,
                        selectedYear
                    )
                )
            },
            year,
            month,
            day
        )

        datePickerDialog.show()
    }
}
