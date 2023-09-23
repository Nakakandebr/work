////package com.project.finalprojectsakigake.ui
////
////import android.view.LayoutInflater
////import android.view.ViewGroup
////import androidx.recyclerview.widget.RecyclerView
////import com.project.finalprojectsakigake.Database.Subjects
////import com.project.finalprojectsakigake.R
////import com.squareup.picasso.Picasso
////import com.project.finalprojectsakigake.databinding.AssignmentListItemBinding
////
////class SubjectAdapter(private val subjects: List<Subjects>) : RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>() {
////
////    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
////        val inflater = LayoutInflater.from(parent.context)
////        val binding = AssignmentListItemBinding.inflate(inflater, parent, false)
////        return SubjectViewHolder(binding)
////    }
////
////    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
////        val subject = subjects[position]
////        holder.bind(subject)
////    }
////
////    override fun getItemCount() = subjects.size
////    class SubjectViewHolder(private val binding: AssignmentListItemBinding) : RecyclerView.ViewHolder(binding.root) {
////        fun bind(subject: Subjects) {
////            binding.tvSubjectName.text = subject.subjectName
////            Picasso.get()
////                .load(subject.subjectImageUrl)
////                .error(R.drawable.english_image)
////                .into(binding.imgSubject)
////            binding.tvSubjectTeacherName.text = subject.subjectTeacherName
////        }
////    }
////}
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.project.finalprojectsakigake.models.Topics
//import com.project.finalprojectsakigake.databinding.SubjectChoosenAssignmentItemBinding
//
//class SubjectChoosenAssignmentsAdapter(val topics: List<Topics>) : RecyclerView.Adapter<SubjectChoosenAssignmentsAdapter.SubjectChoosenAssignmentViewHolder>(){
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): SubjectChoosenAssignmentViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = SubjectChoosenAssignmentItemBinding.inflate(inflater, parent, false)
//        return SubjectChoosenAssignmentViewHolder(binding)
//    }
//    override fun getItemCount() = topics.size
//
//    override fun onBindViewHolder(holder: SubjectChoosenAssignmentViewHolder, position: Int) {
//        val topics = topics[position]
//        holder.bind(topics)
//        holder.itemView.setOnClickListener {
//
//        }
//
//    }
//
//    class SubjectChoosenAssignmentViewHolder(val binding: SubjectChoosenAssignmentItemBinding) : RecyclerView.ViewHolder(binding.root)
//    {
//        fun bind(topics: Topics) {
//            binding.tvTopicName.text = topics.topicName
//            binding.tvAssignmentDetails.text = topics.assignmentDetails
//            binding.tvDueDate.text = topics.dueDate
//            binding.tvPostedAtTime.text = topics.postedAt
//
//        }
//
//    }}