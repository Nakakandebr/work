package com.project.finalprojectsakigake.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.finalprojectsakigake.Database.Resource
import com.project.finalprojectsakigake.databinding.ItemButtonBinding
import com.project.finalprojectsakigake.databinding.ResourcelistBinding

class ResourceAdapter (val resource: List<Resource>) : RecyclerView.Adapter<ResourceAdapter.ResourceViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ResourceViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemButtonBinding.inflate(inflater, parent, false)
        return ResourceViewHolder(binding)

        
    }

    override fun getItemCount() = resource.size

    override fun onBindViewHolder(holder: ResourceAdapter.ResourceViewHolder, position: Int) {
        val resources = resource[position]
        holder.bind(resources)
        holder.itemView.setOnClickListener {

        }

    }

    class ResourceViewHolder(val binding: ItemButtonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(resource: Resource) {
            binding.btnResources.text = resource.name

        }


}
}

