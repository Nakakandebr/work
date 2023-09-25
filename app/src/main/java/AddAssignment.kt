//import android.content.Intent
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.content.ContextCompat.startActivity
//import com.project.finalprojectsakigake.databinding.ActivityAddAssignmentBinding
//import com.project.finalprojectsakigake.models.Topics
//
//class AddAssignment : AppCompatActivity() {
//    lateinit var binding: ActivityAddAssignmentBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityAddAssignmentBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        val recyclerView = binding.rvAssignmentTopics
//        val topics = listOf(
//            Topics("Plants - ", "Due: 10th Nov", "In this assignment, you will explore the world of plants and learn about their basic needs for growth.", "Posted at 25/12/2023"),
//            Topics("Animals - ", "Due: 10th Nov", "In this assignment, you will explore the world of plants and learn about their basic needs for growth.", "Posted at 25/12/2023"),
//            Topics("Farm Tools - ", "Due: 10th Nov", "In this assignment, you will explore the world of plants and learn about their basic needs for growth", "Posted at 25/12/2023"),
//            Topics("Weeds - ", "Due: 10th Nov", "In this assignment, you will explore the world of plants and learn about their basic needs for growth.", "Posted at 25/12/2023")
//        )
//
//        val adapter = SubjectChoosenAssignmentsAdapter(topics)
//        recyclerView.adapter = adapter
//
//        binding.imgBack.setOnClickListener {
//            val intent = Intent(this, ChildGrade::class.java)
//            startActivity(intent)
//        }
//    }
//}